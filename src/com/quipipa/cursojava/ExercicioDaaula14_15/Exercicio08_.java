package com.quipipa.cursojava.ExercicioDaaula14_15;

import java.util.Scanner;

public class Exercicio08_ {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informa o preco do primeiro produto");
		double preco1 = scan.nextDouble();
		System.out.println("Informa o preco do segundo produto");
		double preco2 = scan.nextDouble();
		System.out.println("Informa o preco do terceiro produto");
		double preco3 = scan.nextDouble();
		
		if((preco1<=preco2)&&(preco1<=preco3)) {
			System.out.println("O produto com preco1 esta batato: "+preco1);
		} else if((preco2<=preco1)&&(preco2<=preco3)) {
			System.out.println("O produto com preco2 esta batato: "+preco2);
		}else if((preco3<=preco1)&&(preco3<=preco2)) {
			System.out.println("O produto com preco3 esta batato: "+preco3);
		}

	}

}
