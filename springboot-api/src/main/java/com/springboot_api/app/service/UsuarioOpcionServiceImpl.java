package com.springboot_api.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot_api.app.entity.UsuarioOpcion;
import com.springboot_api.app.repository.UsuarioOpcionRepository;

@Service
public class UsuarioOpcionServiceImpl implements UsuarioOpcionService{

	@Autowired
	private UsuarioOpcionRepository usuarioOpcionRepository;
	
	@Override
	@Transactional(readOnly=true)
	public Iterable<UsuarioOpcion> findAll() {
		return usuarioOpcionRepository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Page<UsuarioOpcion> findAll(Pageable pageable) {
		return usuarioOpcionRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<UsuarioOpcion> findById(Long id) {
		return usuarioOpcionRepository.findById(id);
	}

	@Override
	@Transactional
	public UsuarioOpcion save(UsuarioOpcion usuarioopcion) {
		return usuarioOpcionRepository.save(usuarioopcion);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		usuarioOpcionRepository.deleteById(id);
	}

}
