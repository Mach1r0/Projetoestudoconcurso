package model;

public class Matematica extends Questao {
	
	private Boolean  questoesBinarias;
		
	
	public Boolean getQuestoesBinarias() {
		return questoesBinarias;
	}
	
	public void setQuestoesBinarias(Boolean questoesBinarias) {
		this.questoesBinarias = questoesBinarias;
	}
	
	public Matematica(String nomeMateria, String questoes, String graudeDificuldade, Boolean questoesBinarias, String resposta) {
		super(questoes, resposta, nomeMateria,  graudeDificuldade);
		this.questoesBinarias = questoesBinarias;
	}

	@Override
	public String toString() {
		return "Materia exatas: " + nomeMateria + ", questoes: " + questoes
		+ ", grau de dificuldade: " + graudeDificuldade + ",\n" + 
				"questao binaria: " + questoesBinarias + ","
		+ " reposta: " + resposta;
	}

}

