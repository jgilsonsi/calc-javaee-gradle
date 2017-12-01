package br.inatel.pos.mobile.calculadora.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.inatel.pos.mobile.calculadora.impl.JCalcServiceImpl;

@ApplicationPath("/rest")
public class JRestApplication extends Application{
		
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
		classes.add(JCalcServiceImpl.class);
		return classes;
	}
}