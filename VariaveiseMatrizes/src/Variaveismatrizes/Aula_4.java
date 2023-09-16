package Variaveismatrizes;

import java.util.Arrays;
import java.util.Random;

public class Aula_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int qntLinhas = 4;
		int qntColunas = 4;
		char[][] matriz = new char[qntLinhas][qntColunas];

		for (int linha = 0; linha < qntLinhas; linha++) {
			for (int coluna = 0; coluna < qntColunas; coluna++) {
			 matriz[linha][coluna] = '*';
			}
		}
		
		for (int linha = 0; linha < qntLinhas; linha++) {
			for (int coluna = 0; coluna < qntColunas; coluna++) {
				System.out.print(matriz[linha][coluna]);
			}
			System.out.println();
		}
		
		// c
		for (int linha = 0; linha < qntLinhas; linha++) {
			for (int coluna = 0; coluna < qntColunas; coluna++) {
			 if(coluna > linha) {
				 matriz[linha][coluna] = ' ';
			 } else {				 
				 matriz[linha][coluna] = '*';
			 }
			}
		}
		
		for (int linha = 0; linha < qntLinhas; linha++) {
			for (int coluna = 0; coluna < qntColunas; coluna++) {
				System.out.print(matriz[linha][coluna]);
			}
			System.out.println();
		}


		
		Random generator = new Random();
		
		
		int [][] matrizR = new int [2][2];
		
		for (int linha = 0; linha < 2; linha++) {
			for (int coluna = 0; coluna < 2; coluna++) {
				matrizR[linha] [coluna] = generator.nextInt(10);
				
			}
		}
		
int [][] matriz2 = {
		{20, 50, 30},
		{100, 60, 80}
        };
}

}


