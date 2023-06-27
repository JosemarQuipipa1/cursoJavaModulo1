package com.quipipa.cursojava.aula15;

import java.util.Scanner;

public class FaltaDoBreak {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informa um dia da Semana por favor: ");
		int diaSemana = scan.nextInt();
		
		switch (diaSemana) {
		
		case 1: System.out.println("Domingo");
			
		case 2: System.out.println("Segunda-feira");
		
		case 3: System.out.println("Terca-feira");
			
		case 4: System.out.println("Quarta-feira");
		
		case 5: System.out.println("Quinta-feira");
			
		case 6: System.out.println("Sexta-feira");
			
		case 7: System.out.println("Sabado");
			break;
			
		default:System.out.println(" Informa um dia valido");
			break;
		}

	}

}
