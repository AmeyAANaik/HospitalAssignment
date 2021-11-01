package com.north.Hospital.Controler;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.north.Hospital.Exception.HospitalNotFoundException;
import com.north.Hospital.domain.Hospital;
import com.north.Hospital.sevices.HospitalRepository;

@RestController
public class HospitalControler {

	private final HospitalRepository repository;
	
	
	
	public HospitalControler(HospitalRepository repository) {
		super();
		this.repository = repository;
	}


	//@ResponseStatus(code = HttpStatus.OK,reason="to fetch all the hospital")
	@GetMapping("/getAllHospital")
	List<Hospital> all()
	{
		return repository.findAll(); 
	}
	
	//@ResponseStatus(code = HttpStatus.OK,reason="fetched hospital by id")
	@GetMapping("/getHospital/{id}")
	Hospital getHospitalByID(@PathVariable String id)
	{
		return repository.findById(id).orElseThrow(()->new HospitalNotFoundException("HospitalNotFound by search by hospitalID {} ".format(id)));
	}
	
	@GetMapping("/getHospitalByNameAndState")
	//@ResponseStatus(code = HttpStatus.OK,reason="fetched hospital by hospital Name and state Name ")
	List<Hospital> getHospitableByIdAndName(@RequestParam(value="hospitalName",required=true) String hospitalName, 
			                             @RequestParam(value="stateName" , required=true) String stateName) {
		
       	
       	
		List<Hospital> listHospital =  repository.findAll().parallelStream().filter(
				            hospitaObj -> 
				                    hospitaObj.getHospname().equals(hospitalName)  && hospitaObj.getState().equals(stateName)  
				                   ).collect(Collectors.toList());//.collect(Collectors.toList());
		
		if (listHospital == null)
		{
			 throw new HospitalNotFoundException("HospitalNotFound by search by hospitalName {} and stateName{} ".format(hospitalName, stateName));
		}
		
		
	    return listHospital;
	}

	@GetMapping("/getHospitalByTypeAndName")
	List<Hospital> getHospitableByTypeAndName(@RequestParam(value="hospitalType",required=true) String hospitalType, 
			                             @RequestParam(value="hospitalName" , required=true) String hospitalName) {
		
       	
       	
		List<Hospital> listHospital =  repository.findAll().parallelStream().filter(
				            hospitaObj -> 
				                    hospitaObj.getHosptype().equals(hospitalType)  && hospitaObj.getHospname().equals(hospitalName)  
				                   ).collect(Collectors.toList());//.collect(Collectors.toList());
		
		if (listHospital == null)
		{
			 throw new HospitalNotFoundException("HospitalNotFound by search by hospitalType {} and hospitalName{} ".format(hospitalType, hospitalName));
		}
		
	    return listHospital;
	}
	
	
}
