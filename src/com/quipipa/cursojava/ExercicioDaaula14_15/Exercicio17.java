package com.quipipa.cursojava.ExercicioDaaula14_15;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println(" Informa um ano por favor ");
		int ano = scan.nextInt();

		boolean bissexto = false;

		if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {

			bissexto = true;

			System.out.println(" O ano informado e um bissexto " + bissexto);
		} else {

			System.out.println(" O ano informado nao e um bissexto " + bissexto);
		}

	}

}
