package com.quipipa.cursojava.aula26;

public class Carro {
	String marca;
	String modelo;
	int numPassageiro;
	double capaConbustivel;
	double consumoCobustivel;
	
	double obterAutonomia() {
		
		System.out.println("O metodo obterAutonimia foi chamado: ");
		return capaConbustivel * consumoCobustivel;
	}
}
