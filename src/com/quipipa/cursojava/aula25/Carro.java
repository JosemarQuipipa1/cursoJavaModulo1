package com.quipipa.cursojava.aula25;

public class Carro {
	String marca;
	String modelo;
	int numPassageiro;
	double capaConbustivel;
	double consumoCobustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do Carro e: "+capaConbustivel*consumoCobustivel+"km");
	}

}
