package com.sample.SpringRestSample;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sample.SpringRestSample.model.Aircraft;

public interface CroDao extends JpaRepository<Aircraft, Integer> {

	
	List<Aircraft> findByAircraftCd(String acCd);
	
	List<Aircraft> findByaircraftIdGreaterThan(int aid);
	
	List<Aircraft> findByaircraftIdLessThan(int aid);
	
	@Query("from Aircraft where aircraftCd=?1 order by aircraftCd")
	List<Aircraft> findByAircraftCdSorted(String acCd);

}
