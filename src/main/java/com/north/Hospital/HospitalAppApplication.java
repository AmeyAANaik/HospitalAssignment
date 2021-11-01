package com.north.Hospital;

import java.io.IOException;
import java.io.InputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.north.Hospital.sevices.HospitalRepository;
import java.util.List;
import com.north.Hospital.domain.*;

@SpringBootApplication
public class HospitalAppApplication {

	 private static final Logger log = LoggerFactory.getLogger(HospitalAppApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(HospitalAppApplication.class, args);
	}
	

}
