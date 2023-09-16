package Variaveismatrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Aula5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 3. Descreva um algoritmo que leia vá lendo números inteiros até o usuário
		 * entrar com o número 0
		 * 
		 * a) Qual é o menor valor?
		 * 
		 * b) Qual é o maior valor?
		 * 
		 * c) Qual é a média dos valores?
		 * 
		 * 
		 */

		Scanner entrada = new Scanner(System.in);

		double menornum = Double.MAX_VALUE;
		double maiornum = Double.MIN_VALUE;
		double soma = 0;
		double numerodenumeros = 0;
		double media = 0;
		

		System.out.println("Informe um numero inteiro");

		int numeroint = entrada.nextInt();

		while (numeroint != 0) {

			if (numeroint < menornum) {

				menornum = numeroint;
			}

			if (numeroint > maiornum) {

				maiornum = numeroint;
			}

			soma = numeroint + soma;
			numerodenumeros ++;
			
			System.out.println("Informe um numero inteiro");

			numeroint = entrada.nextInt();
			
			
			

		}
		 media = soma / numerodenumeros;
		

		System.out.println("operação invalida");
		System.out.println("o maior numero é " + maiornum);
		System.out.println("o menor numero é " + menornum);
		System.out.println("a média é igual a " + media);

	}

}
