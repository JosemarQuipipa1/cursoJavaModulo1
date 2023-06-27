package com.quipipa.cursojava.ExercicioDaaula14_15;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma letra ");
		String letra = scan.next();
		
		if((letra.equalsIgnoreCase("a"))|| (letra.equalsIgnoreCase("e")) || (letra.equalsIgnoreCase("i")) || (letra.equalsIgnoreCase("o")) || (letra.equalsIgnoreCase("u"))){
			System.out.println("Letra digitada e vogal " + letra);
		}else {
			
			System.out.println("Letra digitada e Consoante " + letra);
		}

	}

}
