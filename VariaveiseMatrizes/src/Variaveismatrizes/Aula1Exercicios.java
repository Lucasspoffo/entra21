package Variaveismatrizes;

import java.util.Scanner;

public class Aula1Exercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crie um programa que solicite 3 notas e armazene em um vetor, depois imprima
		 * a média
		 * 
		 */
		Scanner entrada = new Scanner(System.in);

		double notas[] = new double[3];

		System.out.println("Informe 3 notas");

		notas[0] = entrada.nextDouble();
		notas[1] = entrada.nextDouble();
		notas[2] = entrada.nextDouble();

		double soma = notas[0] + notas[1] + notas[2];
		double media = soma / 3;

		System.out.println(media);

		// tipo [] nome = new tipo [tamanho do vetor];

		/*
		 * 1. Faça um algoritmo que atribua valores ao vetor de acordo com o quadrado do
		 * seu índice e printe o vetor.
		 * 
		 * Ex:
		 * 
		 * [0] = 0
		 * 
		 * [1] = 1
		 * 
		 * [2] = 4
		 * 
		 * [3] = 9
		 * 
		 */

		// indice==posição (vetor [0], vetor [1]...)
		// tipo[] nome = new tipo [tamanho do vetor];

		int tamanhodovetor = 10;
		int[] vetor = new int[tamanhodovetor];

		// posição final = tamanho - 1;

		// System.out.print(vetor[0]); - imprimindo o valor de uma variável

		for (int indice = 0; indice < 10; indice++) {
			vetor[indice] = indice * indice;
		}

		for (int indice = 0; indice < 10; indice++) {
			System.out.println(vetor[indice]);
		}

		/*
		 * 2. Crie uma array de 5 elementos e no momento de imprimir, comece pelo último
		 * elemento até o primeiro elemento.
		 * 
		 */

		int[] elemento = new int[5];

		elemento[0] = 1;
		elemento[1] = 2;
		elemento[2] = 3;
		elemento[3] = 4;
		elemento[4] = 5;

		for (int i = 4; i >= 0; i--)

		{
			System.out.println(elemento[i]);
		}

		/*
		 * 3. Faça um algoritmo em que quem preenche os valores do vetor é o usuário,
		 * por fim printe o vetor (vetor de 5 posições).
		 * 
		 */

		
		int [] dado = new int [5];
		
		for (int a = 0; a < 5; a++) {
			
		dado [a] = entrada.nextInt();
			
		}
		
		
		for (int a = 0; a < 5; a++) {
			
			System.out.println(dado[a]);		
				
			}
		
	
		
		
	}

}
