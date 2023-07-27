package com.quipipa.cursojava.aula35_01;

public class MetodoRecursivo {
	
	public static int fatorial(int num) {

		if (num == 0) {

			return 1;
		}

		return num * fatorial(num - 1);
	}

}
