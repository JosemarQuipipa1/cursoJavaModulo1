package com.quipipa.cursojava.ExercicioDaaula11_12_13;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informa o tamanho do arquivo");
		double tamanho = scan.nextDouble();

		System.out.println("Informa a velocidade do download do link da internet");
		double velocidade = scan.nextDouble();

		double tempo = tamanho / velocidade;

		System.out.println(" Tempo do download: " + tempo);

	}

}
