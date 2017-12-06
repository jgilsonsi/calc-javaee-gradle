package br.inatel.pos.mobile.calculadora.ejb;

import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.inatel.pos.mobile.calculadora.dao.JClientDAO;
import br.inatel.pos.mobile.calculadora.entities.JClient;
import br.inatel.pos.mobile.calculadora.interfaces.IClientLocal;
import br.inatel.pos.mobile.calculadora.interfaces.IClientRemote;

@Stateless
@Local(IClientLocal.class)
@Remote(IClientRemote.class)
public class JClientBean implements IClientLocal, IClientRemote {

	@EJB
	private JClientDAO dao;

	@Override
	public void add(String name, String email) {
		JClient client = new JClient();
		client.setName(name);
		client.setEmail(email);
		dao.insert(client);
	}

	@Override
	public String[] list() {
		return dao.findAll().stream().map(JClient::toString).collect(Collectors.toList()).toArray(new String[0]);
	}

}
