package com.quipipa.cursojava.ExercicioDaaula14_15;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println(" Informa o valor da variavel - a - ");
		double a = scan.nextDouble();

		if (a == 0) {
			System.out.println(" Nao e uma equacao do 2 grau");
		}


			System.out.println(" Informa o valor da variavel - b - ");
			double b = scan.nextDouble();
			System.out.println(" Informa o valor da variavel - c - ");
			double c = scan.nextDouble();

			double delta = (b * b) - 4 * (a) * (c);

			if (delta < 0) {
				System.out.println(" Nao possui raiz reais");

			} else if (delta == 0) {

				System.out.println(" A equacao possue apenas uma raiz real");

				double X = (((-b) + Math.sqrt(delta)) / (2 * a));

				System.out.println("Delta " + delta);
				System.out.println("X1 = X2" + X);

			} else {

				System.out.println(" A equacao possue duas raiz reais");
				double X1 = (((-b) + Math.sqrt(delta)) / (2 * a));
				double X2 = (((-b) - Math.sqrt(delta)) / (2 * a));

				System.out.println("Delta " + delta);
				System.out.println("X1 " + X1);
				System.out.println("X2 " + X2);
			}

		}

	}


