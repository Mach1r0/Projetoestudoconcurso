package model;

public class Matematica extends Questao {

	private Boolean questoesBinarias;

	public Matematica(String nomeMateria,String assunto,
			String concurso, String prova, 
			Boolean questoesBinarias, String resposta, 
			String graudeDificuldade,
			String enunciado) {

		super(nomeMateria, assunto,concurso, prova, resposta, graudeDificuldade, enunciado);
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
