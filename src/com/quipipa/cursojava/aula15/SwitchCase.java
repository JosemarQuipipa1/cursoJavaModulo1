package com.quipipa.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informa um dia da Semana por favor: ");
		int diaSemana = scan.nextInt();
		
		switch (diaSemana) {
		
		case 1: System.out.println("Domingo");
			break;
			
		case 2: System.out.println("Segunda-feira");
			break;
			
		case 3: System.out.println("Terca-feira");
			break;
			
		case 4: System.out.println("Quarta-feira");
			break;
			
		case 5: System.out.println("Quinta-feira");
			break;
			
		case 6: System.out.println("Sexta-feira");
			break;
			
		case 7: System.out.println("Sabado");
			break;
			
		default:System.out.println(" Informa um dia valido");
			break;
		}

	}

}
