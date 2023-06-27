package com.quipipa.cursojava.ExercicioDaaula14_15;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		int numero1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero");
		int numero2 = scan.nextInt();
		
		int maiorNumero = numero1;
		
		if (numero1 < numero2 ) {
			
			maiorNumero = numero2;
		}
		
	   System.out.println(" O maior numero e: " + maiorNumero);
	}

}
