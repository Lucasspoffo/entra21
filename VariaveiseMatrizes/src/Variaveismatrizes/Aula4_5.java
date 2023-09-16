package Variaveismatrizes;

import java.util.Arrays;
import java.util.Random;

public class Aula4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random generator = new Random();
		/*
		 * 10. Crie em Java uma matriz 3x5 de inteiros, preencha a matriz utilizando
		 * Randon e depois:
		 * 
		 * a) Informe quantas vezes a matriz repete o número 0;
		 * 
		 * b) A quantidade de números pares;
		 * 
		 * c) A quantidade de números ímpare
		 */

		int[][] matriz = new int[3][5];
		// monta a matriz com valores randomicos
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {

				matriz[linha][coluna] = generator.nextInt(100);
			}
		}

		int valoresZero = 0;
		int numPar = 0;
		int numImpar = 0;

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.print(matriz[linha][coluna] + ", ");

				// a) Informe quantas vezes a matriz repete o número 0;
				if (matriz[linha][coluna] == 0) {
					valoresZero++;
				}

				// b) A quantidade de números pares;
				if (matriz[linha][coluna] % 2 == 0) {
					numPar++;
				} else {
					// c) A quantidade de números ímpare
					numImpar++;
				}
			}
			System.out.println();
		}

		System.out.println("Numero 0: " + valoresZero);
		System.out.println("Numero pares: " + numPar);
		System.out.println("Numero impares: " + numImpar);
	}

}
