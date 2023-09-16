package Variaveismatrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Aula5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 6. Descreva um algoritmo que leia 12 valores decimais e os coloque em um
		 * vetor de 12 posições.
		 * 
		 * Em seguida, modifique o vetor de modo que os valores das POSIÇÕES ímpares
		 * sejam aumentados em 5% e os das posições pares sejam aumentados em 2%.
		 * 
		 * Imprima o vetor resultante
		 * 
		 */
		
		double numerosimpares = 0;
		double numerospares = 0;
		
		
		Scanner entrada = new Scanner (System.in);
		
		
		Double elemento [] = new Double [12];
		
		System.out.println("Informe 12 numeros decimais");
		
		for (int linha = 0; linha < elemento.length; linha++){ 
		
			elemento [linha] = entrada.nextDouble();
		
			
			if (elemento [linha] % 2 == 0) {
				
				numerospares = elemento [linha] * 1.02;
				
				
				
			}
			
			else if (elemento [linha] % 2 != 0) {
				
				numerosimpares = numerosimpares + elemento [linha];
				
			}
			
		}
		
		
		System.out.println("Resultado numeros impares " + numerosimpares * 1.05);
		
	}

}
