package com.algaworks.brewer.config;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
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
	
	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter encoding = new CharacterEncodingFilter();
		encoding.setEncoding("UTF-8");
		encoding.setForceEncoding(true);
		return new Filter[] { encoding };
	}

}
