package com.compras.core.model;

import com.compras.core.entity.Usuario;

public class MUsuario {
	
	
	public MUsuario() {
		super();
	}

	public MUsuario(Usuario usuario) {
		this.id = usuario.getId();
		this.dni= usuario.getDni();
		this.nombre =usuario.getNombre() ;
		this.clave = usuario.getClave();
		this.celular = usuario.getCelular();
		this.rol = usuario.getRol();
	}

	public MUsuario(long id, String nombre, String dni, String clave, String celular, byte rol) {
		super();
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.clave = clave;
		this.celular = celular;
		this.rol = rol;
	}
	private long id;
	private String nombre;
	private String dni;
	private String clave;
	private String celular;
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
