package com.quipipa.cursojava.aula20;

public class Matriz {

	public static void main(String[] args) {
		
		double [][] notaAlunos = new double[30][4];
		
		notaAlunos [0][0] = 10;
		notaAlunos [0][1] =  7;
		notaAlunos [0][2] =  8;
		notaAlunos [0][3] =  9.5;
		
		notaAlunos [1][0] =  9;
		notaAlunos [1][1] =  8;
		notaAlunos [1][2] =  7;
		notaAlunos [1][3] =  9;

		for( int i = 0; i < notaAlunos.length ; i++) {
			for(int j = 0; j < notaAlunos[i].length; j++) {
				System.out.print(notaAlunos[i][j]+ "");
			}
			System.out.println();
		}
		double soma;
		for( int i = 0; i < notaAlunos.length ; i++) {
			soma=0;
			for(int j = 0; j < notaAlunos[i].length; j++) {
				
				soma += notaAlunos[i][j];
				
			}
			System.out.println("A media do aluno"+i+ " e " +(soma/4));
		}
	}

}
