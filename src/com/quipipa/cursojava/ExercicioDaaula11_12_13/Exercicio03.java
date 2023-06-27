package com.quipipa.cursojava.ExercicioDaaula11_12_13;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois numeros:");
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		
		int soma = numero1 + numero2;
		
		System.out.println("A soma dos numero e: "+soma);
	}

}
