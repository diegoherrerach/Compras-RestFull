package com.compras.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="PRODUCTO")
public class Producto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@GeneratedValue
	@Id
	@Column(name="ID_PRODUCTO")
	private long id;
	@Column(name="NOMBRE")
	private String nombre;
	@Column(name="PRECIO")
	private double precio;
	@Column(name="CODIGO")
	private String codigo;
	@Column(name="NOM_USER")
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
