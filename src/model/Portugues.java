package model;

public class Portugues extends Questao{
	
	private String questoesDiscursivas;
	
	public String getQuestoesDiscursivas() {
		return questoesDiscursivas;
	}

	public void setQuestoesDiscursivas(String questoesDiscursivas) {
		this.questoesDiscursivas = questoesDiscursivas;
	}

	public Portugues(String nomeMateria, String questoes, String graudeDificuldade, String questoesDiscursivas, String resposta ) {
		super(questoes, resposta, nomeMateria, graudeDificuldade);
		this.questoesDiscursivas = questoesDiscursivas;
	}	
	
	@Override
	public String toString() {
			return "Materia humanas: " + nomeMateria + ", questoes:" + questoes + 
			", grau de dificuldade: " + graudeDificuldade + ",\n" + "questao discursiva: " 
			+ questoesDiscursivas + ", resposta:" + resposta;
	}

	
}
