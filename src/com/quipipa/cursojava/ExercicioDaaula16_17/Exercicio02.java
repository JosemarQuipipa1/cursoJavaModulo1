package com.quipipa.cursojava.ExercicioDaaula16_17;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean verificar = true;
		
		do {
			
		System.out.println("Informa novo usuario para o cadastrameto");
		String usuario = scan.next();
		System.out.println("Informa uma novo senha para o cadastrameto");
		String senha = scan.next();
		
		if(usuario.equals(senha)) {
			System.out.println("Erro");  
			
		}else {
			System.out.println(" Usuario cadastrado com sucesso");
			verificar = false;
		}

		}while(verificar);
	}

}
