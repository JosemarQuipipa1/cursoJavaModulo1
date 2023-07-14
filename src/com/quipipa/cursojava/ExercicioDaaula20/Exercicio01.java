package com.quipipa.cursojava.ExercicioDaaula20;

import java.util.Random;

public class Exercicio01 {

	public static void main(String[] args) {
		int[][] numeroAleatorio = new int[4][4];
		
		Random numeroRandom = new Random();
		
		for(int i = 0; i < numeroAleatorio.length; i++) {
			for(int j = 0; j < numeroAleatorio[i].length; j++) {
				numeroAleatorio[i][j] = numeroRandom.nextInt(100);
			}
			
		}
		
		int maiorNumero = 0;
		int linha = 0;
		int coluna = 0;
		
		for(int i = 0; i < numeroAleatorio.length; i++) {
			for(int j = 0; j < numeroAleatorio[i].length; j++) {
				if(numeroAleatorio[i][j] > maiorNumero) {
					maiorNumero = numeroAleatorio[i][j];
					linha = i;
					coluna = j;
				}
			}
			
		}
		for(int i = 0; i < numeroAleatorio.length; i++) {
			for(int j = 0; j < numeroAleatorio[i].length; j++) {
				 System.out.print(numeroAleatorio[i][j]+"-");
				}
			   System.out.println();
			}
		
		
		System.out.println("Maior numero "+ maiorNumero);
		System.out.println("Linha "+ linha);
		System.out.println("Coluna "+ coluna);
	}

}
