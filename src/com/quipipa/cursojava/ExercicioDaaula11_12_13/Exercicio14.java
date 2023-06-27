package com.quipipa.cursojava.ExercicioDaaula11_12_13;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informa o peso do peixe");
		double peso = scan.nextDouble();
		
		double kilo = 4.0;
		double pesoExcedido = 0;
		double multa =  0;
		
		if( peso < 50) {
			System.out.println("Peso " +peso);
			System.out.println("Peso Excedido " +pesoExcedido);
			System.out.println("Multa a pagar " +"R$"+multa);
		}else {
			
			pesoExcedido = peso - 50;
			multa = pesoExcedido * kilo ;
			System.out.println("Peso " +peso);
			System.out.println("Peso Excedido " +pesoExcedido);
			System.out.println("Multa a pagar " +"R$"+multa);
			
		}
	}

}
