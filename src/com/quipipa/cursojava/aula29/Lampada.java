package com.quipipa.cursojava.aula29;

public class Lampada{
	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	String[] tipos;
	boolean tipoAbajur;

	boolean ligada;
	
	Lampada(String modelo, String tensao){
		this.modelo = modelo;
		this.tensao = tensao;
		
	}

	void ligar() {
		ligada = true;
	}

	void desligar() {
		ligada = false;
	}

	void mostrarEstado() {

		if (ligada) {
			System.out.println("Lampada esta ligada Com o modelo "+ modelo +" e tensao: " +tensao);

		} else {

			System.out.println("Lampada esta desligada Com o modelo "+ modelo +" e tensao: " +tensao);
		}
	}

	void mudarEstado() {
		if (ligada) {
			desligar();
		} else {
			ligar();
		}

	}
	

}
