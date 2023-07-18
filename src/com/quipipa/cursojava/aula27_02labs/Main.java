package com.quipipa.cursojava.aula27_02labs;

public class Main {

	public static void main(String[] args) {
		  ContaCorrente conta = new ContaCorrente();
		  conta.numero = "123456";
		  conta.agencia = "1234";
		  conta.limiteEspecial = 500;
		  conta.saldo = -10;
		  
		  System.out.println("Saldo da Conta " +conta.numero+" = " +conta.saldo+"kz");

	}

}
