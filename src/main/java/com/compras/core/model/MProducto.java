package com.compras.core.model;

import com.compras.core.entity.Producto;

public class MProducto {
	
	

	public MProducto() {
		super();
	}

	public MProducto(Producto producto) {
		this.id = producto.getId();
		this.nombre = producto.getNombre();
		this.precio = producto.getPrecio();
		this.codigo = producto.getCodigo();
		this.nombre_user = producto.getNombre_user();
		
	}

	public MProducto(long id, String nombre, double precio, String codigo, String nombre_user) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
		this.nombre_user = nombre_user;
	}

	private long id;
	
	private String nombre;
	
	private double precio;
	
	private String codigo;
	
	private String nombre_user;

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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre_user() {
		return nombre_user;
	}

	public void setNombre_user(String nombre_user) {
		this.nombre_user = nombre_user;
	}
}
