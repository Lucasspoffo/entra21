package Variaveismatrizes;
import java.util.Arrays;
public class Aula3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		int quantidadedelinhas = 2;
		int quantidadedecolunas = 5;
		int [][] matriz = new int [quantidadedelinhas][quantidadedecolunas];
		
		matriz [0][0] = 2;
		matriz [0][1] = 6;
		matriz [0][2] = 8;
		matriz [0][3] = 10;
		matriz [0][4] = 15;
		matriz [1][0] = 25;
		matriz [1][1] = 89;
		matriz [1][2] = 14;
		matriz [1][3] = 20;
		matriz [1][4] = 1;
		
		for (int linha = 0; linha < 2; linha++) {
			
			for (int coluna = 0; coluna < 5; coluna++) {
				
				System.out.println("olá");
			}
			
			System.out.println("marilene");
		}*/
		
		
		int quantDeLinhas = 2;
		int quantDeColunas = 5;
		int[][] matriz = new int[quantDeLinhas][quantDeColunas];

		matriz[0][0] = 10;
		matriz[0][1] = 20;
		matriz[0][2] = 30;
		matriz[0][3] = 40;
		matriz[0][4] = 50;
		matriz[1][0] = 60;
		matriz[1][1] = 70;
		matriz[1][2] = 80;
		matriz[1][3] = 90;
		matriz[1][4] = 100;

		for (int linha = 0; linha < quantDeLinhas; linha++) {

			for (int coluna = 0; coluna < quantDeColunas; coluna++) {
				System.out.println(matriz[linha][coluna]);
			}

		}
		
		
	}

}
