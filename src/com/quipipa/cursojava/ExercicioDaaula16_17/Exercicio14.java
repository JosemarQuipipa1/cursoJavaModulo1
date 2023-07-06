package com.quipipa.cursojava.ExercicioDaaula16_17;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero; 
		int pares = 0;
		int impares = 0;
		for(int i = 1; i < 10; i ++) {
			System.out.println("Digite um numero");
			numero = scan.nextInt();
			
			if(numero % 2 == 0) {
				pares ++;
			}else {
				impares ++;
			}
		}

		System.out.println("Numeros pares: "+pares);
		System.out.println("Numeros impares: "+impares);
	}

}
