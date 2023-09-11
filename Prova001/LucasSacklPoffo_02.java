package Prova001;

import java.util.Scanner;

public class LucasSacklPoffo_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		/*
		 * Escreva um programa onde o usuário informa os dados dos lados de um triangulo
		 * depois verifique e retorne se ele é isóscele, escaleno ou equilátero.
		 * 
		 */

		// entrada

		System.out.println("Informe os três lado de um triângulo:");
		System.out.println("Informe o lado 1");
		double lado1 = entrada.nextDouble();
		System.out.println("Informe o lado 2");
		double lado2 = entrada.nextDouble();
		System.out.println("Informe o lado 3");
		double lado3 = entrada.nextDouble();

		//entrada/saida:
		
		if ((lado1 == lado2) && (lado2 == lado3)) {

			System.out.println("o triangulo é equilatero");
		}

		else if ((lado1 != lado2) && (lado2 != lado3)) {
			System.out.println("o triangulo é escaleno");
		}

		else {
			System.out.println("o triangulo é isóceles");
		}

	}

}
