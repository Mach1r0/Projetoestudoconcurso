package model;

public class Exatas extends Disciplinas {
	
	//Atributos 
	
	private String questoesBinarias;
	
	//gets e sets 
	
	public String getQuestoesBinarias() {
		return questoesBinarias;
	}

	public void setQuestoesBinarias(String questoesBinarias) {
		this.questoesBinarias = questoesBinarias;
	}

	// construtor 
	
	public Exatas(String nomeMateria, String questoes, String graudeDificuldade, String questoesBinarias, String resposta) {
		super(questoes, resposta, nomeMateria,  graudeDificuldade);
		this.questoesBinarias = questoesBinarias;
	}

	/// to string 
	@Override
	public String toString() {
		return "Materia exatas: " + nomeMateria + ", questoes: " + questoes
		+ ", grau de dificuldade: " + graudeDificuldade + ",\n" + 
				"questao binaria: " + questoesBinarias + ","
		+ " reposta: " + resposta;
	}
}

