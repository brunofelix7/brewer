package com.algaworks.brewer.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Classe de inicialização do Spring MVC
 */
public class AppServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	/**
	 * Configura onde o Spring MVC vai achar os controllers
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { AppWebConfig.class };
	}

	/**
	 * Intercepta qualquer URL dentro do projeto
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
