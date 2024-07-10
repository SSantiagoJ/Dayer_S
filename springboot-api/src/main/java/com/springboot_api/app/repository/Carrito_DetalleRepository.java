package com.springboot_api.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot_api.app.entity.Carrito_Detalle;

@Repository
public interface Carrito_DetalleRepository extends JpaRepository<Carrito_Detalle, Long>{

}
