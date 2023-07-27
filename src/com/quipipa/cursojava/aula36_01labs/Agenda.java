package com.quipipa.cursojava.aula36_01labs;

import java.util.Arrays;

public class Agenda {
	private String nome;
	private Contacto[] contacto;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Contacto[] getContacto() {
		return contacto;
	}
	public void setContacto(Contacto[] contacto) {
		this.contacto = contacto;
	}
	@Override
	public String toString() {
		return "Agenda [nome=" + nome + ", contacto=" + Arrays.toString(contacto) + "]";
	}
	
	/*public void obterInfo1() {
		
		System.out.println("Nome = " +nome+ "\n"); 
		
		if(contacto != null) {
			for(Contacto c : contacto) {
				System.out.println(c);
			}
		}
	
	}
	*/
	
}
