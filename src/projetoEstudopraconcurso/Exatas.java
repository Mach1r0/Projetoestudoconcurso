package projetoEstudopraconcurso;

public class Exatas extends Disciplinas {
	
	private String questoesbinarias;
	
	public Exatas(String nome, String discursiva, String questoes, String grau, String questoesbinarias, String resposta) {
		this.questoes = questoes;
		this.graudedificuldade = grau;
		this.nomeMateria = nome;
		this.questoesbinarias = questoesbinarias;		
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

