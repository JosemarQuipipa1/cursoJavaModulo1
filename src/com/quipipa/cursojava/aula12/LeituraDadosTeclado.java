package com.quipipa.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		
		// Aqui serve para digitar um nome completo
		
		/*System.out.println("Digite seu Nome Completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println(" Seu nome completo é : " + nomeCompleto);
		
		// Aqui serve para digitar uma string ou um nome
		
		System.out.println("Digite o sei«u primeiro nome");
		String PrimeiroNome = scan.next();
		System.out.println("O seu primeiro nome é: " +PrimeiroNome);
		
		System.out.println("Digite a sua idade");
		int idade = scan.nextInt();
		System.out.println("A sua idade é: "+ idade);
		
		System.out.println("Digite a sua altura");
		double altura = scan.nextDouble();
		System.out.println("A sua altura e : " + altura);
		
		 */
		
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem um bichinho de estimação");
		
		String PrimeiroNome = scan.next();
		int idade = scan.nextInt();
		byte quantidadeFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		String nomeBichinho = scan.next();
		
		System.out.println("Voce digitou os seguintes valores ");
		System.out.println("Primeiro Nome" +PrimeiroNome);
		System.out.println("Idade: " +idade );
		System.out.println("Quantidade de Filhos: " + quantidadeFilhos);
		System.out.println("Altura: "+altura);
		System.out.println("Nome do Bichinho:" +nomeBichinho);

	}

}
