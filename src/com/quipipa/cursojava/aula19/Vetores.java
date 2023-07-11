package com.quipipa.cursojava.aula19;

public class Vetores {

	public static void main(String[] args) {
		double [] temperatura = new double[365];
		
		temperatura[0] = 31.20;
		temperatura[1] = 32.20;
		temperatura[2] = 33.20;
		temperatura[3] = 34.20;
		temperatura[4] = 35.20;
		temperatura[5] = 36.20;
		
		for(int i = 0; i < temperatura.length ; i++) {
			System.out.println("A temperatura e: " +temperatura[i]);
		}
		
		
		for(double tem: temperatura) {
			System.out.println(tem);
			
		}

	}

}
