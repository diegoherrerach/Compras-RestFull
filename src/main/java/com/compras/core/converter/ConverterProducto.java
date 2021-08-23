package com.compras.core.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.compras.core.entity.Producto;
import com.compras.core.model.MProducto;



@Component("convertidorProducto")
public class ConverterProducto {
	public List<MProducto> convertirLista(List<Producto> prod){
		List<MProducto> mprod= new ArrayList<>();
		for(Producto producto : prod) {
			mprod.add(new MProducto (producto));
		}
		return mprod;
	}
}
