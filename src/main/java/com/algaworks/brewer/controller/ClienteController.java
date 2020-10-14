package com.algaworks.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
	
	private static final String VIEW_CADASTRO = "cliente/cadastro-cliente";
	
	@RequestMapping(method = RequestMethod.GET, value = "/novo")
	public String novo() {
		return VIEW_CADASTRO;
	}

}
