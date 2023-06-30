package com.quipipa.cursojava.ExercicioDaaula16_17;

public class Exercicio04 {

	public static void main(String[] args) {
		
		double popA = 80000;
		double popB = 200000;
		int count = 0;
		
		while(popA<popB) {
			
			popA = popA + (popA/100)*3;
			popB = popB + (popB/100)*1.5;
			count++;
		}
		
		System.out.println("Ano "+count);	

	}

}
