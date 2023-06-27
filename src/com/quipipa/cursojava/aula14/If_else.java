package com.quipipa.cursojava.aula14;

import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informa uma idade");
		int idade = scan.nextInt();

		if (idade >= 18) {

			System.out.println(" E maior de Idade");
		} else {

			System.out.println(" E menor de Idade");
		}

	}

}
