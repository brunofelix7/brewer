package com.algaworks.brewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.algaworks.brewer.model.Cerveja;

@Controller
@RequestMapping(path = "/cervejas")
public class CervejaController {
	
	private static final String VIEW_CADASTRO = "cerveja/cadastro-produto";
	
	@RequestMapping(method = RequestMethod.GET, value = "/novo")
	public String novo(Cerveja cerveja) {
		return VIEW_CADASTRO;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/novo")
	public String cadastrar(@Valid Cerveja cerveja, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			return novo(cerveja);
		}
		//	Salvar no banco de dados...
		attributes.addFlashAttribute("mensagem", "Salvo com sucesso");
		return "redirect:/cervejas/novo";
	}

}
