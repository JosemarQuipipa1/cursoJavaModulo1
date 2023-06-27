package com.quipipa.cursojava.ExercicioDaaula11_12_13;

import java.util.Scanner;

public class Exercicio11 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois numeros inteiros");
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		
		System.out.println("Digite um numero decimal");
		double numero3 = scan.nextDouble();
		
		int produto = (2 * numero1) * (numero2/2);
		double soma = (3*numero1) + numero3;
		double potencia = Math.pow(numero3, 3);
		
		System.out.println("Produto "+produto);
		System.out.println("Soma "+soma);
		System.out.println("Potencia "+potencia);
		
	}

}
