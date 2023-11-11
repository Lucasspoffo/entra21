package trabalho;

import java.time.LocalDate;
import java.util.ArrayList;

public class Nataçao extends Clube {
	
	private String modalidadePrincipal;
	private int medalhas;
	private String categoria;
	private boolean exameDoping;
	
			
	
	
	public Nataçao(LocalDate dataFimContrato, ArrayList<String> hablilidades, String patrocinio, double salario,
			int titulos, Pessoa dadosPessoais, String modalidadePrincipal, int medalhas, String categoria, boolean exameDoping) {
		super(dataFimContrato, hablilidades, patrocinio, salario, titulos, dadosPessoais);
		setModalidadePrincipal(modalidadePrincipal);
		setMedalhas(medalhas);
		setCategoria(categoria);
		setExameDoping(exameDoping);
		
		
	}
	
	public String getModalidadePrincipal() {
		return modalidadePrincipal;
	}
	
	public void setModalidadePrincipal(String modalidadePrincipal) {
		
		if (modalidadePrincipal.isBlank() || modalidadePrincipal == null) {
			
			throw new IllegalArgumentException("modalidade inválida");
		}
		
		else {this.modalidadePrincipal = modalidadePrincipal;}
	}
	
	public int getMedalhas() {
		return medalhas;
	}
	public void setMedalhas(int medalhas) {
		
		if (medalhas < 0) {
			
			throw new IllegalArgumentException("numero de medalhas inválido");
		}
		
		else {this.medalhas = medalhas;}
		}
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {

		if (categoria.isBlank() || categoria == null) {
			
			throw new IllegalArgumentException("categoria inválida");
		}
		
		else {this.categoria = categoria;}
	}
	
	
	public boolean isExameDoping() {
		return exameDoping;
	}
	
	public void setExameDoping(boolean exameDoping) {
		this.exameDoping = exameDoping;
	}
	
	public String inscreverEmCompeticao(String nomeCompeticao) {
		
		if (exameDoping == false) {
			
			return "O atleta pode ser inscrito na Competição " + nomeCompeticao;
		}
		
		else {return "O atleta NÃO pode ser inscrito na Competição " + nomeCompeticao;}
		
	}
	

	@Override
	public String ProrrogarContratoUmAno() {
		
		
		
		if (medalhas > 3 && (exameDoping == false)) {
			
			setDataFimContrato(getDataFimContrato().plusYears(1));
			
			return "contrato prorrogado até " + getDataFimContrato();
			
		}
		
		else {return "as condições do atleta não permitem a prorrogação do contrato";}
		
		
	}
	
	public void adicionarMedalha(int numMedalhasGanhas) {
		
		setMedalhas(medalhas + numMedalhasGanhas);
	}
	
	
	
	
	public void exameDoping(String resultado) {
		
		if (resultado.equalsIgnoreCase("positivo")) {
			setExameDoping(true);
		}
		
		else if (resultado.equalsIgnoreCase("negativo")) {
			setExameDoping(false);
		}
		}

	@Override
	public String toString() {
		return super.toString() + " é atleta de  Nataçao, tendo como modalidade principal o nado: " + modalidadePrincipal + ", conquistou " + medalhas + " medalhas, é da categoria " 
				+ categoria + " e seu exame de Doping teve como resultado: " + exameDoping;
	}

	
	
}

