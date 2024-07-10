package com.springboot_api.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.springboot_api.app.entity.TipoPago;

public interface TipoPagoService {
	
	public Iterable<TipoPago> findAll();
	
	public Page<TipoPago> findAll(Pageable pageable);
	
	public Optional<TipoPago> findById(Long id);
	
	public TipoPago save(TipoPago tipopago);
	
	public void deleteById(Long id);

}