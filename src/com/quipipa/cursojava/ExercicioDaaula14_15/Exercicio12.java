package com.quipipa.cursojava.ExercicioDaaula14_15;

import java.util.Scanner;

public class Exercicio12 {

	/*
	 * 12.Faça um programa para o cálculo de uma folha de pagamento, sabendo que os
	 * descontos são do Imposto de Renda, que depende do salário bruto (conforme
	 * tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do
	 * Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário
	 * Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá
	 * pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no
	 * mês. o Desconto do IR: o Salário Bruto até 900 (inclusive) - isento o Salário
	 * Bruto até 1500 (inclusive) - desconto de 5% o Salário Bruto até 2500
	 * (inclusive) - desconto de 10% o Salário Bruto acima de 2500 - desconto de 20%
	 * Imprima na tela as informações, dispostas conforme o exemplo abaixo. No
	 * exemplo o valor da hora é 5 e a quantidade de hora é 220.
	 * 
	 * Salário Bruto: (5 * 220) : R$ 1100,00 
	 * (-) IR (5%)              : R$ 55,00 
	 * (-) INSS ( 10%)          : R$ 110,00
	 *  FGTS (11%)              : R$ 121,00
	 *  Total de descontos      : R$ 165,00 
	 *  Salário Liquido         : R$ 935,00
	 ******************************************************************************/

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informa o valor da hora");
		double valorHora = scan.nextDouble();
		System.out.println("Informa o quantidade de horas trabalhadas durante o mes");
		double horas = scan.nextDouble();
		
		double SalarioBruto = valorHora*horas;
		
		double sindicato = 0.03;
		double fgts = 0.11;
		double ir = 0.05;
		double inss = 0.1;
		double desconto1 = 0.05;
		double desconto2 = 0.1;
		double desconto3 = 0.2;
		
		
		if(SalarioBruto<=900){
			System.out.println("Isento");
			System.out.println("Salario Bruto: R$"+SalarioBruto);
			System.out.println("IR R$"+SalarioBruto*ir);
			System.out.println("INSS R$"+SalarioBruto*inss);
			System.out.println("FGTS R$"+SalarioBruto*fgts);
			System.out.println("Total de descontos R$"+(+SalarioBruto*inss+SalarioBruto*ir));
			System.out.println("Salario Liquido: R$"+(SalarioBruto-SalarioBruto*inss-SalarioBruto*ir));
		}else if(SalarioBruto<=1500) {
			System.out.println("Desconto: R$"+SalarioBruto*desconto1);
			System.out.println("Salario Bruto: R$"+SalarioBruto);
			System.out.println("IR R$"+SalarioBruto*ir);
			System.out.println("INSS R$"+SalarioBruto*inss);
			System.out.println("FGTS R$"+SalarioBruto*fgts);
			System.out.println("Total de descontos R$"+(+SalarioBruto*inss+SalarioBruto*ir));
			System.out.println("Salario Liquido: R$"+(SalarioBruto -SalarioBruto*inss-SalarioBruto*ir ));
		}else if(SalarioBruto<=2500) {
			System.out.println("Desconto: R$"+SalarioBruto*desconto2);
			System.out.println("Salario Bruto: R$"+SalarioBruto);
			System.out.println("IR R$"+SalarioBruto*ir);
			System.out.println("INSS R$"+SalarioBruto*inss);
			System.out.println("FGTS R$"+SalarioBruto*fgts);
			System.out.println("Total de descontos R$"+(+SalarioBruto*inss+SalarioBruto*ir));
			System.out.println("Salario Liquido: R$"+(SalarioBruto-SalarioBruto*inss-SalarioBruto*ir ));
	   }else{
			System.out.println("Desconto: R$"+SalarioBruto*desconto3);
			System.out.println("Salario Bruto: R$"+SalarioBruto);
			System.out.println("IR R$"+SalarioBruto*ir);
			System.out.println("INSS R$"+SalarioBruto*inss);
			System.out.println("FGTS R$"+SalarioBruto*fgts);
			System.out.println("Total de descontos R$"+(+SalarioBruto*inss+SalarioBruto*ir));
			System.out.println("Salario Liquido: R$"+(SalarioBruto-SalarioBruto*inss-SalarioBruto*ir));

}
}
}