package com.algaworks.brewer.config;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Classe de inicialização do Spring MVC
 */
public class AppInitializerConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	/**
	 * Configura onde o Spring MVC vai achar os controllers da aplicação
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { AppWebConfig.class };
	}

	/**
	 * Intercepta qualquer URL da aplicação
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
	
	/**
	 * Força o encoding dos caracteres em UTF-8
	 */
	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter encoding = new CharacterEncodingFilter();
		encoding.setEncoding("UTF-8");
		encoding.setForceEncoding(true);
		return new Filter[] { encoding };
	}

}
