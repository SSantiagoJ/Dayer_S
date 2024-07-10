package com.springboot_api.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot_api.app.entity.Carrito_Direccion;
import com.springboot_api.app.repository.Carrito_DireccionRepository;

@Service
public class Carrito_DireccionServiceImpl implements Carrito_DireccionService{

	@Autowired
	private Carrito_DireccionRepository carrito_DireccionRepository;
	
	@Override
	@Transactional(readOnly=true)
	public Iterable<Carrito_Direccion> findAll() {
		return carrito_DireccionRepository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Page<Carrito_Direccion> findAll(Pageable pageable) {
		return carrito_DireccionRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<Carrito_Direccion> findById(Long id) {
		return carrito_DireccionRepository.findById(id);
	}

	@Override
	@Transactional
	public Carrito_Direccion save(Carrito_Direccion carrito_direccion) {
		return carrito_DireccionRepository.save(carrito_direccion);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		carrito_DireccionRepository.deleteById(id);
	}

}
