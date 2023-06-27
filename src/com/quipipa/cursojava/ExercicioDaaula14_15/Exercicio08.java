package com.quipipa.cursojava.ExercicioDaaula14_15;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informa o preco do primeiro produto");
		double preco1 = scan.nextDouble();
		System.out.println("Informa o preco do segundo produto");
		double preco2 = scan.nextDouble();
		System.out.println("Informa o preco do terceiro produto");
		double preco3 = scan.nextDouble();

		double barato = preco1;

		if (barato > preco2){
			barato = preco2;
		}

		if (barato > preco3){
			barato = preco3; 
		}
		
		System.out.println(" O preco mais barato: " +barato);
	}

}
