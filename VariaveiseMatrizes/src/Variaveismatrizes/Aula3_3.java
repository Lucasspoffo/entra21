package Variaveismatrizes;

import java.util.Arrays;

public class Aula3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 3. Criem uma matriz de 5 linhas e 1 coluna, somem todos os valores
		 * Posteriormente verifique a média e imprima somente os valores que estão acima
		 * dela
		 */

		int[][] matriz = new int[5][1];

		matriz[0][0] = 11;
		matriz[1][0] = 12;
		matriz[2][0] = 13;
		matriz[3][0] = 14;
		matriz[4][0] = 15;

		int soma = 0;
		double media = 0;
		double maioresquemedia = 0;

		for (int linha = 0; linha < matriz.length; linha++) {

			soma = soma + matriz[linha][0];

		}

		media = soma / matriz.length;

		System.out.println("a soma é igual a " + soma);

		System.out.println("a média é igual a " + media);

		for (int linha = 0; linha < matriz.length; linha++) {
			if (matriz[linha][0] > media) {
				System.out.println(matriz[linha][0]);
			}

		}

	}

}
