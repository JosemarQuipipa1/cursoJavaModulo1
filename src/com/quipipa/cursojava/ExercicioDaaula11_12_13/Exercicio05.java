package com.quipipa.cursojava.ExercicioDaaula11_12_13;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero em metro: ");
		float numero = scan.nextFloat();
		
		float medidaCm = ( numero * 100);
		
		System.out.println("O Valor "+numero+"m convertido para centimetro fica igual a " +medidaCm+"Cm");
		
		
		
		
	}

}
