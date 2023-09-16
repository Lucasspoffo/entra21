package Variaveismatrizes;

import java.util.Arrays;

public class Aula_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] matriz = new int[2][4];
		double soma = 0;

		matriz[0][0] = 10;
		matriz[0][1] = 20;
		matriz[0][2] = 30;
		matriz[0][3] = 40;
		matriz[1][0] = 50;
		matriz[1][1] = 60;
		matriz[1][2] = 70;
		matriz[1][3] = 80;

		for (int coluna = 0; coluna < matriz[0].length; coluna++) {

			soma = matriz[0][coluna] + soma;

		}
		System.out.println(soma);

		/*
		 * 1. Criar uma matriz com 1 linha e 10 colunas, na mesma verifique quantos
		 * valores são par e quantos valores são impar e calcule a média dos valores
		 * 
		 */

		int [][] matri = new int [1][10];
		
		
		matri [0][0] = 1;
		matri [0][1] = 2;
		matri [0][2] = 3;
		matri [0][3] = 4;
		matri [0][4] = 5;
		matri [0][5] = 6;
		matri [0][6] = 7;
		matri [0][7] = 8;
		matri [0][8] = 9;
		matri [0][9] = 11;
		
		double qtdnumerospares = 0;
		double qtdnumerosimpares = 0;
		double somadospares = 0;
		double somadosimpares = 0;
		double mediadospares = 0;
		double mediadosimpares = 0;
		
		
		
		for(int koluna = 0; koluna < matri[0].length; koluna++) {
			
			if (matri[0][koluna] % 2 == 0) {
				
				qtdnumerospares++;			
				somadospares = somadospares + matri[0][koluna];}
			
			else {
		qtdnumerosimpares++;
		somadosimpares = somadosimpares + matri[0][koluna];}
			
		}
		
		mediadospares = somadospares / qtdnumerospares;
		mediadosimpares = somadosimpares / qtdnumerosimpares;
		
		
		System.out.println("o total de numeros pares é igual a " + qtdnumerospares);
		System.out.println("o total de numero impares é igual a " + qtdnumerosimpares);
		System.out.println("a média dos numeros pares é igual a " + mediadospares);
		System.out.println("a média dos numeros impares é igual a " + mediadosimpares);
		
		
		
		
	}

}
