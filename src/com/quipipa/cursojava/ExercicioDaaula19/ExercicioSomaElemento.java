package com.quipipa.cursojava.ExercicioDaaula19;

import java.util.Scanner;

public class ExercicioSomaElemento {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[8];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um numero");
			vetorA[i]=scan.nextInt();
		    
		}

		int soma = 0;
		System.out.println("VetorA:");
		for(int i = 0; i < vetorA.length; i++){
			System.out.print(vetorA[i]+"");
			soma+=vetorA[i];
		

		}
		System.out.println("");
		System.out.print("Soma dos elementos do vetorA "+soma);
		
		

	}

}
