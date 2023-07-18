package com.quipipa.cursojava.ExercicioDaaula20;

import java.util.Random;

public class Exercicio02 {

	public static void main(String[] args) {
		int[][] numeroAleiatorio = new int[10][10];
		
		Random random = new Random();
		
		
		for( int i = 0; i< numeroAleiatorio.length; i++) {
			for(int j = 0; j<numeroAleiatorio[i].length; j++) {
				numeroAleiatorio[i][j] = random.nextInt(100);
			}
		}
		
		for( int i = 0; i< numeroAleiatorio.length; i++) {
			for(int j = 0; j<numeroAleiatorio[i].length; j++) {
				System.out.print(numeroAleiatorio[i][j] +"-");
			}
			
			System.out.println();
		}
		
		int maiorLinha5 = 0;
		int menorLinha5 = 101;
				;
		int Linha5 = 5;
		
		for( int i = 0; i< numeroAleiatorio[Linha5].length; i++) {
			
			if(numeroAleiatorio[Linha5][i]>maiorLinha5) {
				maiorLinha5 = numeroAleiatorio[Linha5][i];
			}
 			if(numeroAleiatorio[Linha5][i]< menorLinha5) {
				menorLinha5 = numeroAleiatorio[Linha5][i];
			}
			System.out.println();
		}
		
		
		int maiorColuna7 = 0;
		int menorColuna7 = 101;
		int coluna7 = 7;
		
		for( int i = 0; i< numeroAleiatorio[Linha5].length; i++) {
			
			if(numeroAleiatorio[i][coluna7]>maiorColuna7) {
				maiorColuna7 = numeroAleiatorio[i][coluna7];
			}
			if(numeroAleiatorio[i][coluna7]<menorColuna7) {
				menorColuna7 = numeroAleiatorio[i][coluna7];
			}
		}
		
		System.out.println("Maior da linha 5: "+maiorLinha5);
		System.out.println("Menor da linha 5: "+menorLinha5);
		System.out.println();
		System.out.println("Maior da coluna 7: "+maiorColuna7);
		System.out.println("Menor da coluna 7: "+menorColuna7);
		
		

	}

}
