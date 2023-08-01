package com.quipipa.cursojava.aula36_03labs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o nome do Curso");
		String nome = scan.nextLine();
		
		System.out.println("Entre com o horario do Curso");
		String horario = scan.nextLine();
		
		System.out.println("Entre com o nome do Professor");
		String nomeProf = scan.nextLine();
		System.out.println("Entre com o nome Departamento do Professor");
		String departamentoProf = scan.nextLine();
		System.out.println("Entre com o email do Professor");
		String emailProf = scan.nextLine();
		
		Curso curso = new Curso();
		curso.setNome(nome);
		curso.setHorario(horario);
		
		Aluno[] alunos = new Aluno[5];
		
		Professor professor = new Professor();
		professor.setNome(nomeProf);
		professor.setDepartamento(departamentoProf);
		professor.setEmail(emailProf);
		
		curso.setProfessor(professor);
		
		System.out.println("----Aluno-----");
		
		for(int i = 0; i<5; i++) {
			
			
			System.out.println("Entre com o nome do aluno " +(i+1));
			String nomeAluno = scan.nextLine();
			
			System.out.println("Entre com a matricula do Aluno " +(i+1));
			String matriculaAluno = scan.nextLine();
			
			double[] notas = new double[4];
			
			for(int j = 0; j<4; j++) {
				System.out.println("Entre com a nota do aluno " +(j +1));
				notas[j] = scan.nextDouble();
			}
			
			Aluno aluno = new Aluno();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matriculaAluno);
			aluno.setNotas(notas);
			
			alunos[i]=aluno;
		}
		
		curso.setAluno(alunos);
		System.out.println(curso);
		System.out.println(curso.obterMediaTurma());
		
				

	}
	
	

}
