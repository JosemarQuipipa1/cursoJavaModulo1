package com.quipipa.cursojava.aula43_01labs;

public class ContaBancaria {
	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	public ContaBancaria() {
		
	}

	public ContaBancaria(String nomeCliente, String numConta, double saldo) {
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean sacar(double valor ) {
		if((this.saldo - valor )>=0) {
			this.saldo = this.saldo - valor;
			return true;
		}
		return false;
	}
	
	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;	
		System.out.println("Valor depositado com sucesso"); 
	}
	
	@Override
	public String toString() {
		String s = "ContaPoupaça [";
		s+= "Nome de Cliente: " + nomeCliente;
		s+= "Numero de Conta: " + numConta;
		s+= "Saldo da conta: " + saldo;
		s+= "]";
		return s;
	}
	
	
	

}
