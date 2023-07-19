package com.quipipa.cursojava.aula27_02labs;

public class ContaCorrente {
	   String numero;
	   String agencia;
	   boolean especial;
	   double limiteEspecial;
	   double saldo;
	   double valorEspecialUsado;
	   
	   
	   boolean realizarSaque(double quantiaSacar) {
		   
		   // tem saldo na conta
		   if(saldo>=quantiaSacar) {
			   saldo -= quantiaSacar;
			   return true;
		   }else{
			  
			   if(especial) {
				   double saldoLimite = limiteEspecial + saldo;
				   if(saldoLimite>=quantiaSacar) {
					   
					   saldo -=quantiaSacar;
					   return true;
				   }else {
					   return false;
				   }
				   
				   // verificar se o limite especial tem saldo
				    
			   }else {
				   return false; // Não é especial e não tem saldo suficiente
			   }
			   
		   }
		   
		   
	   }

	   void depositar(double valorDepositar) {
		   saldo += valorDepositar;
	   }
	   
	   void consultarSaldo(){
		   System.out.println("Saldo atual da conta "+saldo);
	   }
	   
	   boolean verificarUsoChequeEspecial() {
		   return saldo < 0;
		   
	   }
}
