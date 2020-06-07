package com.sample.SpringRestSample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.SpringRestSample.model.Aircraft;

@RestController
public class CroController {

	@Autowired
	CroDao crodao;
	
	@GetMapping("/aircrafts")
	public List<Aircraft> getAircrafts(){
		List<Aircraft> acs=crodao.findAll();
		return acs;
	}
	
	@GetMapping("/aircraft/{aid}")
	public Aircraft getAircraft(@PathVariable int aid) {
		Aircraft ac=crodao.findById(aid).orElse(new Aircraft());
		return ac;
	}
	
	@PostMapping("/aircraft")
	public Aircraft saveAircraft(@RequestBody Aircraft ac) {
		Aircraft ac1=crodao.save(ac);
		return ac1;
	}
	
	
	@PutMapping("/aircraft")
	public Aircraft saveOrUpdateAircraft(@RequestBody Aircraft ac) {
		 crodao.save(ac);
		return ac;
	}
	
	
	@DeleteMapping("/aircraft/{aid}")
	public String deleteAircraft(@PathVariable("aid") int aid) {
		crodao.deleteById(aid);
		return "Deleted";
	}
	
	
	@GetMapping("/aircraftCd/{acCd}")
	public List<Aircraft> getbyAircraftCd(@PathVariable String acCd){
		List<Aircraft> acs=crodao.findByAircraftCd(acCd);
		
		return acs;
	}
	
	@GetMapping("/aircraftgreaterthan/{acId}")
	public List<Aircraft> getbyAircraftIdGreaterThan(@PathVariable int acId){
		List<Aircraft> acs=crodao.findByaircraftIdGreaterThan(acId);
		
		return acs;
	}
	
	
	@GetMapping("/aircraftlessthan/{acId}")
	public List<Aircraft> getbyAircraftIdLessThan(@PathVariable int acId){
		List<Aircraft> acs=crodao.findByaircraftIdLessThan(acId);
		
		return acs;
	}
	
	
	@GetMapping("/aircraftsorted/{acCd}")
	public List<Aircraft> getbyAircraftsorted(@PathVariable String acCd){
		List<Aircraft> acs=crodao.findByAircraftCdSorted(acCd);
		
		return acs;
	}
	
	
}
