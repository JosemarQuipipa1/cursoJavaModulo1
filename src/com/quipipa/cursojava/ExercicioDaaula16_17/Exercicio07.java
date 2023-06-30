package com.quipipa.cursojava.ExercicioDaaula16_17;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int maiorNumero = Integer.MIN_VALUE;
		int count = 0;
		
		do {
			
		System.out.println("Informa o numero");
		int numero = scan.nextInt();
		count++;
		
		if(maiorNumero < numero) {
			maiorNumero = numero;
			System.out.println(" O numero maior mudou " +maiorNumero);
		}
		}while(count<5);
		
		System.out.println("maior numero "+maiorNumero);

	}

}
