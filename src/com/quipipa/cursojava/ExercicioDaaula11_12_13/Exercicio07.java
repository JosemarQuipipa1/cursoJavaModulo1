package com.quipipa.cursojava.ExercicioDaaula11_12_13;

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Informa o lado de um quadrado");
		float lado = scan.nextFloat();
		
		double area = lado * lado;
		
		System.out.println(" O quadrado da area calculada e " +(area*2));
		
	}

}
