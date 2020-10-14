package com.algaworks.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

	private static final String VIEW_CADASTRO = "usuario/cadastro-usuario";
	
	@RequestMapping(method = RequestMethod.GET, value = "/novo")
	public String novo() {
		return VIEW_CADASTRO;
	}
	
}
