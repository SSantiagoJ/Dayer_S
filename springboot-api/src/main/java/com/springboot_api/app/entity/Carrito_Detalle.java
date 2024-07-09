package com.springboot_api.app.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="carrito_detalle")
public class Carrito_Detalle implements Serializable{
	
	private static final long serialVersionUID = 5505413102684540675L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdCarritoDetalle;
	private Long IdCarrito;
	private Long IdProducto;
	public Long getIdCarritoDetalle() {
		return IdCarritoDetalle;
	}
	public void setIdCarritoDetalle(Long idCarritoDetalle) {
		IdCarritoDetalle = idCarritoDetalle;
	}
	public Long getIdCarrito() {
		return IdCarrito;
	}
	public void setIdCarrito(Long idCarrito) {
		IdCarrito = idCarrito;
	}
	public Long getIdProducto() {
		return IdProducto;
	}
	public void setIdProducto(Long idProducto) {
		IdProducto = idProducto;
	} 
}
