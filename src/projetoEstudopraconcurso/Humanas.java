package projetoEstudopraconcurso;

public class  Humanas  extends Disciplinas{
	
	private String questoesdiscurvisas;
	
	public Humanas(String nome, String discursiva, String questoes, String grau, String resposta) {
		this.questoesdiscurvisas = discursiva;
		this.questoes = questoes;
		this.graudedificuldade = grau;
		this.nomeMateria = nome;
		this.resposta = resposta;
	}
	
	public String getQuestoesdiscurvisas() {
		return questoesdiscurvisas;
	}

	public void setQuestoesdiscurvisas(String questoesdiscurvisas) {
		this.questoesdiscurvisas = questoesdiscurvisas;
	}
	
	@Override
	public String toString() {
			return "nome: " + nomeMateria + ", questoes:" + questoes + 
			", grau de dificuldade: " + graudedificuldade + ", questao discursiva" +questoesdiscurvisas + ", resposta:" + resposta;
	}
}
