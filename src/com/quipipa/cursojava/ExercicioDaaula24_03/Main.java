package com.quipipa.cursojava.ExercicioDaaula24_03;


public class Main {

	public static void main(String[] args) {
		LivroDeLivraria livro = new LivroDeLivraria();

		livro.nome = " Curso da Linguagem Java";
		livro.autor = " Josemar Quipipa";
		livro.anoLancamento = 2023;
		livro.preco= 63.39;

		System.out.println("Nome do livro: " + livro.nome);
		System.out.println("Autor do Livro: " + livro.nome);
		System.out.println("Ano de lancamento do livro: " + livro.nome);
		System.out.println("O preco do livro: " + livro.preco);

	}

}
