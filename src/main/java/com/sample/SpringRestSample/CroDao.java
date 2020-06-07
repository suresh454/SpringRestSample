package com.sample.SpringRestSample;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.SpringRestSample.model.Aircraft;

public interface CroDao extends JpaRepository<Aircraft, Integer> {

}
