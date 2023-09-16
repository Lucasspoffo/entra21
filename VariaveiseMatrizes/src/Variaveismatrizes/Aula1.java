package Variaveismatrizes;
import java.util.Scanner;

public class Aula1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int idades [] = new int[5];
		
		idades [0] = 18;
		idades [1] = 15;
		idades [2] = 27;
		idades [3] = 9;
		idades [4] = 17;
		
		
		System.out.println("idades" + idades [0]);
		
		
		int velhice [] = new int[4];
		int soma = 0;
		int media = 0;
		
		
		velhice [0] = 26;
		velhice [1] = 17;
		velhice [2] = 22;
		velhice [3] = 16;
		
		soma = (velhice [0] + velhice [1] + velhice [2] + velhice [3]);
		media = soma / 4;
		
		System.out.println("velhices" +  velhice);
		System.out.println("velhices" +  velhice [0]);
		System.out.println("velhices" +  velhice [3]);
		System.out.println("velhices somadas é igual a " +  soma);
		System.out.println("a media das velhices é igual a " +  media);
		
		
		for (int i = 1; i<=21; i++) {
			System.out.println(velhice [i]);
		}
		
	
	
	
	
	String pessoa [] = new String[21];
	
	pessoa [0] = "Beatriz";
	pessoa [1] = "Bruna";
	pessoa [2] = "Maria";
	pessoa [3] = "Fernando";
	pessoa [4] = "Rodrigo";
	pessoa [5] = "Arthur";
	pessoa [6] = "Miguel";
	pessoa [7] = "Samuca";
	pessoa [8] = "Ademir";
	pessoa [9] = "Ana";
	pessoa [10] = "Eduardo";
	pessoa [11] = "Vinicius";
	pessoa [12] = "Sabrina";
	pessoa [13] = "Luana";
	pessoa [14] = "Nicole";
	pessoa [15] = "Fernando";
	pessoa [16] = "Pedro";
	pessoa [17] = "Lucas";
	pessoa [18] = "Jair";
	pessoa [19] = "Dilma";
	pessoa [20] = "Molusco";
	
	for (int i = 0; i < 21; i++) {
		
		System.out.println(pessoa [i]);}
	}

}
