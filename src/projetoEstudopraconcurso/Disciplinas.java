package projetoEstudopraconcurso;
public abstract class Disciplinas {

    protected String nomeMateria;
    protected String graudeDificuldade;
    protected String questoes;
    protected String resposta;

    public Disciplinas(String questoes, String resposta, String nomeMateria, String graudeDificuldade) {
    	this.questoes = questoes;
		this.graudeDificuldade = graudeDificuldade;
		this.nomeMateria = nomeMateria;
		this.resposta = resposta;
		
    }

    public String getNomeMateria() {
        return nomeMateria;
    }

    public void setNomeMateria(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }

    public String getGraudedificuldade() {
        return graudeDificuldade;
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
        this.graudeDificuldade = graudedificuldade;
    }

 

}
