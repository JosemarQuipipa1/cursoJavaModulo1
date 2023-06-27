package com.quipipa.cursojava.ExercicioDaaula14_15;

import java.util.Scanner;

public class Exercicio18_ {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Informa um numero");
		int numero = scan.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Numero par");
		}else {
			System.out.println("Numero impar");
		}
	}

}
