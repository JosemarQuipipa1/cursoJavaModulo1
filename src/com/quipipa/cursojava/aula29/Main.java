package com.quipipa.cursojava.aula29;


public class Main {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada("Leds", "12v");
		  
		lampada.modelo = "Boot";
		lampada.tensao = "24";
		
		lampada.ligar();
		
		lampada.mostrarEstado();
		
		lampada.desligar();
		
		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		
		lampada.mostrarEstado();

	}

}
