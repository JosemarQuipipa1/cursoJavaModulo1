package com.quipipa.cursojava.aula34_01labs;

public class Contador {
	
	private static int cont = 0;
	
	public Contador() {
		cont++;
	}
	
	static void incrementoContador() {
		cont++;
	}
	
	static void zerar() {
		cont = 0;
	}
	
	static int obterContador() {
		return cont;
	}

}
