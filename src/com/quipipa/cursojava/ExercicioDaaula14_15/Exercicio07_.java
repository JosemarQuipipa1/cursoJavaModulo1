package com.quipipa.cursojava.ExercicioDaaula14_15;

import java.util.Scanner;

public class Exercicio07_ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println(" Informa a primeira nota");
		int numero1 = scan.nextInt();
		System.out.println(" Informa a segunda nota");
		int numero2 = scan.nextInt();
		System.out.println(" Informa a primeira nota");
		int numero3 = scan.nextInt();

		int maiorNumero = numero1;

		if (maiorNumero <= numero2) {

			maiorNumero = numero2;
		}
		if (maiorNumero <= numero3) {

			maiorNumero = numero3;

		} 
		
		int menorNumero = numero1;

		if (menorNumero >= numero2) {

			menorNumero = numero2;
		}
		if (menorNumero >= numero3) {

			menorNumero = numero3;

		} 
		
		System.out.println("Maior: "+maiorNumero);
		System.out.println("Menor: "+menorNumero);
		}
	}


