package Variaveismatrizes;

import java.util.Random;
import java.util.Scanner;

public class Aula4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		/*
		 * 7. Crie uma matriz 3x3 do tipo, onde o usuário irá preencher os valores
		 * utilizando o scanner, ao fim imprima a matriz
		 * 
		 */

		int[][] matris = new int[3][3];

		System.out.println("informe o numeros para compor uma matriz 3x3");

		for (int linhas1 = 0; linhas1 < 3; linhas1++) {

			for (int colunas1 = 0; colunas1 < 3; colunas1++) {

				matris[linhas1][colunas1] = entrada.nextInt();
			}

		}

		for (int linhas = 0; linhas < 3; linhas++) {

			for (int colunas = 0; colunas < 3; colunas++) {

				System.out.print(matris[linhas][colunas]);

			}

			System.out.println();

		}

	

	}

}
