package Variaveismatrizes;
import java.util.Arrays;
import java.util.Scanner;
public class DoWhileExemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
			Scanner scan = new Scanner(System.in);
			
			// Diferente do while normal que temos a necessidade
			// de pedir o dados antes de entrar no laço de repetição
			// o Do While executará ao menos uma vez e posteriormente
			// validará se deve continuar repetindo
			int numero = 0;
			do {
				// executa ao menos uma vez
				System.out.println("Informe um numero");
				numero = scan.nextInt();
			} while (numero != 0);
		
		
		
		
	}

}
