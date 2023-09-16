package Variaveismatrizes;

import java.util.Random;
import java.util.Scanner;

public class Aula4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 9. Crie uma matriz com 7 linhas e 8 colunas do tipo inteiro, para preencher a
		 * mesma utilize o Random de java.util.Random, posteriormente imprima esta
		 * matriz;
		 * 
		 */

		Random generator = new Random();

		int[][] matrizR = new int[7][8];

		for (int linha = 0; linha < 7; linha++) {
			for (int coluna = 0; coluna < 8; coluna++) {
				matrizR[linha][coluna] = generator.nextInt(100);

				System.out.print(matrizR[linha][coluna]);
			}
			
			System.out.println();
		}

		
		
		/*
		 * 10. Crie em Java uma matriz 3x5 de inteiros, preencha a matriz utilizando
		 * Randon e depois:
		 * 
		 * a) Informe quantas vezes a matriz repete o número 0;
		 * 
		 * b) A quantidade de números pares;
		 * 
		 * c) A quantidade de números ímpares
		 * 
		 */
		
		
		Random gerador = new Random();

		int[][] matriza = new int[3][5];
		

		for (int linha = 0; linha < 7; linha++) {
			for (int coluna = 0; coluna < 8; coluna++) {
				matrizR[linha][coluna] = generator.nextInt(100);

				System.out.print(matrizR[linha][coluna]);
				
			}
		}
	}
		
		
		
	}


