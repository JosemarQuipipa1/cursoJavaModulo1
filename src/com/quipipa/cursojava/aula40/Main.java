package com.quipipa.cursojava.aula40;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		/*Pessoa aluno = new Pessoa();
		Pessoa professor = new Pessoa();
		*/
		
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		pessoa.setEndereco("Rua 1, num 1");
		aluno.setEndereco("Rua 2, num 2");
		professor.setEndereco("Rua 3, num 3"); 
		
		
		System.out.println(pessoa.obterEtiquetaEndereco());
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());
		

	}

}
