package Variaveismatrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Aula2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
		
		//*

	
		char[] vetor = { 'A', 'B', 'C', 'D', 'E', 'F' };

		int tamanho = vetor.length - 1; // percorre metade final
		// e o indice percorre a metade inicial
		char temp = ' ';
		System.out.println(Arrays.toString(vetor));
		for (int indice = 0; indice < tamanho;) {
			// temp recebe um valor antes de ele ser alterado
			temp = vetor[indice];
			// valor do vetor é alterado
			vetor[indice] = vetor[tamanho];
			// valor salvo pela temp passa a ser reatribuido
			vetor[tamanho] = temp;
			tamanho--;
			indice++;
		}

		System.out.println(Arrays.toString(vetor));

	}

}
