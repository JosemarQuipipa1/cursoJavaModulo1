package com.quipipa.cursojava.aula36_01labs;

public class Main {

	public static void main(String[] args) {
		
		Agenda agenda = new Agenda();
		agenda.setNome("Agenda 2023");
		
		Telefone telefone1 = new Telefone();
		telefone1.setTipo("Celular");
		telefone1.setDdd("11");
		telefone1.setNumero("9999-999");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("Celular");
		telefone2.setDdd("11");
		telefone2.setNumero("9999-999");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone1;
		telefones[1] = telefone2;
		
		
		Endereco endereco = new Endereco();
		endereco.setNomeRua("Kalawenda");
		endereco.setNumero("Rua 12");
		
		Contacto contacto1 = new Contacto();
		contacto1.setNome("Branco");
		contacto1.setEndereco(endereco);
		contacto1.setTelefone(telefones);
		
		Contacto contacto2 = new Contacto();
		
		contacto2.setNome("Eva");
		contacto2.setEndereco(endereco);
		contacto2.setTelefone(telefones);
		
		Contacto contacto3 = new Contacto();
		contacto3.setNome("Lurdes");
		contacto3.setEndereco(endereco);
		contacto3.setTelefone(telefones);
		
		Contacto[] contactos = new Contacto[3];
		contactos[0] = contacto1;
		contactos[1] = contacto2;
		contactos[2] = contacto3;
		
																																																
		agenda.setContacto(contactos);
		
		if(agenda != null) {
			
				System.out.print(agenda.getNome());
				//System.out.print(agenda.getContacto());
				System.out.println("Nome = " +agenda.getNome()+ "\n"); 
				
				if(agenda.getContacto()!= null) {
					for(Contacto c : agenda.getContacto()) {
						System.out.println(c);
					}
			
		}
				
		

	}

}
}

