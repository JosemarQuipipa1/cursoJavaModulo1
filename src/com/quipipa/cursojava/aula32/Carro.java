package com.quipipa.cursojava.aula32;

public class Carro {
	private String marca;
	private String modelo;
	private int numPassageiro;
	private double capaConbustivel;
	private double consumoCobustivel;
	
	// Metodo obter um atributo
	
	public String getMarca() {
		return this.marca;
	}

	// Se queremos modificar um valor
	public void setMarca(String marca) {
		this.marca = marca;
		
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getNumPassageiro() {
		return this.numPassageiro;
	}
	
	public void setNumPassageiro(int modelo) {
		this.numPassageiro = numPassageiro;
	}
	
	
}
