package com.quipipa.cursojava.ExercicioDaaula24_06;

public class Main {

	public static void main(String[] args) {
		
		Contacto contacto1 = new Contacto();
		
		contacto1.nome ="Branco";
		contacto1.endereco = "Kalawenda";
		contacto1.email = "branco@gmail.com";
		
		contacto1.telefones = new String[5];
		
		contacto1.telefones[0] = "99999-9999";
		contacto1.telefones[1] = "99999-9991";
		contacto1.telefones[2] = "99999-9992";
		contacto1.telefones[3] = "99999-9993";
		
		for(int i=0; i < contacto1.telefones.length; i++) {
			
			System.out.println("Contacto1 " + contacto1.telefones[i]);
		}
		
	}

}
