package com.quipipa.cursojava.ExercicioDaaula19;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um numero");
			vetorA[i]=scan.nextInt();
		    vetorB[i] = vetorA[i] * 2;
		}

		System.out.println("VetorA:");
		for(int i = 0; i < vetorA.length; i++){
			System.out.print(vetorA[i]+"");
			System.out.print("");

		}
		System.out.println();
		
		System.out.println("VetorB:  ");
		for(int i = 0; i < vetorB.length; i++){
			System.out.print(vetorB[i]+"");

		}
		
	}

}
