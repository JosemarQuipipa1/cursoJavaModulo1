package com.quipipa.cursojava.aula20;

public class MatrizTridimensional {

	public static void main(String[] args) {
		
		int [][][] matrizTridimensional = new int[3][3][3];
		
		for(int i=0; i < matrizTridimensional.length; i++) {
			for( int j=0; j<matrizTridimensional[i].length; j++) {
				for(int k = 0; k<matrizTridimensional[i][j].length; k++) {
					matrizTridimensional[i][j][k]= i+j+k;
					
				}
			}
		}
		int soma = 0;
		int Somapares = 0;
		int SomaImpares = 0;
		
		for(int i=0; i < matrizTridimensional.length; i++) {
			for( int j=0; j<matrizTridimensional[i].length; j++) {
				for(int k = 0; k<matrizTridimensional[i][j].length; k++) {
					System.out.println("i-"+i+" j-"+j+" k-"+k);
					soma+=matrizTridimensional[i][j][k];
					
					if(matrizTridimensional[i][j][k] % 2 == 0) {
						Somapares += matrizTridimensional[i][j][k];
					}else {
						
						SomaImpares += matrizTridimensional[i][j][k];
					}
					
				}
			}
	}
		System.out.println("Soma "+soma);
		System.out.println("Soma pares "+Somapares);
		System.out.println("Soma pares "+SomaImpares);

}
}
