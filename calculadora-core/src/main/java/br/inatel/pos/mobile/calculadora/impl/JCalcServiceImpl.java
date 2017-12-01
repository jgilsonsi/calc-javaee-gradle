package br.inatel.pos.mobile.calculadora.impl;

import br.inatel.pos.mobile.calculadora.api.ICalcService;
import br.inatel.pos.mobile.calculadora.api.Result;

public class JCalcServiceImpl implements ICalcService {

	@Override
	public Result sum(double first, double second) {
		Result result = new Result();
		result.setFirst(first);
		result.setSecond(second);
		result.setResult(first + second);
		return result;
	}

	@Override
	public Result subtract(double first, double second) {
		Result result = new Result();
		result.setFirst(first);
		result.setSecond(second);
		result.setResult(first - second);
		return result;
	}

}
