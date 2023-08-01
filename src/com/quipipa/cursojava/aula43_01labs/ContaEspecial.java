package com.quipipa.cursojava.aula43_01labs;

public class ContaEspecial extends ContaBancaria {
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public String  toString() {
		String s = "Conta Especial [";
		s+= "Limite: " + limite ;
		s+=" ; " + super.toString(); 
		s+=" ] " ;
		return s;
	}
	
	public boolean sacar(double valor) {
		double saldoComLimite = this.getSaldo() + limite;
		
		if((saldoComLimite - valor)>= 0) {
			this.setSaldo(this.getSaldo()-valor );
			return true;
		}
		return false;
	}
	
	
	

}
