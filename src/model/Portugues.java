package model;

public class Portugues extends Questao {

	private String questoesDiscursivas;

	public String getQuestoesDiscursivas() {
		return questoesDiscursivas;
	}

	public void setQuestoesDiscursivas(String questoesDiscursivas) {
		this.questoesDiscursivas = questoesDiscursivas;
	}

	public Portugues( String nomeMateria, String assunto, String concurso,
			String prova, String discursiva, String resposta, 
			String graudeDificuldade, 
			  String enunciado) {
		super(nomeMateria, assunto,concurso, prova, resposta, graudeDificuldade, enunciado);
		this.questoesDiscursivas = discursiva;
	}

	@Override
	public String toString() {
		return "Materia humanas: " + nomeMateria + ", assunto:" + assunto + ", grau de dificuldade: "
				+ graudeDificuldade + ",\n"
				+ "questao discursiva: "
				+ questoesDiscursivas + ", resposta:" + resposta;
	}

}
