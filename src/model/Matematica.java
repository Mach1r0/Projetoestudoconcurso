package model;

public class Matematica extends Questao {

	private Boolean questoesBinarias;

	public Matematica(Boolean questoesBinarias, String resposta, String nomeMateria,
			String graudeDificuldade, String assunto,
			String concurso, String prova, String enunciado) {

		super(resposta, nomeMateria, graudeDificuldade, assunto, enunciado, concurso, prova);
		this.questoesBinarias = questoesBinarias;
	}

	public Boolean getQuestoesBinarias() {
		return questoesBinarias;
	}

	public void setQuestoesBinarias(Boolean questoesBinarias) {
		this.questoesBinarias = questoesBinarias;
	}

	@Override
	public String toString() {
		return "Materia exatas: " + nomeMateria + ", assunto: " +
				assunto + ", grau de dificuldade: " + graudeDificuldade + ",\n" +
				"questao binaria: " + questoesBinarias + ","
				+ " reposta: " + resposta;
	}

}
