package com.springboot_api.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot_api.app.entity.Carrito;
import com.springboot_api.app.repository.CarritoRepository;

@Service
public class CarritoServiceImpl implements  CarritoService{

	@Autowired
	private CarritoRepository carritoRepository;
	
	@Override
	@Transactional(readOnly=true)
	public Iterable<Carrito> findAll() {
		return carritoRepository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Page<Carrito> findAll(Pageable pageable) {
		return carritoRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<Carrito> findById(Long id) {
		return carritoRepository.findById(id);
	}

	@Override
	@Transactional
	public Carrito save(Carrito carrito) {
		return carritoRepository.save(carrito);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		carritoRepository.deleteById(id);
	}

}
