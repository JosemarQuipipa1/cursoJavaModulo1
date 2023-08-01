package com.quipipa.cursojava.aula43_02labs;

public class Main {

	public static void main(String[] args) {
		
		PessoaFisica p1 = new PessoaFisica();
		p1.setNome("Contribuiente 01");
		p1.setCpf("583.358.456-62");
		p1.setRendaBruta(1000);
		
		PessoaJuridica p2 = new PessoaJuridica();
		p2.setNome("Contribuiente 02");
		p2.setCnpj("91.403.512/0001-54");
		p2.setRendaBruta(5000);
		
		PessoaFisica p3 = new PessoaFisica();
		p3.setNome("Contribuiente 03");
		p3.setCpf(" 828.277.078-70 ");
		p3.setRendaBruta(2000);
		
		PessoaJuridica p4 = new PessoaJuridica();
		p4.setNome("Contribuiente 04");
		p4.setCnpj("10.684.822/0001-92");
		p4.setRendaBruta(3000);
		
		PessoaFisica p5 = new PessoaFisica();
		p5.setNome("Contribuiente 05");
		p5.setCpf("547.653.548-90");
		p5.setRendaBruta(3700);
		
		PessoaJuridica p6 = new PessoaJuridica();
		p6.setNome("Contribuiente 06");
		p6.setCnpj("35.434.693/0001-05");
		p6.setRendaBruta(4000);
		
		
		Contribuiente[] contribuientes = new Contribuiente[6];
		contribuientes[0] = p1;
		contribuientes[1] = p2;
		contribuientes[2] = p3;
		contribuientes[3] = p4;
		contribuientes[4] = p5;
		contribuientes[5] = p6;
		
		for(Contribuiente c : contribuientes) {
			System.out.println(c);
		}
		
		
			
			
		

	}

}
