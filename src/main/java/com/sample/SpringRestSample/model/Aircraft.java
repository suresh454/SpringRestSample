package com.sample.SpringRestSample.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aircraft {

	@Id
	private int aircraftId;
	private String aircraftCd;
	
	
	public int getAircraftId() {
		return aircraftId;
	}
	public void setAircraftId(int aircraftId) {
		this.aircraftId = aircraftId;
	}
	public String getAircraftCd() {
		return aircraftCd;
	}
	public void setAircraftCd(String aircraftCd) {
		this.aircraftCd = aircraftCd;
	}
	
	
}
