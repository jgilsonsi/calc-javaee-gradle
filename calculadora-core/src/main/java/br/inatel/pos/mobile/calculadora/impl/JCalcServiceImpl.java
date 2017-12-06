package br.inatel.pos.mobile.calculadora.impl;

import br.inatel.pos.mobile.calculadora.api.ICalcService;
import br.inatel.pos.mobile.calculadora.api.JResult;

public class JCalcServiceImpl implements ICalcService {

	@Override
	public JResult sum(double first, double second) {
		JResult result = new JResult();
		result.setFirst(first);
		result.setSecond(second);
		result.setResult(first + second);
		return result;
	}

	@Override
	public JResult subtract(double first, double second) {
		JResult result = new JResult();
		result.setFirst(first);
		result.setSecond(second);
		result.setResult(first - second);
		return result;
	}

}
