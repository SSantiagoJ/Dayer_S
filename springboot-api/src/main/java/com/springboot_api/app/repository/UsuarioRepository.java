package com.springboot_api.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot_api.app.entity.Usuario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
