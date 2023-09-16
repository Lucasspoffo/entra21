package Variaveismatrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Aula4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		
		/*
		 * 6. Crie um programa onde o usuário define quantas linhas e colunas deve ter
		 * uma matriz, e posteriormente imprima o total de elementos(posições) que está
		 * matriz tem
		 * 
		 */

		

		System.out.println("informe o numero de linhas e, posteriormente, o numero de colunas");

		int qntlinhas = entrada.nextInt();
		int qntcolunas = entrada.nextInt();

		int[][] matriz = new int[qntlinhas][qntcolunas];

		System.out.println("a quantidade de posições é igual a " + qntlinhas * qntcolunas);

			}
			
			

}
	
