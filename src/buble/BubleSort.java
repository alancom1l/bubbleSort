package buble;

import java.util.Arrays;

public class BubleSort {
	public static void main(String[] args) {
		int[] numeros = {100, -10, 9, 20, 1, 9, 4, 6, 1, -2};
		int contador = 0;
		
		System.out.println("Vetor desordenado: " + Arrays.toString(numeros));

		for (int i = 0; i < numeros.length - 1; i++) {
			for(int j = 0; j < numeros.length - 1 - i; j++) {
				if(numeros[j] > numeros[j+1]) {
					int temp = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = temp;
				}
				contador++;
			}
		}
		System.out.println("Voltas: " + contador);
		System.out.println("Vetor ordenado: " + Arrays.toString(numeros));
	}

}
