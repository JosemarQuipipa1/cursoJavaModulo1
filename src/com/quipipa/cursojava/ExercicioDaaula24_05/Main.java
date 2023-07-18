package com.quipipa.cursojava.ExercicioDaaula24_05;

public class Main {

	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente();
		
		conta1.numero ="9999-999";
		conta1.agencia= "Viana 01";
		conta1.limteEspecial = 100;
		conta1.especial =true;
		conta1.saldo = 10;
		
		System.out.println("A pessoa com o numero:"+conta1.numero+" conta tem um saldo de: "+conta1.saldo+"$" );

	}

}
