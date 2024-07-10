package com.springboot_api.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot_api.app.entity.Carrito_Direccion;
@Repository
public interface Carrito_DireccionRepository extends JpaRepository<Carrito_Direccion, Long>{

}
