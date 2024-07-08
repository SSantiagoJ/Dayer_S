package com.sublimado.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.sublimado.app.entity.User;

public interface UserService {

	public Iterable<User> findAll();
	
	public Page<User> findAll(Pageable pageable);
	
	public Optional<User> findbyId(Long id);
	
	public  User save(User user);
	
	public void deleteById(Long id);
}
