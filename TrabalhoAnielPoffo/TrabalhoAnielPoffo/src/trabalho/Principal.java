package trabalho;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("---------------- Jogador de futebol ----------------");
		System.out.println();
		
		//Jogador de futebol
		
		LocalDate j1 = LocalDate.of(2024, 2, 10);
		ArrayList<String> listjog1 = new ArrayList<>();
		listjog1.add("velocidade");
		Pessoa jog1 = new Pessoa("Yuri Gudes", 25, "São Paulo", 1.77, 80);
		Futebol jogador1 = new Futebol(j1, listjog1, "Nike", 30000, 2, jog1, 10, 20, "Atacante", "Profissional", 35);
		
		LocalDate j2 = LocalDate.of(2025, 1, 22);
		ArrayList<String> listjog2 = new ArrayList<>();
		Pessoa jog2 = new Pessoa("Wesley Augusto", 17, "Rio de Janeiro", 1.70, 65);
		Futebol jogador2 = new Futebol(j2, listjog2, "Adidas", 10000, 0, jog2, 9, 18, "Ponta esquerda", "Base", 12);
		
		System.out.println(jogador1.toString());
		System.out.println(jogador2.toString());

		System.out.println();
		
		//IMC
		System.out.println(jogador1.getDadosPessoais().getNome() +": " + jogador1.VerificarIMC());
		System.out.println(jogador2.getDadosPessoais().getNome() +": " + jogador2.VerificarIMC());
		
		System.out.println();
		
		//Titulos
		System.out.println("O jogador " + jogador2.getDadosPessoais().getNome()+ " tem um total de "+ jogador2.getTitulos() + " titulos conquistados.");
		jogador2.addTitulosConquistados(1);
		System.out.println("O jogador " + jogador2.getDadosPessoais().getNome()+ " tem um total de "+ jogador2.getTitulos() + " titulo conquistados.");
		
		System.out.println();
		
		//Lista de habilidades
		System.out.println("Habilidades de "+jogador1.getDadosPessoais().getNome() + jogador1.getHablilidades());
		jogador1.addHabilidade("resistencia");
		System.out.println("Habilidades de "+jogador1.getDadosPessoais().getNome() + jogador1.getHablilidades());
		
		System.out.println();
		
		//Promover
		System.out.println("O jogador "+  jogador2.getDadosPessoais().getNome()+ " pertence a categoria " + jogador2.getCategoria());
		jogador2.PromoverDaBase();
		System.out.println("O jogador "+  jogador2.getDadosPessoais().getNome()+ " pertence a categoria " + jogador2.getCategoria());
		jogador2.RetornarAtleta();
		System.out.println("O jogador "+  jogador2.getDadosPessoais().getNome()+ " pertence a categoria " + jogador2.getCategoria());
		
		System.out.println();
		
		//Adicionar gols e partidas
		System.out.println("O jogador "+ jogador1.getDadosPessoais().getNome() + " tem um total de " + jogador1.getGolsMarcados()+
		" em "+jogador1.getPartidasJogadas()+ " partidas disputadas");
		jogador1.addGols(2);
		jogador1.addPartidas(1);
		System.out.println("O jogador "+ jogador1.getDadosPessoais().getNome() + " tem um total de " + jogador1.getGolsMarcados()+
				" em "+jogador1.getPartidasJogadas()+ " partidas disputadas");
		
		System.out.println();
		
		//Prorrogar contrato
		System.out.println("O jogador "+ jogador1.getDadosPessoais().getNome() + " tem contrato ate a data: " + jogador1.getDataFimContrato());
		System.out.println(jogador1.ProrrogarContratoUmAno());
		System.out.println("O jogador "+ jogador2.getDadosPessoais().getNome() + " tem contrato ate a data: " + jogador2.getDataFimContrato());
		System.out.println(jogador2.ProrrogarContratoUmAno());
		
		
		System.out.println();
		System.out.println("---------------- Nadador ----------------");
		System.out.println();
		
		//Nadador
		
		Pessoa n1 = new Pessoa("Pedro Paulo", 18, "Jaraguá do Sul-SC", 1.85, 110);
		LocalDate dataN1 = LocalDate.of(2024, 9, 11);
		ArrayList<String> listaHabilidadesN1 = new ArrayList<>();
		listaHabilidadesN1.add("Resistência");
		listaHabilidadesN1.add("Explosão");
		Nataçao nadador1 = new Nataçao(dataN1, listaHabilidadesN1, "Speedo", 5000, 2, n1, "Crwal", 4, "Júnior", false);
		
		Pessoa n2 = new Pessoa("Tiago Ferreria", 25, "Osasco-SP", 1.97, 90);
		LocalDate dataN2 = LocalDate.of(2025, 8, 12);
		ArrayList<String> listaHabilidadesN2 = new ArrayList<>();
		listaHabilidadesN2.add("Flexibilidade");
		listaHabilidadesN2.add("Técnica");
		listaHabilidadesN2.add("mentalidade vencedora");	
		Nataçao nadador2 = new Nataçao(dataN2, listaHabilidadesN2, "Hammerhead", 6000, 25, n2, "Borboleta", 12, "Sênior", false);
		
		System.out.println(nadador1.toString());
		System.out.println(nadador2.toString());
		
		System.out.println();

		//IMC
		System.out.println(n1.getNome() + ": " + nadador1.VerificarIMC());
		System.out.println(n2.getNome() + ": " + nadador2.VerificarIMC());
		
		System.out.println();
		
		//Add titulos
		System.out.println(n1.getNome() + ": " + "titulos conquistados: " + nadador1.getTitulos());
		nadador1.addTitulosConquistados(3);
		System.out.println(n1.getNome() + ": " + "titulos conquistados: " + nadador1.getTitulos());
		
		System.out.println();
		
		//Add habilidades
		System.out.println(nadador1.getHablilidades());
		nadador1.addHabilidade("Grande Capacidade Pulmonar");
		System.out.println(nadador1.getHablilidades());
		
		System.out.println();
		
		//Add medalhas
		System.out.println(n1.getNome() + ": " + "medalhas conquistadas: " + nadador1.getMedalhas());
		nadador1.adicionarMedalha(5);
		System.out.println(n1.getNome() + ": " + "medalhas conquistadas: " + nadador1.getMedalhas());
		
		System.out.println();
		
		//Prorrogar contrato e inscriçao perante exame NEGATIVO
		nadador1.exameDoping("Negativo");	
		System.out.println(nadador1.getDataFimContrato());
		System.out.println(nadador1.ProrrogarContratoUmAno());
		System.out.println(nadador1.inscreverEmCompeticao("TROFÉU MARIA LENK"));
		
		System.out.println();
		
		//Prorrogar contrato e inscriçao perante exame POSITIVO
		nadador2.exameDoping("Positivo");
		System.out.println(nadador2.getDataFimContrato());
		System.out.println(nadador2.ProrrogarContratoUmAno());
		System.out.println(nadador2.inscreverEmCompeticao("TROFÉU MARIA LENK"));
		
		System.out.println();
		System.out.println("---------------- Jogador de basquete ----------------");
		System.out.println();
		
		
		//Jogador de basquete
		
				LocalDate b1 = LocalDate.of(2024, 8, 9);
				ArrayList<String> listbask1 = new ArrayList<>();
				listbask1.add("Arremesso de tres pontos");
				Pessoa bask1 = new Pessoa("Lebron Jordan", 32, "Chicago", 2.10, 92);
				Basquete jgbask1 = new Basquete(b1, listbask1, "Nike", 50000, 12, bask1, 23, 235, 50);
				
				LocalDate b2 = LocalDate.of(2024, 10, 10);
				ArrayList<String> listbask2 = new ArrayList<>();
				listbask2.add("Velocidade");
				Pessoa bask2 = new Pessoa("Michel O'Nell", 30, "New York", 2.09, 90);
				Basquete jgbask2 = new Basquete(b2, listbask2, "Puma", 50000, 12, bask2, 23, 235, 50); 
				
				System.out.println(jgbask1.toString());
				System.out.println(jgbask2.toString());
				
				System.out.println();
				
				//IMC
				System.out.println(jgbask1.getDadosPessoais().getNome() +": " + jgbask1.VerificarIMC());
				System.out.println(jgbask2.getDadosPessoais().getNome() +": " + jgbask2.VerificarIMC());
				
				System.out.println();
				
				//Titulos
				System.out.println("O jogador " + jgbask1.getDadosPessoais().getNome()+ " tem um total de "+ jgbask1.getTitulos() + " titulos conquistados.");
				jgbask1.addTitulosConquistados(2);
				System.out.println("O jogador " + jgbask1.getDadosPessoais().getNome()+ " tem um total de "+ jgbask1.getTitulos() + " titulo conquistados.");
				
				System.out.println();
				
				//Lista de habilidades
				System.out.println("Habilidades de "+jgbask2.getDadosPessoais().getNome() + jgbask2.getHablilidades());
				jgbask2.addHabilidade("Defesa");
				System.out.println("Habilidades de "+jgbask2.getDadosPessoais().getNome() + jgbask2.getHablilidades());
				
				System.out.println();
				
				//Adicionar pontos e partidas
				System.out.println("O jogador "+ jgbask1.getDadosPessoais().getNome() + " tem um total de " + jgbask1.getPontosMarcados()+
				" pontos em "+jgbask1.getPartidasJogadas()+ " partidas disputadas");
				jgbask1.addPontos(30);
				jgbask1.addPartidas(1);
				System.out.println("O jogador "+ jgbask1.getDadosPessoais().getNome() + " tem um total de " + jgbask1.getPontosMarcados()+
				" pontos em "+jgbask1.getPartidasJogadas()+ " partidas disputadas");
				
				System.out.println();
				
				//Prorrogar contrato
				System.out.println(jgbask2.getDataFimContrato());
				System.out.println(jgbask2.ProrrogarContratoUmAno());
				
	}
}
