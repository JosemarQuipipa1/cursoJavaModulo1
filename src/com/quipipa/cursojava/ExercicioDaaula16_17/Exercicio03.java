package com.quipipa.cursojava.ExercicioDaaula16_17;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean infverificar = false;
		boolean verificarIdade = true;
		boolean verificarSalario = true;
		boolean verificarSexo = true;
		boolean verificarEstadoCivil = true;

		do {

			System.out.println("Informa um nome");
			String nameUser = scan.next();

			if (nameUser.length() <= 3) {
				System.out.println("Erro o nome tem menos de 3 caracteres");
				infverificar = true;
			} else {
				System.out.println("Usuario cadastrado com sucesso");
				infverificar = false;
			}
		} while (infverificar);

		while (verificarIdade) {
			System.out.println("Informa uma idade de 0 a 150");
			int idade = scan.nextInt();
			if (idade >= 0 && idade <= 150) {
				System.out.println(" Idade valida");
				verificarIdade = false;
			} else {
				System.out.println("Idade invalida");
				verificarIdade = true;
			}
		}
		while (verificarSalario) {
			System.out.println("Informa um salario");
			int salario = scan.nextInt();
			if (salario >= 0) {
				System.out.println(" Salario valida");
				verificarSalario = false;
			} else {
				System.out.println("Salario invalida");
				verificarSalario = true;
			}
		}
		while (verificarSexo) {
			System.out.println("Informa o sexo");
			String sexo = scan.next();
			if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M")) {
				System.out.println(" Sexo valido");
				verificarSexo = false;
			} else {
				System.out.println("Sexo invalida");
				verificarSexo = true;
			}
		}
		while (verificarEstadoCivil) {
			System.out.println("Informa o estado civil ");
			String estadoCivil = scan.next();

			switch (estadoCivil) {

			case "S":
			case "C":
			case "V":
			case "D":
			case "s":
			case "c":
			case "v":
			case "d":
				System.out.println(" Estado Civil valido");
				verificarEstadoCivil = false;
				break;
			default:

				System.out.println("Estado Civil invalido");
				verificarEstadoCivil = true;
			}

		}

	}
}
