package com.quipipa.cursojava.ExercicioDaaula14_15;

import java.util.Scanner;

public class Exercicio04_ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma letra ");
		String letra = scan.next();

		if (letra.length() > 1) {
			System.out.println(" Nao e uma letra valida");
		} else {

			switch (letra) {
			case "a":
			case "A":
			case "e":
			case "E":
			case "i":
			case "I":
			case "o":
			case "O":
			case "U":
			case "u":
				System.out.println("Vogal");
				break;
			default:
				System.out.println("Consoante");
				break;
			}
		}
	}

}
