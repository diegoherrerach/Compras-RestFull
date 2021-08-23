package com.compras.core.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.compras.core.entity.Producto;

@Repository("repositorioProducto")

public interface RepositorioProducto extends JpaRepository<Producto, Serializable>
,  PagingAndSortingRepository<Producto, Serializable>{

	public abstract Producto findByNombre(String nombre);
	//public abstract List<Producto> findByNombre_User(String nombre_user);
	//public abstract Producto findByNombreAndNombre_User(String nombre,String nombre_user);
	public abstract Producto findByNombreAndId(String Nombre, long id);
	public abstract Page<Producto> findAll(Pageable pageable);
}
