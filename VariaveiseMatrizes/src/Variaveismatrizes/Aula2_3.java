package Variaveismatrizes;

import java.util.Scanner;

public class Aula2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		/*
		 * 9. Faça um programa para ler os valores de dois vetores de inteiros, cada um
		 * contendo 10 elementos.
		 * 
		 * Crie um terceiro vetor em que cada elemento é a soma dos valores contidos nas
		 * posições respectivas dos vetores originais.
		 * 
		 * Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9]. Exiba, ao
		 * final, os três vetores na tela.
		 * 
		 */

		
		int tamanho = 3; //alterar para 10
		
		int[] VetorUm = new int[tamanho];
		int[] VetorDois = new int[tamanho];
		int[] VetorTres = new int[tamanho];
		//vetor1 = [1, 2, 3,]
		
		VetorUm [0] = 1;
		VetorUm [1] = 2;
		VetorUm [2] = 3;
		
		//vetor2 = [1, 5, 6,]
		
		VetorDois [0] = 1;
		VetorDois [1] = 5;
		VetorDois [2] = 6;
		
		for (int i = 0; i < tamanho; i++) {
			
			VetorTres[i] = VetorUm[i] + VetorDois[i];}
	

		for (int i = 0; i < tamanho; i++) {
			
			System.out.println(VetorTres[i]);}
	
		
		
		
		}
		
	}


