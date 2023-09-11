package Prova001;

import java.util.Scanner;

public class LucasSacklPoffo_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		/*
		 * Escreva um programa onde o usuário leia altura de 10 pessoas diferentes e
		 * depois calcule a média.
		 * 
		 * 
		 */

		// entrada:
		double altura = 0;
		double soma = 0;
		double media = 0;

		// processo:
		for (int i = 1; i <= 10; i++) {

			System.out.println("informe a altura da pessoa:");
			altura = entrada.nextDouble();

			soma = soma + altura;
		}

		// saida:

		media = soma / 10;

		System.out.println("a média das alturas é igual a " + media);

	}

}
