package com.quipipa.cursojava.ExercicioDaaula16_17;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean verificar = true;

		while (verificar) {

			System.out.println("Informa uma nota de 1 a 10");
			
				int nota = scan.nextInt();

				switch (nota) {

				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:
					System.out.println("Informou uma nota valida");
					verificar = false;
					break;

				default:

					System.out.println("Voce Informou uma nota invalida");
					verificar = true;

				}
			}

		}

	}


