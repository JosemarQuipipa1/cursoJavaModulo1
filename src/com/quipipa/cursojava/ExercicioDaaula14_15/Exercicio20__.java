package com.quipipa.cursojava.ExercicioDaaula14_15;

import java.util.Scanner;

public class Exercicio20__ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Informa a primeira nota");
		double nota1 = scan.nextDouble();
		System.out.println(" Informa a segunda nota");
		double nota2 = scan.nextDouble();
		System.out.println(" Informa a terceira nota");
		double nota3 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		if(media == 10) {
			System.out.println(" Aluno aprovado com media "+media);
		}else if( media >= 7) {
			System.out.println(" Aluno aprovado com media "+media);
		}else if(media<7) {
			System.out.println(" Aluno reprovado com media "+media);	
		}
		
	}

}
