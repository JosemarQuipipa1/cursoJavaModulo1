package com.quipipa.cursojava.ExercicioDaaula14_15;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println(" Digita a quantidade de morango em kg");
		int quantidadeMorango = scan.nextInt();
		System.out.println(" Digita a quantidade de maca em kg");
		int quantidadeMaca = scan.nextInt();

		double desconto = 10;
		double precoMorago = 0;
		double precoMaca = 0;
		double morangokg = 2.5;
		double morangokg1 = 2.2;

		double macakg = 1.8;
		double macakg1 = 1.5;

		if (quantidadeMorango <= 5) {

			precoMorago = morangokg;

		} else {

			precoMorago = morangokg1;
		}

		if (quantidadeMaca <= 5) {

			precoMaca = macakg;

		} else {

			precoMaca = macakg1;
		}

		double precoTotal = precoMorago + precoMaca;

		if (quantidadeMaca + quantidadeMorango >= 8 || precoTotal > 25.00) {
			double totalPagar = 0;
			double totalDesconto = 0;
			totalDesconto = (precoTotal / 100) * desconto;
			totalPagar = precoTotal - totalDesconto;
			System.out.println(" Preco tatal a pagar " + totalPagar);

		}

	}

}
