package com.quipipa.cursojava.aula36_03labs;

import java.util.Arrays;

public class Curso {
	
	private String nome;
	private String horario;
	private Professor professor;
	private Aluno[] alunos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Aluno[] getAluno() {
		return alunos;
	}
	public void setAluno(Aluno[] alunos) {
		this.alunos = alunos;
	}
	
	/*
	public String  obterInfo() {
		String info = " Nome do curso"  + nome + "\n";
		
			if(professor != null) {
				info+=professor.obterInfo() +"\n";	
			}
		       for(Aluno aluno : alunos ) {
		    	   if(aluno != null) {
		    	   info += aluno.obterInfo() + "\n";
		       }
		       }
		
		return info;
		
	}
	*/
	
	public double obterMediaTurma() {
		 double soma = 0;
		 for(Aluno aluno: alunos) {
			 if(aluno != null) {
				 soma +=aluno.obterMedia();				 
			 }
		 }
		 
		 return soma/alunos.length ;
	}
	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", horario=" + horario + ", professor=" + professor + ", alunos="
				+ Arrays.toString(alunos) + "]";
	}
	

}
