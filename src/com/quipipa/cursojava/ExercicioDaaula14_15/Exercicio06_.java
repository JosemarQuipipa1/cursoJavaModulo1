package com.quipipa.cursojava.ExercicioDaaula14_15;

import java.util.Scanner;

public class Exercicio06_ {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informa o primeiro numero");
		int num1 = scan.nextInt();
		System.out.println("Informa o segundo numero");
		int num2 = scan.nextInt();
		System.out.println("Informa o terceiro numero");
		int num3 = scan.nextInt();

		if ((num1 > num2) && (num1 > num3)) {

			System.out.println(" num1 e maior");
		} else if ((num2 > num1) && (num2 > num3)) {

			System.out.println(" num2 e maior");
		} else if ((num3 > num1) && (num3 > num2)) {

			System.out.println(" num3 e maior");
		}

	}

}
