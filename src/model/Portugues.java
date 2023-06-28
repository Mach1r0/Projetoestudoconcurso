package model;

public class Portugues extends Questao {

	private String questoesDiscursivas;

	public String getQuestoesDiscursivas() {
		return questoesDiscursivas;
	}

	public void setQuestoesDiscursivas(String questoesDiscursivas) {
		this.questoesDiscursivas = questoesDiscursivas;
	}

	public Portugues(String questoesDiscursivas, String resposta, String nomeMateria,
			String graudeDificuldade, String assunto,
			String concurso, String prova, String enunciado) {
		super(resposta, nomeMateria, graudeDificuldade, assunto, enunciado, concurso, prova);
		this.questoesDiscursivas = questoesDiscursivas;
	}

	@Override
	public String toString() {
		return "Materia humanas: " + nomeMateria + ", assunto:" + assunto + ", grau de dificuldade: "
				+ graudeDificuldade + ",\n"
				+ "questao discursiva: "
				+ questoesDiscursivas + ", resposta:" + resposta;
	}

}
