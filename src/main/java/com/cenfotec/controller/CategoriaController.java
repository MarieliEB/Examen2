package com.cenfotec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.cenfotec.domain.Categoria;
import com.cenfotec.service.CategoriaService;

@Controller
public class CategoriaController {

	
	@Autowired
	CategoriaService categoriaService;
	
	@RequestMapping(value = "/insertarCategoria",  method = RequestMethod.GET)
	public String insertarPage(Model model) {
		model.addAttribute(new Categoria());
		return "insertarCategoria";
	}	
	
	@RequestMapping(value = "/insertarCategoria",  method = RequestMethod.POST)
	public String insertarAction(Categoria categoria, BindingResult result, Model model) {
		categoriaService.save(categoria);
		return "listarCategorias";
	}
	
	@RequestMapping("/listarCategorias")
	public String listar(Model model) {
		model.addAttribute("categorias",categoriaService.getAll());
		return "listarCategorias";
	}
}
