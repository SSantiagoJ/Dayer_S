package com.springboot_api.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot_api.app.entity.Detalle;
@Repository
public interface DetalleRepository extends JpaRepository<Detalle, Long>{

}
