package com.quipipa.cursojava.aula43_02labs;

public class PessoaJuridica extends Contribuiente {
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double calcularImposto() {
		double renda = (super.getRendaBruta()/100)*10;
		return renda;
	}

	@Override
	public String toString() {
		String s = "Pessoa Juridica [";
		   s = super.toString();
		   s+= "; cnpj: " +cnpj;
		   s+= "; imposto a ser pago: " +calcularImposto();
		   s+= "]";
		   return s;
	}

}
