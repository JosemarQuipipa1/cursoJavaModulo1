package com.quipipa.cursojava.ExercicioDaaula14_15;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Gostaria de fazer algumas perguntas");
		System.out.println("SIM OU NAO");
		String pergunta = scan.next();
		
		if(pergunta.equalsIgnoreCase("sim")) {

		System.out.println("Telefonou para a vitima ?");
		String pergunta1 = scan.next();
		System.out.println("Esteve no local do crime ?");
		String pergunta2 = scan.next();
		System.out.println("Mora perto da vitima ?");
		String pergunta3 = scan.next();
		System.out.println("Devia para a vitima ?");
		String pergunta4 = scan.next();
		System.out.println("Ja trabalhou com a vitima?");
		String pergunta5 = scan.next();
		
		

		if (pergunta1.equalsIgnoreCase("sim") && (pergunta2.equalsIgnoreCase("sim"))
				&& (pergunta3.equalsIgnoreCase("nao")
						&& (pergunta4.equalsIgnoreCase("nao") && (pergunta5.equalsIgnoreCase("nao"))))) {
			System.out.println("Suspeita");
			
		} else  if ((pergunta1.equalsIgnoreCase("sim") && (pergunta2.equalsIgnoreCase("sim"))
				&& (pergunta3.equalsIgnoreCase("sim")
						&& (pergunta4.equalsIgnoreCase("sim")) && (pergunta5.equalsIgnoreCase("nao"))))) {
			System.out.println("Cumplice");

		} else if (pergunta1.equalsIgnoreCase("sim") && (pergunta2.equalsIgnoreCase("sim"))
				&& (pergunta3.equalsIgnoreCase("sim")
						&& (pergunta4.equalsIgnoreCase("sim") && (pergunta5.equalsIgnoreCase("sim"))))) {
			System.out.println("Assassino");

		} else {
			System.out.println("Inocente");
		}
	}
}
}