package com.quipipa.cursojava.ExercicioDaaula14_15;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double precoFileDuploMekg = 4.9;
		double precoFileDuploMakg = 5.8;
		double precoAlcatraMekg = 5.9;
		double precoAlcatraMakg = 6.8;
		double precoPicanhaMekg = 6.9;
		double precoPicanhaMakg = 7.8;
		double preco = 0;
		double pagamento = 5;
		double precoDesconto = 0;

		System.out.println("===============================");
		System.out.println("==1-File Duplo   ==============");
		System.out.println("==2-Alcatra      ==============");
		System.out.println("==3-Picanha      ==============");
		System.out.println("===============================");
		int escolha = scan.nextInt();
		String cartao = "";
		double desconto = 0;
		String tipo = "";

		switch (escolha) {

		case 1:
			System.out.println(" Digita a quantidade de carne File duplo  em kg");
			double quantidadeFileDuplo = scan.nextDouble();
			tipo = "File Duplo";

			if (quantidadeFileDuplo <= 5) {

				System.out.println(" Metodo de pagamento");
				cartao = scan.next();
				preco = precoFileDuploMekg*quantidadeFileDuplo;

				if (cartao.equalsIgnoreCase("cartao")) {

					desconto = (preco * pagamento) / 100;
					precoDesconto = preco - desconto;

				}
			} else if (quantidadeFileDuplo > 5) {
				System.out.println(" Metodo de pagamento");
				cartao = scan.next();
				preco = precoFileDuploMakg*quantidadeFileDuplo;

				if (cartao.equalsIgnoreCase("cartao")) {
					desconto = (preco * pagamento) / 100;
					precoDesconto = preco - desconto;

				}
			}

			System.out.println("===Informacao da compra===");
			System.out.println("==Tipo: " + tipo + "   =========");
			System.out.println("==Quantidade " + quantidadeFileDuplo + " =========");
			System.out.println("==Preco total " + preco + " =========");
			System.out.println("==Tipo de pagamento " + cartao + " =========");
			System.out.println("==Valor do desconto " + desconto + " =========");
			System.out.println("==Valor a pagar " + precoDesconto + " =========");

			break;

		case 2:
			System.out.println(" Digita a quantidade de carne File duplo  em kg");
			double quantidadeAlcatra = scan.nextDouble();
			tipo = "Alcatra";

			if (quantidadeAlcatra <= 5) {

				System.out.println(" Metodo de pagamento");
				cartao = scan.next();
				preco = precoAlcatraMekg*quantidadeAlcatra;

				if (cartao.equalsIgnoreCase("cartao")) {

					desconto = (preco * pagamento) / 100;
					precoDesconto = preco - desconto;

				}
			} else if (quantidadeAlcatra > 5) {
				System.out.println(" Metodo de pagamento");
				cartao = scan.next();
				preco = precoAlcatraMakg*quantidadeAlcatra;

				if (cartao.equalsIgnoreCase("cartao")) {
					desconto = (preco * pagamento) / 100;
					precoDesconto = preco - desconto;

				}
			}

			System.out.println("===Informacao da compra===");
			System.out.println("==Tipo: " + tipo + "   =========");
			System.out.println("==Quantidade " + quantidadeAlcatra + " =========");
			System.out.println("==Preco total " + preco + " =========");
			System.out.println("==Tipo de pagamento " + cartao + " =========");
			System.out.println("==Valor do desconto " + desconto + " =========");
			System.out.println("==Valor a pagar " + precoDesconto + " =========");

			break;

		case 3:
			System.out.println(" Digita a quantidade de carne File duplo  em kg");
			double quantidadePicanha = scan.nextDouble();
			tipo = "Alcatra";

			if (quantidadePicanha <= 5) {

				System.out.println(" Metodo de pagamento");
				cartao = scan.next();
				preco = precoPicanhaMekg*quantidadePicanha;

				if (cartao.equalsIgnoreCase("cartao")) {

					desconto = (preco * pagamento) / 100;
					precoDesconto = preco - desconto;

				}
			} else if (quantidadePicanha > 5) {
				System.out.println(" Metodo de pagamento");
				cartao = scan.next();
				preco = precoPicanhaMakg*quantidadePicanha;

				if (cartao.equalsIgnoreCase("cartao")) {
					desconto = (preco * pagamento) / 100;
					precoDesconto = preco - desconto;

				}
			}

			System.out.println("===Informacao da compra===");
			System.out.println("==Tipo: " + tipo + "   =========");
			System.out.println("==Quantidade " + quantidadePicanha + " =========");
			System.out.println("==Preco total " + preco + " =========");
			System.out.println("==Tipo de pagamento " + cartao + " =========");
			System.out.println("==Valor do desconto " + desconto + " =========");
			System.out.println("==Valor a pagar " + precoDesconto + " =========");

			break;

		}
	}

}
