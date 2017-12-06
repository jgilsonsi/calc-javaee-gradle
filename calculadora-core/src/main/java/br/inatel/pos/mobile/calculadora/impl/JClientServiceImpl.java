package br.inatel.pos.mobile.calculadora.impl;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.inatel.pos.mobile.calculadora.api.IClientService;
import br.inatel.pos.mobile.calculadora.interfaces.IClientRemote;

@RequestScoped
public class JClientServiceImpl implements IClientService {

	@EJB(lookup = "java:app/calculadora-ejb-1.0.0-SNAPSHOT/JClientBean!br.inatel.pos.mobile.calculadora.interfaces.IClientRemote")
	private IClientRemote clientBean;

	@Override
	public void add(String name, String email) {
		clientBean.add(name, email);
	}

	@Override
	public String[] list() {
		return clientBean.list();
	}

}
