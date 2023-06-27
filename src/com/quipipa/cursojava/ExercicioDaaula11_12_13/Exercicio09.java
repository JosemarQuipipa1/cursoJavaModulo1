package com.quipipa.cursojava.ExercicioDaaula11_12_13;

import java.util.Scanner;

public class Exercicio09 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informa o valor em graus Farenheit");
		double f = scan.nextDouble();
		
		double c = (5 * (f-32) / 9);
		
		System.out.println("O valor em graus Celsius e : "+c);
		
		
	}

}
