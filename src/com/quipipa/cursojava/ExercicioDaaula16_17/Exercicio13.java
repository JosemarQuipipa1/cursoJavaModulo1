package com.quipipa.cursojava.ExercicioDaaula16_17;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informa o numero da base");
		double numeroBase = scan.nextDouble();
		System.out.println("Informa o numero do expoente");
		double numeroExpoente = scan.nextDouble();

		double resultado = numeroBase;
		/*
		 * 2^2 = 2*2 2^3 = 2*2*2
		 * 
		 */

		for (int i = 1; i < numeroExpoente; i++) {

			resultado = resultado * numeroBase;
		}
		System.out.println(resultado);

	}

}
