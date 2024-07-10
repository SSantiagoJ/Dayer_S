package com.springboot_api.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot_api.app.entity.Carrito_Detalle;
import com.springboot_api.app.repository.Carrito_DetalleRepository;

@Service
public class Carrito_DetalleServiceImpl implements Carrito_DetalleService{

	@Autowired
	private Carrito_DetalleRepository carrito_DetalleRepository;
	
	@Override
	@Transactional(readOnly=true)
	public Iterable<Carrito_Detalle> findAll() {
		return carrito_DetalleRepository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Page<Carrito_Detalle> findAll(Pageable pageable) {
		return carrito_DetalleRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<Carrito_Detalle> findById(Long id) {
		return carrito_DetalleRepository.findById(id);
	}

	@Override
	@Transactional
	public Carrito_Detalle save(Carrito_Detalle carrito_detalle) {
		return carrito_DetalleRepository.save(carrito_detalle);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		carrito_DetalleRepository.deleteById(id);
	}

}
