package com.compras.core.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.compras.core.converter.ConverterProducto;
import com.compras.core.entity.Producto;
import com.compras.core.model.MProducto;
import com.compras.core.repository.RepositorioProducto;


@Service("servicioProducto")
public class ServiceProducto {
	@Autowired
	@Qualifier("repositorioProducto")
	private RepositorioProducto repositorioProducto; 
	
	@Autowired
	@Qualifier("convertidorProducto")
	private ConverterProducto convertidorProducto;
	
private static final Log logger = LogFactory.getLog(ServiceProducto.class);
	
	public boolean crear(Producto producto) {
		logger.info("CREANDO PRODUCTO");
		try {
			repositorioProducto.save(producto);
			logger.info("PRODUCTO CREADO");
			return true;
		}catch(Exception e) {
			logger.error("HUBO UN ERROR");
			return false;
		}
	}
	public boolean actualizar(Producto producto) {
		logger.info("ACTUALIZANDO PRODUCTO");
		try {
			repositorioProducto.save(producto);
			logger.info("PRODUCTO ACTUALIZADO");
			return true;
		}catch(Exception e) {
			logger.error("HUBO UN ERROR");
			return false;
		}
	}
	public boolean borrar(String nombre, long id) {
		logger.warn("ELIMINANDO PRODUCTO");
		try {
		Producto producto =	repositorioProducto.findByNombreAndId(nombre, id);
		repositorioProducto.delete(producto);
		logger.info("PRODUCTO ELIMINADO");
		return true;
		}catch(Exception e) {
			logger.error("HUBO UN ERROR");
			return false;
		}
	}
	
	public List<MProducto> obtener(){
		logger.info("OBTENIENDO TODA LA LISTA");
		return convertidorProducto.convertirLista(repositorioProducto.findAll());
	}
	//public MProducto obtenerPorNombreAndNomUsuario(String nombre, String nombre_user) {
		//return new MProducto(repositorioProducto.findByNombreAndNombre_User(nombre, nombre_user));
	//}
	//public List<MProducto> obtenerNomUsuario(String nombre_user){
		//return convertidorProducto.convertirLista(repositorioProducto.findByNombre_User(nombre_user));
	//}
	public MProducto obtenerNombre(String nombre) {
		return new MProducto(repositorioProducto.findByNombre(nombre));
	}
	public MProducto obtenerNombreId(String nombre, long id) {
		return new MProducto(repositorioProducto.findByNombreAndId(nombre, id));
	}
	public List<MProducto> obtenerPorPaginacion(Pageable pageable){
		return convertidorProducto.convertirLista(repositorioProducto.findAll(pageable).getContent());
	}
}
