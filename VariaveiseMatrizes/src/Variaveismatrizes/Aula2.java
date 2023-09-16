package Variaveismatrizes;

import java.util.Scanner;

public class Aula2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		/*
		 * 4. Crie uma array de 5 elementos e descubra:
		 * 
		 * a) Qual o maior elemento
		 * 
		 * b) Qual o menor elemento
		 * 
		 * c) A média dos elementos
		 * 
		 */

		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;

		double[] elemento = new double[5];
//vetor.lenght = tamanho do vetor (quantia de elementos)

		double soma = 0;

		for (int i = 0; i < elemento.length; i++) {

			System.out.println("informe um valor");

			elemento[i] = entrada.nextDouble();
			soma = soma + elemento[i];

			if (elemento[i] < menor) {

				menor = elemento[i];
			}

			if (elemento[i] > maior) {
				maior = elemento[i];

			}

		}

		System.out.println("Valor maior é igual a " + maior);
		System.out.println("Valor menor é igual a " + menor);
		System.out.println("a média é igual a " + (soma / elemento.length));

		/*
		 * 5. Crie um array de 10 elementos e depois peça ao usuário para informar um
		 * índice, imprima o o valor que está no vetor conforme indice informado pelo
		 * usuario
		 * 
		 */

		int[] vetor = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		System.out.println("informe um indice");
		int indice = entrada.nextInt();
		System.out.println(vetor[indice]);

		/*
		 * 6. Crie um array de elementos e depois peça ao usuário para informar um
		 * valor, verifique se este valor está presente no array e printe o índice.
		 * 
		 * 
		 */

		int [] loge = new int [10];
		
		for (int b = 0; b < loge.length; b++) {
			System.out.println("informe um valor");
			loge [1] = entrada.nextInt();
			}
		
		
		System.out.println("informe um valor para ver se ele está no array");
		
		int variavelauxiliar = entrada.nextInt();
		
		for (int b = 0; b < loge.length; b++) {
			if (loge [b] == variavelauxiliar) {
				System.out.println("indice: " + b);
			}
		
			else {System.out.println("não tem");}
			
		}
		
		
	}

}
