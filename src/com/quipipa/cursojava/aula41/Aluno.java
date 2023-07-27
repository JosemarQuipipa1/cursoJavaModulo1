package com.quipipa.cursojava.aula41;

public class Aluno extends Pessoa {

	private String[] cursos;
	private String[][] notas;

	public Aluno() {
		super();
	}

	public Aluno(String nome, String endereco, String telefone, String cpf) {
		super(nome, endereco, telefone, cpf);

	}

	public Aluno(String[] cursos, String[][] notas) {
		super();
		this.cursos = cursos;
		this.notas = notas;
	}

	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}

	public String[][] getNotas() {
		return notas;
	}

	public void setNotas(String[][] notas) {
		this.notas = notas;
	}

	public double calcularMedia() {

		return 0;

	}

	public double verificarAprovado() {
		return 0;

	}

	public void metodoQualquer() {
		this.getNome();
		super.getTelefone();

	}

	public String obterEtiquetaEndereco() {
		String s = "O enderenco do Aluno: ";
		s += this.getEndereco();
		return s;
	}

	public void imprimirEtiquetaEndereco() {
		System.out.println(this.obterEtiquetaEndereco());
		
	}
}
