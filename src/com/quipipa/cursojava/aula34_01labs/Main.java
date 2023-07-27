package com.quipipa.cursojava.aula34_01labs;

public class Main {
	
	    
	    static void imprimirValores() {
		
		  System.out.println(Contador.obterContador());   
		
	}

	public static void main(String[] args) {
		
		imprimirValores();
		Contador.incrementoContador();
		
		imprimirValores();
		
		Contador.zerar();
		
		imprimirValores();
		
		Contador.incrementoContador();
		Contador.incrementoContador();
		Contador.incrementoContador();

		imprimirValores();
		
		// cada vez que instanciar o objecto vamos incrementar uma vez
		
		Contador c1 = new Contador();
		Contador c2 = new Contador();
		Contador c3 = new Contador();
		
		imprimirValores();
		
		for(int i=0; i<2; i++) {
			Contador ci = new Contador();
		}

		imprimirValores();
	}

}
