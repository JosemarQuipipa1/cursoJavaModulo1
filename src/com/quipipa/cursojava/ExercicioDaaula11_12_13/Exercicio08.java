package com.quipipa.cursojava.ExercicioDaaula11_12_13;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informa quanto voce ganha por hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Informa horas trabalhadas durante o mes");
		int hora = scan.nextInt();
		
		
		double salario = valorHora * hora;
		
		System.out.println("O salario do trabalhador "+salario);
		

	}

}
