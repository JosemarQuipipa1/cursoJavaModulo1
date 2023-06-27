package com.quipipa.cursojava.ExercicioDaaula11_12_13;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informa quanto ganhas por horas");
		double valorHora = scan.nextDouble();
		
		System.out.println("Informa o numero de hora durante o mes");
		int horas = scan.nextInt();
		
		double salarioBruto = valorHora * horas;
		
		double irt = salarioBruto*0.11;
		double inss = salarioBruto * 0.08;
		double sindicato = salarioBruto *0.05;
		
		double totalDescontos = irt + inss + sindicato;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salario Bruto: " + salarioBruto);
		System.out.println("Quanto pagou ao INSS: " + inss);
		System.out.println("Quanto pagou ao IRT: " + irt);
		System.out.println("Quanto pagou ao Sindicato: " + sindicato);
		System.out.println("Total de descontos: " + totalDescontos);
		System.out.println("Salario Liquido: " + salarioLiquido);

	}

}
