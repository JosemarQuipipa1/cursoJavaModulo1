package com.quipipa.cursojava.ExercicioDaaula16_17;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informa o primeiro numero");
		int num1 = scan.nextInt();

		System.out.println("Informa o segundo numero");
		int num2 = scan.nextInt();

		while (num1 < num2) {

			System.out.println("Intervalo dos numero informado " + num1);
			num1++;

		}
		while (num1 > num2) {

			System.out.println("Intervalo dos numero informado " + num2);
			num2++;

		}

	}

}
