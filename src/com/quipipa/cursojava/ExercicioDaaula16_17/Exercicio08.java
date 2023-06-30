package com.quipipa.cursojava.ExercicioDaaula16_17;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double media;
		int soma = 0;

		for (int i = 0; i < 5; i++) {

			System.out.println("Informa um numero");
			int num = scan.nextInt();
			soma = soma + num;
		}

		media = soma / 5;

		System.out.println("A soma dos numero e: " + soma);
		System.out.println("A media dos numero: " + media);

	}

}
