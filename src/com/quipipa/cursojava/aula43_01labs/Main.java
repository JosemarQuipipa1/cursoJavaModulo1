package com.quipipa.cursojava.aula43_01labs;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("*** Teste ContaBancaria ***");
		ContaBancaria contaSimples  = new ContaBancaria();
		contaSimples.setNomeCliente("Cliente Conta Simples");
		contaSimples.setNumConta("11111-11");
		
		contaSimples.depositar(100);
		realizarSaque(contaSimples, 50);
		realizarSaque(contaSimples, 70);
		
		System.out.println(contaSimples);
		System.out.println();
		
		
		System.out.println("*** Teste ContaPopança ***");
		ContaPoupanca contaPopanca  = new ContaPoupanca();
		contaPopanca.setNomeCliente("Cliente Conta Simples");
		contaPopanca.setNumConta("22222-22");
		contaPopanca.setDiaRendimento(31);
		
		contaPopanca.depositar(100);
		realizarSaque(contaPopanca, 50);
		realizarSaque(contaPopanca, 70);
		
			
		if(contaPopanca.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento, novo saldo e de = " +contaPopanca.getSaldo());
		}else {
			System.out.println("Hoje nao e o dia de Rendimento, novo saldo nao calculado");
		}
		System.out.println(contaPopanca);
		
		
		System.out.println();
		
		System.out.println("*** Teste ContaEspecial ***");
		ContaEspecial contaEspecial  = new ContaEspecial();
		contaEspecial.setNomeCliente("Cliente Conta especial");
		contaEspecial.setNumConta("33333-33");
		contaEspecial.setLimite(50);
		
		contaEspecial.depositar(100);
		realizarSaque(contaEspecial, 50);
		realizarSaque(contaEspecial, 70);
		realizarSaque(contaEspecial, 80);
		
		System.out.println(contaEspecial);
	}

	
	private static void realizarSaque(ContaBancaria conta, double valor ) {
		if(conta.sacar(valor)) {
		  System.out.println("Saque realizado com sucesso, novo saldo = " + conta.getSaldo());
		}else {
		  System.out.println("Saldo insuficiente para realizar o saque de = " + valor +" ; Saldo da Conta: "+ conta.getSaldo());
		}
	}

}
  