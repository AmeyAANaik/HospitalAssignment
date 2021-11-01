package com.north.Hospital.configuration;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.north.Hospital.domain.Hospital;
import com.north.Hospital.sevices.HospitalRepository;


@JsonIgnoreProperties
@Configuration
public class HospitalConfiguration {
	private static final Logger log = LoggerFactory.getLogger(HospitalConfiguration.class);
	
	@Bean
	public CommandLineRunner runner(HospitalRepository repository)
	{
		log.info("Started Debuging the string ");
      		
		return args -> {
			//Read all the json from the file
				
			
			ObjectMapper mapper = new ObjectMapper();
			TypeReference <List<Hospital>> typeReference = new TypeReference<List<Hospital>>() {};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/hospital.json");
			List<Hospital> listHospital = mapper.readValue(inputStream, typeReference);
		    repository.saveAll(listHospital);
		    repository.flush();   
			log.info("preloading the json file in to the H2 database "+repository.findAll());
		
		};
		
	}

	
	
}
