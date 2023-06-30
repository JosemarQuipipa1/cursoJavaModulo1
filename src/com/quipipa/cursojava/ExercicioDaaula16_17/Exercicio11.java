package com.quipipa.cursojava.ExercicioDaaula16_17;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int soma = 0;
		System.out.println("Informa o primeiro numero");
		int num1 = scan.nextInt();

		System.out.println("Informa o segundo numero");
		int num2 = scan.nextInt();

		for (int i = num1; i < num2; i++) {

			System.out.println(i);
			soma = soma + i;
		}

		for (int i = num2; i < num1; i++) {

			System.out.println(i);
			soma = soma + i;
		}

		System.out.println(" A soma dos numero: " + soma);
	}

}
