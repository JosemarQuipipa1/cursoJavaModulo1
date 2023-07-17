package com.quipipa.cursojava.ExercicioDaaula19;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		double[] vetorA = new double[15];
		double[] vetorB = new double[vetorA.length];
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.println("Informa um numero "+ i);
			vetorA[i]=scan.nextInt();
			vetorB[i] = Math.sqrt(vetorA[i]);
		}

		System.out.print("vetorA ");
		for(double vetorA1 : vetorA) {
			System.out.print(vetorA1);
		}
		
		System.out.println();
		
		System.out.print("vetorB ");
		for(double vetorB1 : vetorB) {
			System.out.print(vetorB1);
		}
	}

}
