package Prova001;

import java.util.Scanner;

public class LucasSacklPoffo_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		/*
		 * Uma grande loja de departamentos paga aos vendedores um salário base com base
		 * nas vendas efetuadas durante o mês, que é igual a 30% de comissão sobre o
		 * preço de cada produto vendido.
		 * 
		 * Cada vendedor, em um determinado mês, vende n produtos, onde para cada
		 * produto tem-se o preço unitário e a quantidade vendida.
		 * 
		 * O departamento de pessoal deseja obter um relatório com: nome, total de
		 * vendas (em R$ e somente duas casas decimais após a vírgula) e salário de cada
		 * vendedor. Descreva um algoritmo que gere o relatório desejado.
		 * 
		 * Para prosseguir com a entrada de dados o algoritmo deve apresentar a seguinte
		 * mensagem: “deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)”.
		 * 
		 * 
		 * 
		 * 
		 */

		// entrada:

		char opcao = 0;
		String vendedor;
		double vendas = 0;
		double salario = 0;

		System.out
				.println("Você deseja digitar dados para mais de um vendedor (digite 's' para 'SIM' e 'n' para 'NÃO')");
		opcao = entrada.next().charAt(0);
		System.out.println("informe o nome do vendedor");
		vendedor = entrada.next();
		System.out.println("informe o valor de quanto ele vendeu em reais");
		vendas = entrada.nextDouble();
		salario = vendas * 0.3;

		System.out.println(
				"O colaborador " + vendedor + " vendeu um total de " + vendas + " e seu salario é igual a " + salario);

		System.out
				.println("Você deseja digitar dados para mais algum vendedor (digite 's' para 'SIM' e 'n' para 'NÃO')");
		opcao = entrada.next().charAt(0);

		while (opcao == 's') {

			System.out.println("informe o nome do vendedor");
			vendedor = entrada.next();
			System.out.println("informe o valor de quanto ele vendeu em reais");
			vendas = entrada.nextDouble();
			salario = vendas * 0.3;

			System.out.println("Relatório: O colaborador " + vendedor + " vendeu um total de " + vendas
					+ " e seu salario é igual a " + salario);

			System.out.println(
					"Você deseja digitar dados para mais algum vendedor (digite 's' para 'SIM' e 'n' para 'NÃO')");
			opcao = entrada.next().charAt(0);
		}

		System.out.println("relatório encerrado");

	}

}
