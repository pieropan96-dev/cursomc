package com.pieropan.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pieropan.cursomc.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResources {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar() {
			Categoria categoria = new Categoria(null,"Informática");
			Categoria categoria2 = new Categoria(null,"Escritório");
			List<Categoria> lista = new ArrayList<>();
			lista.add(categoria); 
			lista.add(categoria2);
			return lista;
	}
}