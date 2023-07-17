package com.quipipa.cursojava.ExercicioDaaula19;

import java.util.Random;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		Random random = new Random();
		
		for(int i = 0; i<vetorA.length; i++) {
			
			vetorA[i]=random.nextInt(10);
			vetorB[i] = vetorA[i]*vetorA[i];
		}
		
		System.out.print("VetorA ");
		for(int vetorA1: vetorA) {
			System.out.print(vetorA1);
		}
		
		System.out.println();

		System.out.print("VetorB ");
		for(int vetorB1: vetorB) {
			System.out.print(vetorB1);
		}
	}

}
