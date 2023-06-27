package com.quipipa.cursojava.ExercicioDaaula14_15;

import java.util.Scanner;

public class Exercicio12_ {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		double sindicato = 0.03;
		double fgts = 0.11;
		double ir = 0.05;
		double inss = 0.1;
		double desconto1 = 0.05;
		double desconto2 = 0.1;
		double desconto3 = 0.2;
		
		System.out.println("Informa o valor da hora");
		double valorHora = scan.nextDouble();
		System.out.println("Informa o quantidade de horas trabalhadas durante o mes");
		double horas = scan.nextDouble();
		
		double SalarioBruto = valorHora*horas;
		double impostoIr = SalarioBruto * ir;
		double impostoInss = SalarioBruto * inss;
		double impostoFgts = SalarioBruto * fgts;
		double totalDescontos = impostoIr + impostoInss;
		double salarioLiquido = SalarioBruto - totalDescontos;
		
		
		
		if(SalarioBruto<=900){
			System.out.println("Isento");
			System.out.println("Salario Bruto: R$"+SalarioBruto);
			System.out.println("IR R$"+impostoIr);
			System.out.println("INSS R$"+impostoInss);
			System.out.println("FGTS R$"+impostoFgts);
			System.out.println("Total de descontos R$" + totalDescontos);
			System.out.println("Salario Liquido: R$"+salarioLiquido);
		}else if(SalarioBruto<=1500) {
			System.out.println("Desconto: R$"+SalarioBruto*desconto1);
			System.out.println("Salario Bruto: R$"+SalarioBruto);
			System.out.println("IR R$"+impostoIr);
			System.out.println("INSS R$"+impostoInss);
			System.out.println("FGTS R$"+impostoFgts);
			System.out.println("Total de descontos R$" + totalDescontos);
			System.out.println("Salario Liquido: R$"+salarioLiquido);
		}else if(SalarioBruto<=2500) {
			System.out.println("Desconto: R$"+SalarioBruto*desconto2);
			System.out.println("Salario Bruto: R$"+SalarioBruto);
			System.out.println("IR R$"+impostoIr);
			System.out.println("INSS R$"+impostoInss);
			System.out.println("FGTS R$"+impostoFgts);
			System.out.println("Total de descontos R$" + totalDescontos);
			System.out.println("Salario Liquido: R$"+salarioLiquido);
	   }else{
			System.out.println("Desconto: R$"+SalarioBruto*desconto3);
			System.out.println("Isento");
			System.out.println("Salario Bruto: R$"+SalarioBruto);
			System.out.println("IR R$"+impostoIr);
			System.out.println("INSS R$"+impostoInss);
			System.out.println("FGTS R$"+impostoFgts);
			System.out.println("Total de descontos R$" + totalDescontos);
			System.out.println("Salario Liquido: R$"+salarioLiquido);
}

	}

}
