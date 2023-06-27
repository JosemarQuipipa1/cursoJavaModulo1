package com.quipipa.cursojava.aula16;

public class LoopWhile_doWhile {

	public static void main(String[] args) {
			
		int i = 1;
		int max = 10;
		
		System.out.println(" O White antes de executar o codigo dentro do bloco, primeiro testa a condicao");
		
		while(i<max) {
			System.out.println("valor do "+i);
			i++;
		}
		
		System.out.println(i);
		
		
		System.out.println(" O do-while primeiro executa o codigo dentro do bloco,  depois testa a condicao");
		
		do {
			System.out.println("valor do i com do-while "+i);
			i++;
		}while(i<15);

	}

}
