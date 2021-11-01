package com.north.Hospital.sevices;



import org.springframework.data.jpa.repository.JpaRepository;

import com.north.Hospital.domain.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital,String>  {
	

	

}
