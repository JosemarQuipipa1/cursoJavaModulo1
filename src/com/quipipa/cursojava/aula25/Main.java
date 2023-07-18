package com.quipipa.cursojava.aula25;



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
		
		van.exibirAutonomia();

	}

}
