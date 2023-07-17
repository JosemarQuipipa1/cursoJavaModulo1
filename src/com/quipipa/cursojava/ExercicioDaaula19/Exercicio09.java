package com.quipipa.cursojava.ExercicioDaaula19;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] vetorA = new double[10];
		double[] vetorB = new double[vetorA.length];
		double[] vetorC = new double[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informa o numero do vetorA" + i);
			vetorA[i] = scan.nextInt();
		}

		for (int j = 0; j < vetorA.length; j++) {

			System.out.println("Informa o numero do vetorB" + j);
			vetorB[j] = scan.nextInt();
			
			if(vetorB[j] != 0) {
				
				vetorC[j] = vetorA[j] / vetorB[j];
			}else {
				
				System.out.println("Erro em dividir VetorB igual a Zero");
			}
			

		}

		for (double vetorC1 : vetorC) {
			System.out.print(vetorC1);
		}


	}

}
