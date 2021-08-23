package com.compras.core.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.compras.core.entity.Usuario;
import com.compras.core.model.MUsuario;

@Component("convertidorUsuario")
public class ConverterUsuario {
		public List<MUsuario> convertirLista(List<Usuario> user){
			List<MUsuario> muser= new ArrayList<>();
			for(Usuario usuario : user) {
				muser.add(new MUsuario(usuario));
			}
			return muser;
		}
	

}
