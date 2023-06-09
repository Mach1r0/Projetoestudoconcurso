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

    public Questao(String nomeMateria,  String assunto,  String concurso, String prova,
     String resposta,  String graudeDificuldade, String enunciado) {
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

    public String getAssunto() {
        return null;
    }

    public String getConcurso() {
        return null;
    }

    public String getProva() {
        return null;
    }

    public String getEnunciado() {
        return null;
    }
}
