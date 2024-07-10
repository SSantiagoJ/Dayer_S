package com.springboot_api.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot_api.app.entity.Opcion;
import com.springboot_api.app.repository.OpcionRepository;

@Service
public class OpcionServiceImpl implements OpcionService{

	@Autowired
	private OpcionRepository opcionRepository;
	
	@Override
	@Transactional(readOnly=true)
	public Iterable<Opcion> findAll() {
		return opcionRepository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Page<Opcion> findAll(Pageable pageable) {
		return opcionRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<Opcion> findById(Long id) {
		return opcionRepository.findById(id);
	}

	@Override
	@Transactional
	public Opcion save(Opcion opcion) {
		return opcionRepository.save(opcion);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		opcionRepository.deleteById(id);
	}

}
