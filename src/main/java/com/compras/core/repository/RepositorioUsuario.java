package com.compras.core.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.compras.core.entity.Usuario;

@Repository("repositorioUsuario")
public interface RepositorioUsuario extends JpaRepository<Usuario, Serializable>, PagingAndSortingRepository<Usuario, Serializable>  {

	public abstract Usuario findByNombre(String nombre);
	public abstract List<Usuario> findByDni(String dni);
	public abstract Usuario findByNombreAndDni(String nombre,String dni);
	public abstract Usuario findByNombreAndId(String Nombre, long id);
	public abstract Page<Usuario> findAll(Pageable pageable);
	
}
