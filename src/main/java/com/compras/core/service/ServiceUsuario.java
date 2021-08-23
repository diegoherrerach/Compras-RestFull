package com.compras.core.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.compras.core.converter.ConverterUsuario;
import com.compras.core.entity.Usuario;
import com.compras.core.model.MUsuario;
import com.compras.core.repository.RepositorioUsuario;



@Service("servicioUsuario")
public class ServiceUsuario {

	@Autowired
	@Qualifier("repositorioUsuario")
	private RepositorioUsuario repositorioUsuario; 
	
	@Autowired
	@Qualifier("convertidorUsuario")
	private ConverterUsuario convertidorUsuario;
	
private static final Log logger = LogFactory.getLog(ServiceUsuario.class);
	
	public boolean crear(Usuario usuario) {
		logger.info("CREANDO USUARIO");
		try {
			repositorioUsuario.save(usuario);
			logger.info("USUARIO CREADO");
			return true;
		}catch(Exception e) {
			logger.error("HUBO UN ERROR");
			return false;
		}
	}
	public boolean actualizar(Usuario usuario) {
		logger.info("ACTUALIZANDO USUARIO");
		try {
			repositorioUsuario.save(usuario);
			logger.info("USUARIO ACTUALIZADO");
			return true;
		}catch(Exception e) {
			logger.error("HUBO UN ERROR");
			return false;
		}
	}
	public boolean borrar(String nombre, long id) {
		logger.warn("ELIMINANDO NOTA");
		try {
		Usuario usuario =	repositorioUsuario.findByNombreAndId(nombre, id);
		repositorioUsuario.delete(usuario);
		logger.info("NOTA ELIMINADA");
		return true;
		}catch(Exception e) {
			logger.error("HUBO UN ERROR");
			return false;
		}
	}
	
	public List<MUsuario> obtener(){
		logger.info("OBTENIENDO TODA LA LISTA");
		return convertidorUsuario.convertirLista(repositorioUsuario.findAll());
	}
	public MUsuario obtenerPorNombreDni(String nombre, String dni) {
		return new MUsuario(repositorioUsuario.findByNombreAndDni(nombre, dni));
	}
	public List<MUsuario> obtenerDni(String dni){
		return convertidorUsuario.convertirLista(repositorioUsuario.findByDni(dni));
	}
	public MUsuario obtenerNombre(String nombre) {
		return new MUsuario(repositorioUsuario.findByNombre(nombre));
	}
	public MUsuario obtenerNombreId(String nombre, long id) {
		return new MUsuario(repositorioUsuario.findByNombreAndId(nombre, id));
	}
	public List<MUsuario> obtenerPorPaginacion(Pageable pageable){
		return convertidorUsuario.convertirLista(repositorioUsuario.findAll(pageable).getContent());
	}
	
}
