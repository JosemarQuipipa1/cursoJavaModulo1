package com.quipipa.cursojava.ExercicioDaaula16_17;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double popA, taxaA, taxaB;
		double popB;
		boolean verificar = false;
		int count = 0;

		do {

			System.out.println("Informa a populacao A");
			popA = scan.nextDouble();

			if (popA > 0) {
				verificar = true;
			} else {
				System.out.println("popA dever ser maior que Zero");
			}

		} while (!verificar);
		System.out.println("Informa a taxa de crescimento da Populacao A");
		taxaA = scan.nextDouble();

		verificar = false;
		do {

			System.out.println("Informa a populacao B");
			popB = scan.nextDouble();

			if (popB > 0) {
				verificar = true;
			} else {
				System.out.println("popB dever ser maior que Zero");
			}

		} while (!verificar);

		System.out.println("Informa a taxa de crescimento da Populacao A");
		taxaB = scan.nextDouble();

		while (popA < popB) {

			popA = popA + (popA / 100) * taxaA;
			popB = popB + (popB / 100) * taxaB;
			count++;
		}

		System.out.println("Ano " + count);

	}

}
