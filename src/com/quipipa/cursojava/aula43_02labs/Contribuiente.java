package com.quipipa.cursojava.aula43_02labs;

public abstract class Contribuiente {
	private String nome;
	private double rendaBruta;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getRendaBruta() {
		return rendaBruta;
	}
	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	
	public abstract double calcularImposto();
	
	@Override
	public String toString() {
		return "Contribuiente [nome=" + nome + ", rendaBruta=" + rendaBruta + "]";
	}
		
	
}
