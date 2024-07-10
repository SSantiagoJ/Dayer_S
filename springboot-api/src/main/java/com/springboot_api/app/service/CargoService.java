package com.springboot_api.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.springboot_api.app.entity.Cargo;

public interface CargoService {
	
	public Iterable<Cargo> findAll();
	
	public Page<Cargo> findAll(Pageable pageable);
	
	public Optional<Cargo> findById(Long id);
	
	public Cargo save(Cargo cargo);
	
	public void deleteById(Long id);

}
