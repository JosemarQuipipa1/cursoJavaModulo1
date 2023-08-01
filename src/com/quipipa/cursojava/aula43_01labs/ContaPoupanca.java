package com.quipipa.cursojava.aula43_01labs;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
	private int diaRendimento;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	/*@Override
	public String toString() {
		return "ContaPoupanca [diaRendimento=" + diaRendimento + "]";
	}*/
	
	public String  toString() {
		String s = "Conta Poupanca [";
		s+= "Dia Rendimento: " + diaRendimento;
		s+=" ; " + super.toString(); 
		s+=" ] " ;
		return s;
	}
	
	
	
	public boolean calcularNovoSaldo(double taxaRendimento) {
		Calendar hoje = Calendar.getInstance();
		if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
		this.setSaldo(getSaldo()+ (getSaldo()*taxaRendimento));
		return true;
	}
	return false;
}

}
