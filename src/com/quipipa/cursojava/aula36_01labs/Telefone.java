package com.quipipa.cursojava.aula36_01labs;

public class Telefone {
	private String tipo;
	private String ddd;
	private String numero;
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return "Telefone [tipo=" + tipo + ", ddd=" + ddd + ", numero=" + numero + "]";
	}
	
	

}
