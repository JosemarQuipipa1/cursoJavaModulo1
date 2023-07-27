package com.quipipa.cursojava.aula36;

public class Main {

	public static void main(String[] args) {


	Contacto contacto = new Contacto();
	
	contacto.setNome("Josemar");
	System.out.println(contacto.getNome());
	//System.out.println(contacto.getTelefone());
	
	Endereco endereco = new Endereco();
	
	endereco.setNomeRua("Kalawenda");
	endereco.setNumero("22");
	endereco.setComplemento("2356");
	endereco.setCep("568-89");
	endereco.setCidade("Luanda");
	endereco.setEstado("Angola");
	
	//Interligação das duas classes
	
	contacto.setEndereco(endereco);
	
	Telefone telefone = new Telefone();
	
	telefone.setTipo("NOKIA");
	telefone.setDdd("hh-123");
	telefone.setNumero("943241716");
	
	Telefone telefone2 = new Telefone();
	telefone2.setTipo("NOKIA");
	telefone2.setDdd("hh-123");
	telefone2.setNumero("943241716");
	
	Telefone[] telefones = new Telefone[2];
	telefones[0] = telefone;
	telefones[1] = telefone2;
	
	
	//contacto.setTelefone(telefone);
	
	
	if(contacto != null && contacto.getEndereco()!= null) {
		
		System.out.println(contacto.getEndereco().getCidade());	
	}
	
	contacto.setTelefones(telefones);
	
	
	/*if(contacto.getTelefone() != null && contacto != null) {
		System.out.println(contacto.getTelefone().getTipo());
		System.out.println(contacto.getTelefone().getNumero());
	}*/
	
	if(contacto != null && contacto.getTelefones()!=null) {
		for(Telefone t : contacto.getTelefones()) {
			System.out.println(t.getTipo()+"segundo numero"+t.getNumero());
		}
	}
	
	}

}
