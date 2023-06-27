package com.quipipa.cursojava.ExercicioDaaula14_15;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informa o primeiro lado de um triangulo");
		double lado1 = scan.nextDouble();
		System.out.println("Informa o segundo lado de um triangulo");
		double lado2 = scan.nextDouble();
		System.out.println("Informa o terceiro lado de um triangulo");
		double lado3 = scan.nextDouble();

		if (lado1 + lado2 >= lado3 && lado2 + lado3 >= lado1 && lado3 + lado1 >= lado2) {
			if (lado1 == lado2 && lado2 == lado3) {

				System.out.println("E um triangulo equilatero");

			} else if (lado1 != lado2 && lado2 != lado3) {

				System.out.println("E um triangulo Escaleno");
			} else {

				System.out.println("E um triagulo esosceles");
			}

		}else {
			
			System.out.println("Nao pode ser um triangulo");
		}

	}

}
