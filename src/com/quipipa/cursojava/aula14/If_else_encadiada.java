package com.quipipa.cursojava.aula14;

import java.util.Scanner;

public class If_else_encadiada {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Informa o preco");
		double valor = scan.nextInt();
		
		if(valor <= 10){
			
			System.out.println("Esta Barato, podes comprar");
			
		}else if ((valor > 10) && (valor < 15)){
			
			System.out.println(" Voce pode Pedir um desconto");
			
		}else if((valor >= 15) && (valor < 17)) {
			
			System.out.println("Podes pesquisar mais");
		}else {
			
			System.out.println("Muito caro");
		}
	}

}
