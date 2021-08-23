package com.compras.core.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compras.core.entity.Producto;
import com.compras.core.model.MProducto;
import com.compras.core.service.ServiceProducto;


@RestController
@RequestMapping("/v1")
public class ProductoController {
	@Autowired
	@Qualifier("servicioProducto")
	ServiceProducto serviceprod;
	
	@PostMapping("/producto")
	public boolean agregarProducto(@RequestBody @Valid Producto prod) {
		return serviceprod.crear(prod);
	}
	@PutMapping("/producto")
	public boolean actualizarProducto(@RequestBody @Valid Producto prod) {
		return serviceprod.actualizar(prod);
	}
	@DeleteMapping("/producto/{id}/{nombre}")
	public boolean borrarProducto(@PathVariable ("id") long id, @PathVariable ("nombre") String nombre) {
		return serviceprod.borrar(nombre, id);
	}
	@GetMapping("/productos")
	public List<MProducto> obtenerProductos(Pageable pageable){
		return serviceprod.obtenerPorPaginacion(pageable);
	}
}
