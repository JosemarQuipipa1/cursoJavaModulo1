package com.quipipa.cursojava.ExercicioDaaula19;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informa o numero do vetorA" + i);
			vetorA[i] = scan.nextInt();
		}

		for (int j = 0; j < vetorA.length; j++) {

			System.out.println("Informa o numero do vetorB" + j);
			vetorB[j] = scan.nextInt();

			vetorC[j] = vetorA[j] * vetorB[j];

		}

		for (int vetorC1 : vetorC) {
			System.out.println(vetorC1);
		}


	}

}
