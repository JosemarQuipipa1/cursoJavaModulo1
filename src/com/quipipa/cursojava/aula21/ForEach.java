package com.quipipa.cursojava.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {

		int[] notas = new int[8];

		Random random = new Random();

		for (int i = 0; i < notas.length; i++) {

			notas[i] = random.nextInt(10);
		}

		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i] + "");
		}

		System.out.println("Aqui usando For each");
		for (int nota : notas) {
			System.out.println(nota + "");
		}

		double[][] notaAlunos = new double[30][4];

		notaAlunos[0][0] = 10;
		notaAlunos[0][1] = 7;
		notaAlunos[0][2] = 8;
		notaAlunos[0][3] = 9.5;

		notaAlunos[1][0] = 9;
		notaAlunos[1][1] = 8;
		notaAlunos[1][2] = 7;
		notaAlunos[1][3] = 9;

		for (double[] notasAluno : notaAlunos) {
			for (double nota : notasAluno) {
				System.out.print(nota + "-");
			}
			System.out.println();
		}

	}

}
