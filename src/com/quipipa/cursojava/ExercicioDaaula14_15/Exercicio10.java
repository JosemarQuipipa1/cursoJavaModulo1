package com.quipipa.cursojava.ExercicioDaaula14_15;

import java.util.Scanner;

public class Exercicio10 {
	/*
	 * 10.Faça um Programa que pergunte em que turno você estuda. Peça para digitar
	 * M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!",
	 * "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
	 **********/

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informa em que turno voce estuda:");
		System.out.println("=================================");
		System.out.println("============Opcoes:==============");
		System.out.println("============M-Manha==============");
		System.out.println("============T-Tarde==============");
		System.out.println("============N-Noturno============");
		String turno = scan.next();

		switch (turno) {

		case "M":
			System.out.println("Bom dia");
			break;
		case "T":
			System.out.println("Boa Tarde");
			break;
		case "N":
			System.out.println("Boa noite");
			break;
		case "m":
			System.out.println("Bom dia");
			break;
		case "t":
			System.out.println("Boa Tarde");
			break;
		case "n":
			System.out.println("Boa noite");
			break;
			
		default: 
			System.out.println("Opcao invalida, por favor selecionar uma opcao valida");
			break;
		}
	}

}
