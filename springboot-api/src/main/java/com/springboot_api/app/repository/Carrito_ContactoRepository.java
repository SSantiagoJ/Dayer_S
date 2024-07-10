package com.springboot_api.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot_api.app.entity.Carrito_Contacto;
@Repository
public interface Carrito_ContactoRepository extends JpaRepository<Carrito_Contacto, Long>{

}
