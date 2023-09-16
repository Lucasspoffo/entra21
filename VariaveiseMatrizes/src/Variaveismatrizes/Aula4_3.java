package Variaveismatrizes;

import java.util.Random;
import java.util.Scanner;

public class Aula4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*8. Dada a seguinte matriz, calcule: 

 

			1	2	3	4 

			5	6	7	8 

			9	10	11	12 

			13	14	15	16 

			a) A soma dos elementos de primeira coluna; 

			b) O produto dos elementos da primeira linha; 

			c) A soma de todos os elementos; 

			d) O produto da diagonal principal. */
		
		
		
		int qntlinhas = 4;
		int qntcolunas = 4;
		int somalinha1 = 0;
		int produto1 = 1;
		int somatodos = 0;
		int produtodiagona = 1;
		
		int [][] matriz = {
				
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}
						
					};
		
		
		
		for (int linha = 0; linha < qntlinhas; linha++) {
			
			for (int coluna = 0; coluna < qntcolunas; coluna++) {
			
				if(linha <= 3 && coluna == 0) {
				
					somalinha1 = matriz[linha][coluna] + somalinha1;
			 } 
			
				
			}
		}
		

		System.out.println(somalinha1);
		
		
		/*Correção:
		 * fazer somente com a linha pois é só o que altera
		 * for (int linha = 0; linha < matriz.length; linha++){
		 * soma = soma + matriz[linha][0];
		 * 
		 * System.outprintln("soma: " + soma)
		 * 
		 */
		
		
		
		
		
for (int linha = 0; linha < qntlinhas; linha++) {
			
			for (int coluna = 0; coluna < qntcolunas; coluna++) {
			
				if(coluna <= 3 && linha == 0) {
				
					produto1 = matriz[linha][coluna] * produto1 ;
			 } 
			
				
			}
		}
		

		System.out.println(produto1);
		
		
		/*Correção:
		 * fazer somente com a coluna pois é só o que altera
		 * for (int coluna = 0; coluna < matriz.[0]length; linha++){
		 * produto = produto * matriz[0][coluna];
		 * 
		 * System.outprintln("produto: " + produto)
		 * 
		 */
		
		//CAI NA PROVA <--------------------------------------------------------------------------------------------------------
		
		
		/*c) A soma de todos os elementos;
		 * 
		 */
		
		
				
		
		
		for (int linha = 0; linha < qntlinhas; linha++) {
					
					for (int coluna = 0; coluna < qntcolunas; coluna++) {
					
												
							somatodos = matriz[linha][coluna] + somatodos;
				
		}
								
		}
		
				System.out.println(somatodos);
		
				
				
				
		/* d) O produto da diagonal principal.
		 * 		
		 */
				
				
				for (int linha = 0; linha < qntlinhas; linha++) {
					
					for (int coluna = 0; coluna < qntcolunas; coluna++) {
					
						if(coluna == linha) {
						
							produtodiagona = matriz[linha][coluna] * produtodiagona ;
					 } 
					
						
					}
				}
				
				System.out.println(produtodiagona);
				
				
				
				
		}
		
	}


