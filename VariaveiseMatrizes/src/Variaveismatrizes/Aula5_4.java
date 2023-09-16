package Variaveismatrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Aula5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 4. Crie uma array de 5 elementos e descubra:
		 * 
		 * a) Qual o maior elemento
		 * 
		 * b) Qual o menor elemento
		 * 
		 * c) A média dos elementos
		 * 
		 * 
		 */

		double maiornum = Double.MAX_VALUE;
		double menornum = Double.MIN_VALUE;
		int numerodenumeros = 0;
		double soma = 0;
		double media = 0;

		int elemento[] = new int[5];

		elemento[0] = 10;
		elemento[1] = 20;
		elemento[2] = 30;
		elemento[3] = 40;
		elemento[4] = 50;

		for (int linha = 0; linha < elemento.length; linha++) {

			if (elemento[linha] < maiornum) {

				maiornum = elemento[linha];
			}

			if (elemento[linha] > menornum) {

				menornum = elemento[linha];
			}

			
			numerodenumeros++;
			
			soma = soma + elemento[linha];
			
			
			
		}
		
		media = soma / numerodenumeros;
		

		System.out.println("o maior elemento é " + maiornum);
		System.out.println("o menor elemento é " + menornum);
		System.out.println("a média é igual a " + media); 
	}

}
