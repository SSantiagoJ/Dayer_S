package com.springboot_api.app.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="producto")
public class Producto implements Serializable{
	
	private static final long serialVersionUID = 5505413102684540675L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdProducto;
	private Long IdTipoProducto;
	
	@Column(length=80)
	private String Descripcion;
	public Long getIdProducto() {
		return IdProducto;
	}
	public void setIdProducto(Long idProducto) {
		IdProducto = idProducto;
	}
	public Long getIdTipoProducto() {
		return IdTipoProducto;
	}
	public void setIdTipoProducto(Long idTipoProducto) {
		IdTipoProducto = idTipoProducto;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public Double getStock() {
		return Stock;
	}
	public void setStock(Double stock) {
		Stock = stock;
	}
	public Double getPrecio_Uniario() {
		return Precio_Uniario;
	}
	public void setPrecio_Uniario(Double precio_Uniario) {
		Precio_Uniario = precio_Uniario;
	}
	public String getTalla() {
		return Talla;
	}
	public void setTalla(String talla) {
		Talla = talla;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getPresentacion() {
		return Presentacion;
	}
	public void setPresentacion(String presentacion) {
		Presentacion = presentacion;
	}
	private Double Stock;
	private Double Precio_Uniario;
	private String Talla;
	private String Marca;
	private String Presentacion;
	/*private bit Imagen binary(10)*/
}
