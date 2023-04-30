package projetoEstudopraconcurso;

public class Exatas extends Disciplinas {
	
	private String questoesbinarias;
	
	public Exatas(String nomeMateria, String discursiva, String questoes, String grauDificuldade, String questoesBinarias, String resposta) {
		this.questoes = questoes;
		this.graudedificuldade = grauDificuldade;
		this.nomeMateria = nomeMateria;
		this.questoesbinarias = questoesBinarias;		
		this.resposta = resposta;
	}
		
	public String getQuestoesbinarias() {
		return questoesbinarias;
	}

	public void setQuestoesbinarias(String questoesbinarias) {
		this.questoesbinarias = questoesbinarias;
	}
	@Override
	public String toString() {
		return "nome: " + nomeMateria + ", questões:" + questoes
		+ ", grau de dificuldade: " + graudedificuldade + ", Questões binaria?" + questoesbinarias + ", reposta:" + resposta;
	}

}

