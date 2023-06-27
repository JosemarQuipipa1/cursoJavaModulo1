package com.quipipa.cursojava.ExercicioDaaula11_12_13;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informa a altura de uma pessoa");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7*altura) - 58;		
		
		System.out.println(" O peso ideia de uma pessoa " + pesoIdeal);

	}

}
