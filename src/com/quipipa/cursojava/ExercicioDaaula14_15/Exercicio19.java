package com.quipipa.cursojava.ExercicioDaaula14_15;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println(" Informa o primero numero");
		int numero1 = scan.nextInt();
		System.out.println(" Informa o segundo numero");
		int numero2 = scan.nextInt();

		System.out.println("================================");
		System.out.println("===Qual operacao deseja fazer===");
		System.out.println("================================");
		System.out.println("===1-Soma                    ===");
		System.out.println("===2-Subtracao               ===");
		System.out.println("===3-Multiplicacao           ===");
		System.out.println("===4-Divisao                 ===");
		System.out.println("================================");
		int escolha = scan.nextInt();
		double resultado = 0;
		boolean valida = true;
		switch (escolha) {
		case 1:
			resultado = (numero1 + numero2);
			System.out.println(" Soma de " + numero1 + "+" + numero2 + "=" + resultado);
			break;
		case 2:
			resultado = (numero1 - numero2);
			System.out.println(" Subtracao de " + numero1 + "-" + numero2 + "=" + resultado);
			break;
		case 3:
			resultado = (numero1 * numero2);
			System.out.println(" Multiplicacao de " + numero1 + "x" + numero2 + "=" + resultado);
			break;
		case 4:
			if (numero2 != 0) {
				resultado = (numero1 / numero2);
				System.out.println(" A Divisao de " + numero1 + "/" + numero2 + "=" +resultado);
			}
			break;

		default:
			System.out.println("Opcao invalida");
			valida = false;
		
		}
		
		if(valida) {
			
			if(resultado >= 0) {
				System.out.println(" Resultado positivo");
			}else {
				System.out.println(" Resultado Negativo");
			}
			
			if(resultado % 2 == 0) {
				
				System.out.println(" Resultado par");
			}else {
				
				System.out.println(" Resultado impar");
			}
			
		}

	}

}
