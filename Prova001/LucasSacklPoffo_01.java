package Prova001;

import java.util.Scanner;

public class LucasSacklPoffo_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		/*
		 * Escreva um programa onde o usuário informa um valor e a opção desejada do que
		 * deve ser feito com o valor, sendo as opções 1-converter de dólar para real e
		 * 2-converter de real para dólar, qualquer outra opção é considerada entrada
		 * inválida.
		 * 
		 */

		// entrada:

		double dolar = 4.97;
		double resultado = 0;

		System.out.println("informe o valor que você possui");
		double valor = entrada.nextDouble();
		System.out.println(
				"o que você deseja fazer com o valor? (Digite '1' para converter de dólar para real e '2' para converter de real para dólares.");
		double opcao = entrada.nextDouble();

		// processo/saida:

		if (opcao == 1) {

			resultado = valor * dolar;

			System.out.println("Seu valor de dolares em real é igual a " + resultado);
		}

		else if (opcao == 2) {

			resultado = valor / dolar;
			System.out.println("Seu valor de reais em real é igual a " + resultado);
		}

		else {
			System.out.println("entrada inválida");
		}

	}

}
