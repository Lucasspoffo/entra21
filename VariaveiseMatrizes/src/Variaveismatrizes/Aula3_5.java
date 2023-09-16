package Variaveismatrizes;

import java.util.Arrays;

public class Aula3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 4. Crie uma matriz 3 linhas e 3 colunas, preencha a mesma de A até I,
		 * posteriormente imprima a matriz.
		 * 
		 */
		
		
		char [][] matriz = new char [3][3];
		int quantlinhas = 3;
		int quantcolunas = 3;
		
		
		
		matriz [0][0] = 'A';
		matriz [0][1] = 'B';
		matriz [0][2] = 'C';
		matriz [1][0] = 'D';
		matriz [1][1] = 'E';
		matriz [1][2] = 'F';
		matriz [2][0] = 'G';
		matriz [2][1] = 'H';
		matriz [2][2] = 'I';
		
		for (int linha = 0; linha < quantlinhas; linha++) {
			
			for (int coluna = 0; coluna < quantcolunas; coluna++) {
				System.out.print(matriz[linha][coluna]);
			}
		System.out.println();
		}
		
		
		
	}

}
