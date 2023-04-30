package projetoEstudopraconcurso;
import java.util.ArrayList;
import java.util.List;

public class  Humanas  extends Disciplinas{
	
	private String questoesdiscurvisas;
	List<String> materias = new ArrayList<>();
	
	public Humanas(String nomeMateria, String discursiva, String questoesDiscursiva, String grauDificuldade, String resposta, String questoes) {
		this.questoesdiscurvisas = questoesDiscursiva;
		this.questoes = questoes;
		this.graudedificuldade = grauDificuldade;
		this.nomeMateria = nomeMateria;
		this.resposta = resposta;
		materias.add("Portugues");
		materias.add("F");
		materias.add("Sociologia");
		
		for(int i = 0 ; i < materias.size(); i++){
			System.out.println(materias.get(i));
		}
		
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
