package Variaveismatrizes;

import java.util.Scanner;

public class Aula2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		/*
		 * 7. Faça um algoritmo que coloque o número 0 no índice que o usuário escolheu
		 * e por fim printe o vetor.
		 * 
		 */

		int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("Escolha um índice");
		int indice = entrada.nextInt();

		vetor[indice] = 0;

		for (int i = 0; i < vetor.length; i++) {

			System.out.println(vetor[i]);
		}

		/*
		 * 8. Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor
		 * de 12 posições do tipo real.
		 * 
		 * Imprima quais valores desses informados são maiores que a média dos valores.
		 * 
		 */
	
	
		float [] vetor1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		
		
		float soma = 0;
		// int i = 0;
		
		for (int indice1 = 0; indice1 < vetor.length; indice1++) {
			soma = soma + vetor1 [indice1];
			}
		
		float media = soma / vetor.length;
		
		String valoresMaiorQueAMedia = "";
		
		for (int indice1 = 0; indice < vetor.length; indice1++) {
			
			if (vetor1[indice1] > media) {
				valoresMaiorQueAMedia += vetor1[indice1] + ", ";
				
				
			}
			
			
			System.out.println();
			System.out.println();
			
		}
		
		
		
	
	
	
	}

}
