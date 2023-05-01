package projetoEstudopraconcurso;

public class Exatas extends Disciplinas {
	
	private String questoesBinarias;
	
	public String getQuestoesBinarias() {
		return questoesBinarias;
	}

	public void setQuestoesBinarias(String questoesBinarias) {
		this.questoesBinarias = questoesBinarias;
	}

	public Exatas(String nomeMateria, String questoes, String graudeDificuldade, String questoesBinarias, String resposta) {
		super(questoes, resposta, nomeMateria,  graudeDificuldade);
		this.questoesBinarias = questoesBinarias;
	}
	

	@Override
	public String toString() {
		return "nome: " + nomeMateria + ", questoes: " + questoes
		+ ", grau de dificuldade: " + graudeDificuldade + ",\n" + 
				"questao binaria: " + questoesBinarias + ","
		+ " reposta: " + resposta;
	}
}

