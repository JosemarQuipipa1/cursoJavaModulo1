package com.quipipa.cursojava.aula30;

public class Carro {

		String marca;
		String modelo;
		int numPassageiro;
		double capaConbustivel;
		double consumoCobustivel;
		
		Carro(){
			System.out.println("Construtor 1 foi Chamado");
		}
		
		
		public Carro(String marca, String modelo, int numPassageiro,
				double capaConbustivel, double consumoCobustivel) {

			System.out.println("Construtor 2 foi Chamado");
			this.marca = marca;
			this.modelo = modelo;
			this.numPassageiro = numPassageiro;
			this.capaConbustivel = capaConbustivel;
			this.consumoCobustivel = consumoCobustivel;
		}
		
		
		
		public Carro(String marca, String modelo, int numPassageiro) {
			this.marca = marca;
			this.modelo = modelo;
		}


		public Carro(String marca, String modelo) {
			this(marca,modelo,10);
			System.out.println("Chamando Construtor com 2  Parametros");
		}


		double obterAutonomia() {
			
			System.out.println("O metodo obterAutonimia foi chamado: ");
			return this.capaConbustivel * this.consumoCobustivel;
		}
		
		double calcularCombustivel(double km) {
			double qtdCombustivel = km /this.consumoCobustivel;
			return qtdCombustivel;
		}

}
