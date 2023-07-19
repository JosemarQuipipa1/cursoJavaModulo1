package com.quipipa.cursojava.aula27_02labs;

public class Main {

	public static void main(String[] args) {
		  ContaCorrente conta = new ContaCorrente();
		  conta.numero = "123456";
		  conta.agencia = "1234";
		  conta.limiteEspecial = 500;
		  conta.saldo = -10;
		  conta.valorEspecialUsado = 0;
		  conta.especial = true;
		  
		  System.out.println("Saldo da Conta " +conta.numero+" = " +conta.saldo+"kz");

		
		  boolean saqueEfetuado = conta.realizarSaque(10);
		  if(saqueEfetuado) {
			  System.out.println(" Saque efetuado com sucesso");
			  conta.consultarSaldo();
		  }else {
			  System.out.println(" Não foi possível realizar saque. Saldo insuficiente");
		  }
		  
		  System.out.println();
		  
		  saqueEfetuado = conta.realizarSaque(500);
		  System.out.println(" Tentativa de saque de 500 reais");
		  if(saqueEfetuado) {
			  System.out.println(" Saque efetuado com sucesso");
			  System.out.println("Saldo atual da conta "+  conta.saldo);
		  }else {
			  System.out.println(" Não foi possível realizar saque. Saldo insuficiente");
		  }  
		  conta.depositar(500);  
		  conta.consultarSaldo();
		  
		  if(conta.verificarUsoChequeEspecial()) {
			  System.out.println(" Esta usando Cheque Especial");
		  }else {
			  System.out.println(" Não esta usando Cheque Especial");
		  }
		
		  conta.realizarSaque(600);
		  conta.consultarSaldo();
		  
		  if(conta.verificarUsoChequeEspecial()) {
			  System.out.println(" Esta usando Cheque Especial");
		  }else {
			  System.out.println(" Não esta usando Cheque Especial");
		  }
	}

}
