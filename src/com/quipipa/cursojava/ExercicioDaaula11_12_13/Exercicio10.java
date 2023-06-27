package com.quipipa.cursojava.ExercicioDaaula11_12_13;

import java.util.Scanner;

public class Exercicio10 {
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informa o valor em graus Celsius");
		double c = scan.nextDouble();
		
		double  f = 32+(c*1.8);
		
		System.out.println("O valor em graus Farenheit e : "+f +"F");
		
		
	}

}
