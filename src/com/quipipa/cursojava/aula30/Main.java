package com.quipipa.cursojava.aula30;


public class Main {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiro = 10;
		van.capaConbustivel = 100;
		van.consumoCobustivel = 0.2;

		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		System.out.println();
		
		Carro fusca = new Carro("Volkswagen","Fusca");
		
		fusca.numPassageiro = 4;
		fusca.capaConbustivel = 30;
		fusca.consumoCobustivel = 0.15;
		
		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);
		System.out.println();

	}

}
