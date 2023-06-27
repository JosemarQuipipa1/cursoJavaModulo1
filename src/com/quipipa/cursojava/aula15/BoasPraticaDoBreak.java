package com.quipipa.cursojava.aula15;

import java.util.Scanner;

public class BoasPraticaDoBreak {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informa um dia da Semana por favor: ");
		int diaSemana = scan.nextInt();

		switch (diaSemana) {


		case 2:
		case 3:
		case 4:
		case 5:
		case 6: System.out.println("Dia util"); 
			break;
		case 1: 
		case 7:
			System.out.println("Fim de semana");
			break;

		default:
			System.out.println(" Informa um dia valido");
			break;
		}

	}

}
