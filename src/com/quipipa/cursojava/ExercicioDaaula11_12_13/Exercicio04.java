package com.quipipa.cursojava.ExercicioDaaula11_12_13;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		float nota1 = scan.nextFloat();
		System.out.println("Digite a segunda nota");
		float nota2 = scan.nextFloat();
		System.out.println("Digite a terceira nota");
		float nota3 = scan.nextFloat();
		System.out.println("Digite a quarta nota");
		float nota4 = scan.nextFloat();
		
		float media = ((nota1 + nota2 + nota3 + nota4)/4);
		
		System.out.println(" A media das 4 notas bimestrais e: "+ media);
		
		
		
	}

}
