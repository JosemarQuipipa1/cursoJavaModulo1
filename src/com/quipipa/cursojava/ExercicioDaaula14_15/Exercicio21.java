package com.quipipa.cursojava.ExercicioDaaula14_15;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double precoLitroGasolina = 2.50;
		double precoLitroAlcool = 1.90;

		System.out.println("Informa o produto que gostaria de comprar ?");
		System.out.println("====     A-Alcool      ====================");
		System.out.println("====     G-Gasolina    ====================");
		System.out.println("===========================================");
		String escolha = scan.next();

		double totalDesconto = 0;
		double desconto = 0;
		switch (escolha) {
		case "A":
			System.out.println(" Informa a quantidade de litro");
			int litroAlcool = scan.nextInt();

			if (litroAlcool <= 20) {

				desconto = 3;

			}
			if (litroAlcool > 20) {

				desconto = 5;
			}
			double totalAlcool = precoLitroAlcool * litroAlcool;
			totalDesconto = (totalAlcool / 100) * desconto;
			double precoAlcool = totalAlcool - totalDesconto;
			System.out.println("Preco a pagar R$ " + precoAlcool);
			break;

		case "B":
			System.out.println(" Informa a quantidade de litro");
			int litroGasolina = scan.nextInt();

			if (litroGasolina <= 20) {

				desconto = 4;

			}
			if (litroGasolina > 20) {

				desconto = 6;
			}

			double totalGasolina = precoLitroGasolina * litroGasolina;
			totalDesconto = (totalGasolina / 100) * desconto;
			double precoGasolina = totalGasolina - totalDesconto;
			System.out.println("Preco a pagar R$ " + precoGasolina);
			break;

		default:
			System.out.println(" opcao invalida");
		}

	}

}
