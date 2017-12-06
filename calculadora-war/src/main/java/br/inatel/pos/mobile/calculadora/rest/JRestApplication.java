package br.inatel.pos.mobile.calculadora.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.inatel.pos.mobile.calculadora.impl.JCalcServiceImpl;
import br.inatel.pos.mobile.calculadora.impl.JClientServiceImpl;

@ApplicationPath("/rest")
public class JRestApplication extends Application{
		
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
		classes.add(JCalcServiceImpl.class);
		classes.add(JClientServiceImpl.class);
		return classes;
	}
}
