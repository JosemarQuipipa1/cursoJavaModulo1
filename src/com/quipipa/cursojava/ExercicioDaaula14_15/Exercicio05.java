package com.quipipa.cursojava.ExercicioDaaula14_15;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println(" Informa a primeira nota");
		double nota1 = scan.nextDouble();
		System.out.println(" Informa a segunda nota");
		double nota2 = scan.nextDouble();

		double media = (nota1 + nota2) / 2;

		if (media == 10) {
			System.out.println(" Aluno aprovado com distincao: " + media);
		} else

		if (media >= 7) {
			System.out.println(" Aluno aprovado");
		} else {
			System.out.println(" Aluno reprovado");
		}

	}

}
