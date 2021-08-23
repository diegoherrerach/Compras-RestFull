package com.compras.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Usuario")
public class Usuario implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@GeneratedValue
	@Id
	@Column(name="ID_USUARIO")
	private long id;

	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="DNI")
	private String dni;
	
	@Column(name="CLAVE")
	private String clave;
	
	@Column(name="CELULAR", unique=true)
	private String celular;
	
	@Column(name="ROL")
	private byte rol;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public byte getRol() {
		return rol;
	}
	public void setRol(byte rol) {
		this.rol = rol;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
}
