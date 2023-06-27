package com.quipipa.cursojava.aula10;

public class Variaveis {
	// Aula 01 - Variável

	public static void main(String[] args) {

		// covenção Java usando camelCase

		int idade = 12;
		String nome = "Josemar";
		String nomeDoMeuCachoro = "Gato";
		String ano2014;

		// Aceito, mas não utilizado

		int _idade;
		int $idade;

		// Não é convenção Java
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
		String nomeDoMeucachorro;

		// Podemos redefinir o valor de uma variável

		idade = 14;

		System.out.println("Idade = " + idade);
		System.out.println("Nome = " + nome);

		// má prática
		// Temos que dar um nome que facilmente poderemos nos lembrar do assunto em
		// questão.

		int a = 10;
		String b = "Branco";

	}

}
