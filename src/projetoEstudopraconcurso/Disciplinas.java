package projetoEstudopraconcurso;

public abstract class Disciplinas {
	
	protected String nomeMateria;
	protected String graudedificuldade;
	protected String questoes;
	protected String resposta;
	
	public Disciplinas() {
		super();
	}
	
	public String getNomeMateria() {
		return nomeMateria;
	}
	
	public void setNomeMateria(String nomeMateria) {
		this.nomeMateria = nomeMateria;
	}
	
	public String getGraudedificuldade() {
		return graudedificuldade;
	}
	
	public String getQuestoes() {
		return questoes;
	}

	public void setQuestoes(String questoes) {
		this.questoes = questoes;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public void setGraudedificuldade(String graudedificuldade) {
		this.graudedificuldade = graudedificuldade;
	}
	
	public String getQuestões() {
		return getQuestões();
	}
	
	public void setQuestões(String questões) {
		this.questoes = questões;
	}

}
