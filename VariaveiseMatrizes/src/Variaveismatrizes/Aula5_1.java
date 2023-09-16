package Variaveismatrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Aula5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * IMC = Massa / Altura²
		 * 
		 * 
		 * Faça um algoritmo para classificar o IMC e dizer o grau de obesidade do
		 * indivíduo, de acordo com a seguinte tabela:
		 * 
		 * 
		 * 
		 * < 18.5 Magreza
		 * 
		 * 18.5 – 24.9 Saudável
		 * 
		 * 25.0 – 29.9 Sobrepeso
		 * 
		 * 30.0 – 34.9 Obesidade Grau I
		 * 
		 * 35.0 – 39.9 Obesidade Grau II (severa)
		 * 
		 * > 40.0 Obesidade Grau III (morbida)
		 * 
		 */

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a Altura do indivíduo");
		double altura = entrada.nextDouble();
		System.out.println("Informe o peso do individuo");
		double peso = entrada.nextDouble();

		double IMC = (peso / (altura * altura));

		if (IMC <= 15.5) {
			System.out.println("essa pessoa está classificada com 'magreza'");
		}

		else if ((IMC >= 15.6) && (IMC <= 24.9)) {

			System.out.println("essa pessoa está classificada com 'saudável'");

		}

		else if ((IMC >= 25) && (IMC <= 29.9)) {

			System.out.println("essa pessoa está classificada com 'sobrepeso'");
		}

		else if ((IMC >= 30) && (IMC <= 34.9)) {

			System.out.println("essa pessoa está classificada com 'obesidade grau I'");
		}

	

	else if ((IMC >= 35) && (IMC <= 39.9)) {

		System.out.println("essa pessoa está classificada com 'obesidade grau II'");
	}

	
	else if (IMC > 40)  {

		System.out.println("essa pessoa está classificada com 'obesidade grau III'");
	}
		
	}

}
