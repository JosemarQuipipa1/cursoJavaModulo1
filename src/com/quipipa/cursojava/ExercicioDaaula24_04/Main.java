package com.quipipa.cursojava.ExercicioDaaula24_04;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		LivroDeBiblioteca livro = new LivroDeBiblioteca();

		livro.nome = " Curso da Linguagem Java";
		livro.autor = " Josemar Quipipa";
		livro.anoLancamento = 2023;
		livro.emprestado = true;
		livro.dataEntrega=new Date();
		livro.emprestadoA = "Brando";

		System.out.println("Nome do livro: " + livro.nome);
		System.out.println("Autor do Livro: " + livro.nome);
		System.out.println("Ano de lancamento do livro: " + livro.nome);
		System.out.println("O livro foi emprestado: " + livro.emprestado);
		System.out.println("Quem emprestou o livro: " + livro.emprestadoA);
		System.out.println("Data de entregado do Livro: " + livro.dataEntrega);
		
		

	}

}
