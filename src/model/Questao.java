package model;

public abstract class Questao {

    // atributos
    protected String nomeMateria;
    protected String graudeDificuldade;
    protected String resposta;
    protected String enunciado;
    protected String assunto;
    protected String concurso;
    protected String prova;

    public Questao(String resposta, String nomeMateria, String graudeDificuldade, String assunto,
            String concurso, String prova, String enunciado) {
        this.graudeDificuldade = graudeDificuldade;
        this.nomeMateria = nomeMateria;
        this.resposta = resposta;
        this.assunto = assunto;
        this.enunciado = enunciado;
        this.concurso = concurso;
        this.prova = prova;

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

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public void setGraudedificuldade(String graudedificuldade) {
        this.graudeDificuldade = graudedificuldade;
    }

    public static Questao buscaDisciplina() {
        return null;
    }

    public Object getAssunto() {
        return null;
    }

    public Object getConcurso() {
        return null;
    }

    public Object getProva() {
        return null;
    }

    public Object getEnunciado() {
        return null;
    }
}
