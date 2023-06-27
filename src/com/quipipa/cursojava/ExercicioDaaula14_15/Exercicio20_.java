package com.quipipa.cursojava.ExercicioDaaula14_15;

import java.util.Scanner;

public class Exercicio20_ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

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
		
		int cont = 0;

		if (pergunta1.equalsIgnoreCase("S")) {

			cont++;
		}
		if (pergunta2.equalsIgnoreCase("S")) {

			cont++;
		}
		if (pergunta3.equalsIgnoreCase("S")) {

			cont++;
		}
		if (pergunta4.equalsIgnoreCase("S")) {

			cont++;
		}
		if (pergunta5.equalsIgnoreCase("S")) {

			cont++;
		}
		
		if(cont == 2) {
			
			System.out.println("Suspeita");
		}
		if(cont == 3 || cont == 4) {
			
			System.out.println("Cumplice");
		}
		if(cont == 5) {
			
			System.out.println("Assassino");
		}else if(cont == 0){
			System.out.println("Inocente");
		}

	}

}
