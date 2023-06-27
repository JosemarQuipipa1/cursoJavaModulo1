package com.quipipa.cursojava.ExercicioDaaula11_12_13;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informa a sua a altura da pessoa");
		double altura = scan.nextDouble();

		System.out.println("Informa o genero da pessoa");
		String sexo = scan.next();

		double peso = 0;

		if (sexo.equals("M")) {

			peso = (72.7 * altura) - 58;
			System.out.println("O peso para o homem " + peso);

		} else if (sexo.equals("F")) {

			peso = (62.1 * altura) - 44.7;
			System.out.println("O peso para o mulher " + peso);

		} else {
			System.out.println("Informa um genero valido");
		}

		double imc = peso / (altura * altura);

		if (imc <= 18) {
			System.out.println(" Abaixo de Peso  " + imc);
		} else if (imc <= 25) {
			System.out.println("Peso ideal " + imc);
		} else if (imc <= 30) {
			System.out.println("Levemente acima do Peso " + imc);
		} else if (imc <= 35) {
			System.out.println("Obesidade grau I " + imc);
		} else if (imc <= 40) {
			System.out.println("Obesidade grau II " + imc);
		}else {
			System.out.println("Obesidade grau III (morbidade) " + imc);
		}
		
	}

}
