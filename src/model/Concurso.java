 package model;

import java.util.ArrayList;

public class Concurso {
	
	private String nome;
	private String edital;
	private String dia;
	private String banca;
	private ArrayList<Disciplinas> disciplinas = new ArrayList<Disciplinas>();
	
	public Concurso(String nome1, String dia1, String edital) {
		this.nome = nome1; 
		this.dia = dia1;
		this.edital = edital;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}
	
	public String getEdital() {
		return edital;
	}

	public void setEdital(String edital) {
		this.edital = edital;
	}

	public ArrayList<Disciplinas> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplinas> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public String getBanca() {
		return banca;
	}
	
	public void setBanca(String banca) {
		this.banca = banca;
	}
	
	@Override
	public String toString() {
			return "nome do concurso: " + nome + ", edital:" + edital + ", data: " + dia;
	}

}