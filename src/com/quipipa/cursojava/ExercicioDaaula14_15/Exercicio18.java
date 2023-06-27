package com.quipipa.cursojava.ExercicioDaaula14_15;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informa o dia");
		int dia = scan.nextInt();
		System.out.println("Informa o mes ");
		int mes = scan.nextInt();
		System.out.println("Informa o ano");
		int ano = scan.nextInt();

		if (dia > 0 && dia <= 31) {

			if (mes > 0 && mes <= 12) {

				System.out.println(+dia+"/"+mes+"/"+ ano);

			}
		} else {

			System.out.println("Data nao valida");
		}

	}

}
