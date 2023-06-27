package com.quipipa.cursojava.ExercicioDaaula14_15;

import java.util.Scanner;

public class Exercicio13 {
	/*
	 * 13.Faça um Programa que leia um número e exiba o dia correspondente da
	 * semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer
	 * valor inválido.
	 ****************************/

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informa uma um numero");
		int numero = scan.nextInt();
		
		switch(numero){
			
		case 1: System.out.println("Domingo");
		     break;
		case 2: System.out.println("Segunda-Feira");
	     	break;
		case 3: System.out.println("Quarta-Feira");
	     	break;
		case 4: System.out.println("Quinta-feira");
	     	break;
		case 5: System.out.println("Quinta-feira");
	     	break;
		case 6: System.out.println("Sexta-feira");
	     	break;
		case 7: System.out.println("Sabado");
	     	break;
	    default: System.out.println("Valor invalido");
	    	break;
		}

	}

}
