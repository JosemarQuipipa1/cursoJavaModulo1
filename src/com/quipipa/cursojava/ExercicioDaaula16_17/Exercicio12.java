package com.quipipa.cursojava.ExercicioDaaula16_17;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informa o numero para criar a tabela");
		int numero = scan.nextInt();
		
		for(int i =1 ; i < 10; i++) {
			
			System.out.println(numero+"*"+1+"="+numero*i);
			
		}
		

	}

}
