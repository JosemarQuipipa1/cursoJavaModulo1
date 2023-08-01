package com.quipipa.cursojava.aula43_02labs;

public class PessoaFisica extends Contribuiente {
	
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public double calcularImposto() {
		double renda = super.getRendaBruta();
		if(renda <= 1400) {
			return 0;
		}
		
		if((renda >= 1400.01) && (renda <= 2100)) {
			double resultado = ((renda/100)*10 - 100);
			return resultado;	
		}
		
		if((renda >= 2100.01) && (renda <= 2800)) {
			double resultado = ((renda/100)*15 - 270);
			return resultado;	
		}
		
		if((renda >= 2800.01) && (renda <= 3600)) {
			double resultado = ((renda/100)*25 - 500);
			return resultado;	
		}
		
		return ((renda/100)*30 - 700);
		
	}

	@Override
	public String toString() {
		String s = "Pessoa Fisica [";
			   s = super.toString();
			   s+= "; cpf: " +cpf;
			   s+= "; imposto a ser pago: " +calcularImposto();
		return s;
	}

	
	
	
	
	

}
