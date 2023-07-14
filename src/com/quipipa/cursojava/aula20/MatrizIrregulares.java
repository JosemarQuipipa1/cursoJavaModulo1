package com.quipipa.cursojava.aula20;

import java.util.Scanner;

public class MatrizIrregulares {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o numero de pessoas que serao entrevistadas");
		int numPessoas = scan.nextInt();
		
		String[][] pessoaEntrevistas = new String[numPessoas][];
		
		for(int i = 0; i<pessoaEntrevistas.length; i++) {
			
			System.out.println("Entre com a quantidade de filhos");
			int numFilhos = scan.nextInt();
			
			pessoaEntrevistas[i] = new String[numFilhos];
			
			for(int j = 0; j< pessoaEntrevistas[i].length; j++) {
				System.out.println("Informa o nome do Filho");
				pessoaEntrevistas[i][j]= scan.next();		
			}
			
		}
		
		for( int i = 0; i < pessoaEntrevistas.length; i++) {
			System.out.println("Pessoa "+i+"tem "+pessoaEntrevistas[i].length+" Filhos");
			for(int j = 0; j<pessoaEntrevistas[i].length; j++) {
				System.out.println(pessoaEntrevistas[i][j]+"");
			}
		}
		
		System.out.println();

	}

}
