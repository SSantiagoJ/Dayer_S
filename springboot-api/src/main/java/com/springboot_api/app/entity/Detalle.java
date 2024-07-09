package com.springboot_api.app.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class Detalle implements Serializable{
	private static final long serialVersionUID = 5505413102684540675L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdDetalle;
	private Long IdPedidoVenta;
	private Long IdProducto;
	private Long Cantidad;
	private Double Precio;
	private Double SubTotal;
	public Long getIdDetalle() {
		return IdDetalle;
	}
	public void setIdDetalle(Long idDetalle) {
		IdDetalle = idDetalle;
	}
	public Long getIdPedidoVenta() {
		return IdPedidoVenta;
	}
	public void setIdPedidoVenta(Long idPedidoVenta) {
		IdPedidoVenta = idPedidoVenta;
	}
	public Long getIdProducto() {
		return IdProducto;
	}
	public void setIdProducto(Long idProducto) {
		IdProducto = idProducto;
	}
	public Double getPrecio() {
		return Precio;
	}
	public void setPrecio(Double precio) {
		Precio = precio;
	}
	public Double getSubTotal() {
		return SubTotal;
	}
	public void setSubTotal(Double subTotal) {
		SubTotal = subTotal;
	}
	
}
