package com.quipipa.cursojava.ExercicioDaaula24_01;

public class Exercicio01 {

	public static void main(String[] args) {

		Lampada lampada = new Lampada();
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.garantiaMeses = 36;
		lampada.potencia = 7;
		lampada.cor = "Amarela";
		lampada.tipoAbajur = true;
		
		String[] lampadatipo = new String[5];
		
		lampadatipo[0]= "Abajur";
		lampadatipo[1]="Lampeoes";
		
		System.out.println(lampada.modelo);
		System.out.println(lampada.tensao);
		
		System.out.println();
		
		for(String lampadas: lampadatipo) {
			System.out.println(lampadas);
		}

	}

}
