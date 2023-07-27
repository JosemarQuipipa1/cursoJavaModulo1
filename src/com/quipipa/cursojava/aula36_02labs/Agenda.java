package com.quipipa.cursojava.aula36_02labs;

public class Agenda {
	private String nome;
	private Contato[] contato;
	
	public Agenda() {
		
	}
	public Agenda(String nome) {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Contato[] getContato() {
		return contato;
	}
	public void setContato(Contato[] contato) {
		this.contato = contato;
	}
	
	public String obterInfor(){
		String info = "Nome = " + nome + "\n";
		
		if(contato != null) {
			
			for(Contato c : contato) {
				info += c.obterInfo() + "\n";
			}
		}
		
		
		return info;
		
	}
	
	

}
