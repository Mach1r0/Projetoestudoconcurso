package projetoEstudopraconcurso;

public class Concurso {
	
	private String nome;
	private String horario;
	private String dia;
	
	public Concurso(String nome1, String horario1, String dia1) {
		this.nome = nome1; 
		this.dia = dia1;
		this.horario = horario1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}
	

	@Override
	public String toString() {
			return "nome: " + nome + ", horario:" + horario + ", dia: " + dia;
	}
}