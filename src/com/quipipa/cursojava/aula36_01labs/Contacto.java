package com.quipipa.cursojava.aula36_01labs;

import java.util.Arrays;

public class Contacto {
	private String nome;
	private Endereco endereco;
	private Telefone[] telefone;
																																										
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Telefone[] getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone[] telefone) {
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		return "Contacto [nome=" + nome + ", endereco=" + endereco + ", telefone=" + Arrays.toString(telefone) + "]";
	}
	
	
	   
	
	

}
