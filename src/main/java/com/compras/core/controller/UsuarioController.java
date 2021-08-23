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

import com.compras.core.entity.Usuario;
import com.compras.core.model.MUsuario;
import com.compras.core.service.ServiceUsuario;


@RestController
@RequestMapping("/v1")
public class UsuarioController {

		@Autowired
		@Qualifier("servicioUsuario")
		ServiceUsuario serviceuser;
		
		@PostMapping("/usuario")
		public boolean agregarUsuario(@RequestBody @Valid Usuario user) {
			return serviceuser.crear(user);
		}
		@PutMapping("/usuario")
		public boolean actualizarUsuario(@RequestBody @Valid Usuario user) {
			return serviceuser.actualizar(user);
		}
		@DeleteMapping("/usuario/{id}/{nombre}")
		public boolean borrarUsuario(@PathVariable ("id") long id, @PathVariable ("nombre") String nombre) {
			return serviceuser.borrar(nombre, id);
		}
		@GetMapping("/usuarios")
		public List<MUsuario> obtenerNotas(Pageable pageable){
			return serviceuser.obtenerPorPaginacion(pageable);
		}
}
