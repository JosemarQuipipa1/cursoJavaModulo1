package com.quipipa.cursojava.aula24;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiro = 10;
		van.capaConbustivel = 100;
		van.ConsumoCobustivel = 0.2;
		
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		System.out.println();
		
		Carro fusca = new Carro();
		
		fusca.marca = "Volkswagen";
		fusca.modelo = "Fusca";
		fusca.numPassageiro = 4;
		fusca.capaConbustivel = 30;
		fusca.ConsumoCobustivel = 0.15;
		
		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);
		System.out.println();
		
		

	}

}
