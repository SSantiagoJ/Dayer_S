package com.springboot_api.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.springboot_api.app.entity.Cliente;

public interface ClienteService {
	
	public Iterable<Cliente> findAll();
	
	public Page<Cliente> findAll(Pageable pageable);
	
	public Optional<Cliente> findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void deleteById(Long id);

}