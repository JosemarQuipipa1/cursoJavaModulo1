package com.quipipa.cursojava.ExercicioDaaula14_15;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma letra ");
		String letra = scan.next();

		if (letra.equalsIgnoreCase("M")) {

			System.out.println("A letra digitada representa Masculino");

		} else if (letra.equalsIgnoreCase("F")) {

			System.out.println("A letra digitada representa Feminino");
		} else {

			System.out.println("Sexo Inválido");
		}
	}

}
