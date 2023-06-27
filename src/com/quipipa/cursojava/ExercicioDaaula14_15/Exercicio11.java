package com.quipipa.cursojava.ExercicioDaaula14_15;

import java.util.Scanner;

public class Exercicio11 {

	/*
	 * 11.As Organizações Tabalhadora resolveram dar um aumento de salário aos seus
	 * colaboradores, e lhe contraram para desenvolver o programa que calculará os
	 * reajustes. o Faça um programa que recebe o salário de um colaborador e o
	 * reajuste segundo o seguinte critério, baseado no salário atual: 
	 * o salários até R$ 280,00 (incluindo) : aumento de 20% 
	 * o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
	 * o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10% 
	 * o salários de R$ 1500,00 em diante : aumento de 5% 
	 * Após o aumento ser realizado, informe na tela:  o salário antes do reajuste;  o percentual de
	 * aumento aplicado;  o valor do aumento;  o novo salário, após o aumento.
	 ********************************/

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informa o seu salario");
		double salario_atual = scan.nextDouble();
		
		double percetual1=0.2;
		double percetual2=0.15;
		double percetual3=0.1;
		double percetual4=0.05;
		
		double reajuste = 0;
		
		if(salario_atual <=280.00) {
			reajuste = salario_atual * percetual1;
			System.out.println("Salario atual R$ "+salario_atual+"Percetual de aumento R$: "+percetual1+" valor aumentado R$ "+reajuste+" novo salario R$ "+(salario_atual +reajuste));
		}else if(salario_atual <=700.00) {
			reajuste = salario_atual * percetual2;
			System.out.println("Salario atual R$ "+salario_atual+" Percetual de aumento R$: "+percetual2+" valor aumentado R$ "+reajuste+" novo salario R$ "+(salario_atual +reajuste));
		}else if(salario_atual <=1500.00) {
			reajuste = salario_atual * percetual3;
			System.out.println("Salario atual R$ "+salario_atual+" Percetual de aumento R$: "+percetual3+" valor aumentado R$ "+reajuste+" novo salario R$ "+(salario_atual +reajuste));
		}else {
			reajuste = salario_atual * percetual4;
			System.out.println("Salario atual R$ "+salario_atual+" Percetual de aumento R$: "+percetual4+" valor aumentado R$ "+reajuste+" novo salario R$ "+(salario_atual +reajuste));
		}
	}

}
