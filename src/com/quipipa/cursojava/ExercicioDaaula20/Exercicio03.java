package com.quipipa.cursojava.ExercicioDaaula20;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		int[][] numeroAleiatorio = new int[3][3];
		
		Scanner scan = new Scanner(System.in);
		
		
		for( int i = 0; i< numeroAleiatorio.length; i++) {
			for(int j = 0; j<numeroAleiatorio[i].length; j++) {
				System.out.println("Informe um numero ");
				numeroAleiatorio[i][j] = scan.nextInt();
			}
		}
		
		for( int i = 0; i< numeroAleiatorio.length; i++) {
			for(int j = 0; j<numeroAleiatorio[i].length; j++) {
				System.out.print(numeroAleiatorio[i][j] +" ");
			}
			
			System.out.println();
		}
		int numerosPares = 0;
		int numerosImpares = 0;
		for( int i = 0; i< numeroAleiatorio.length; i++) {
			for(int j = 0; j<numeroAleiatorio[i].length; j++) {
				if(numeroAleiatorio[i][j] % 2 == 0) {
					numerosPares++;
				}else {
					numerosImpares++;
				}
				
			}
			
		}
		System.out.println("Numeros Pares: " + numerosPares);
		System.out.println("Numeros ImPares: " + numerosImpares);

	}

}
