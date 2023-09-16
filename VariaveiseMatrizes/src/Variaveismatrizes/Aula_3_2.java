package Variaveismatrizes;

import java.util.Arrays;

public class Aula_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Agora criem uma segunda linha e novamente somem todas as colunas, por fim
		 * somem os valores da linho 0 e da linha 1
		 * 
		 */

		int[][] matriz = new int[2][5];

		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[0][2] = 3;
		matriz[0][3] = 4;
		matriz[0][4] = 5;
		matriz[1][0] = 6;
		matriz[1][1] = 7;
		matriz[1][2] = 8;
		matriz[1][3] = 9;
		matriz[1][4] = 11;

		double somalinha1 = 0;
		double somalinha2 = 0;
		double somatotal = 0;

		for (int linha = 0; linha < matriz[0].length; linha++) {

			somalinha1 = somalinha1 + matriz[0][linha];

		}

		for (int linha = 0; linha < matriz[1].length; linha++) {

			somalinha2 = somalinha2 + matriz[1][linha];

		}

		somatotal = somalinha1 + somalinha2;

		System.out.println("a soma das linhas é igual a " + somatotal);

	}

}
