package buble;

public class BubleSort {
	public static void main(String[] args) {
		int[] numeros = {100, -10, 9, 20, 1, 9, 4, 6, 1, -2};

		for (int i = 0; i < numeros.length - 1; i++) {
			for(int j = 0; j < numeros.length - 1; j++) {
				if(numeros[j] > numeros[j+1]) {
					int temp = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = temp;
				}
			}
		}
		for(int num : numeros) {
			System.out.println(num);
		}
	}

}
