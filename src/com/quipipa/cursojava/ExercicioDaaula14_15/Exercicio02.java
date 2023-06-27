package com.quipipa.cursojava.ExercicioDaaula14_15;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro numero");
		int numero = scan.nextInt();

		
		if(numero < 0) {
			
		 System.out.println("Numero negativo: " + numero);
			
		}else {
		 
		  System.out.println("Numero positivo: " + numero);
		  	
		}
	}

}
