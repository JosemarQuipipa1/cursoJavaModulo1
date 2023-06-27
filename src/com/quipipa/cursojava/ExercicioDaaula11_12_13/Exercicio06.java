package com.quipipa.cursojava.ExercicioDaaula11_12_13;

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Informa o valor do raio para calcular a area");
		float raio = scan.nextFloat();
		
		double Area = (Math.PI * Math.pow(raio, 2));
		
		System.out.println(" O valor da area e igual " +Area);
	}

}
