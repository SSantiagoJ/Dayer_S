package com.springboot_api.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot_api.app.entity.Carrito_Contacto;
import com.springboot_api.app.repository.Carrito_ContactoRepository;

@Service
public class Carrito_ContactoServiceImpl implements Carrito_ContactoService {
	@Autowired
	private Carrito_ContactoRepository carrito_ContactoRepository;
	
	@Override
	@Transactional(readOnly=true)
	public Iterable<Carrito_Contacto> findAll() {
		return carrito_ContactoRepository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Page<Carrito_Contacto> findAll(Pageable pageable) {
		return carrito_ContactoRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<Carrito_Contacto> findById(Long id) {
		return carrito_ContactoRepository.findById(id);
	}

	@Override
	@Transactional
	public Carrito_Contacto save(Carrito_Contacto carrito_contacto) {
		return carrito_ContactoRepository.save(carrito_contacto);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		carrito_ContactoRepository.deleteById(id);

	}

}
