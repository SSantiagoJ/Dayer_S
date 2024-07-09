package com.springboot_api.app.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="carrito_direccion")
public class Carrito_Direccion implements Serializable{

	private static final long serialVersionUID = 5505413102684540675L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdCarritoDireccion;
	
	private Long IdCarrito;
	private Long IdTipoDireccion;
	private String Calle;
	private String Direccion;
	
	@Column(length=80)
	private String Distrito;
	private String CodigoPostal;
	private String Ciudad;
	private String Pais;
	public Long getIdCarritoDireccion() {
		return IdCarritoDireccion;
	}
	public void setIdCarritoDireccion(Long idCarritoDireccion) {
		IdCarritoDireccion = idCarritoDireccion;
	}
	public Long getIdCarrito() {
		return IdCarrito;
	}
	public void setIdCarrito(Long idCarrito) {
		IdCarrito = idCarrito;
	}
	public Long getIdTipoDireccion() {
		return IdTipoDireccion;
	}
	public void setIdTipoDireccion(Long idTipoDireccion) {
		IdTipoDireccion = idTipoDireccion;
	}
	public String getCalle() {
		return Calle;
	}
	public void setCalle(String calle) {
		Calle = calle;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getDistrito() {
		return Distrito;
	}
	public void setDistrito(String distrito) {
		Distrito = distrito;
	}
	public String getCodigoPostal() {
		return CodigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		CodigoPostal = codigoPostal;
	}
	public String getCiudad() {
		return Ciudad;
	}
	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}
	public String getPais() {
		return Pais;
	}
	public void setPais(String pais) {
		Pais = pais;
	}
	
}
