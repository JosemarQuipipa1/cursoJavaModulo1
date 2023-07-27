package com.quipipa.cursojava.aula43;

public class Main {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setCurso("Ciencia de Computação");
		double[] notas = {10,12,15};
		
		Aluno aluno1 = new Aluno();
		
		aluno.setCurso("Ciencia de Computação");
		double[] notas2 = {5,18,16};
		
		aluno.setNotas(notas);
		
		System.out.println(aluno);
		
		
		System.out.println(aluno.equals(aluno1));
	}

}
