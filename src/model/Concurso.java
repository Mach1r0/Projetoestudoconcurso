package model;

import java.util.ArrayList;

import DAO.ConcursoDAO;
import DAO.ExceptionDAO;

public class Concurso {

	private String nome;
	private String edital;
	private String dia;
	private String banca;
	private int vagas;
	private float salario;
	private int codConcurso;

	public int getCodConcurso() {
		return codConcurso;
	}

	private ArrayList<Questao> disciplinas = new ArrayList<Questao>();

	public Concurso() {
	}

	public Concurso(String nome, String dia, String edital, String banca, int vagas, float salario) {
		this.nome = nome;
		this.dia = dia;
		this.edital = edital;
		this.vagas = vagas;
		this.banca = banca;
		this.salario = salario;
	}

	//
	public int getVagas() {
		return vagas;
	}

	public void setVagas(int vagas) {
		this.vagas = vagas;
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

	public ArrayList<Questao> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Questao> disciplinas) {
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

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public void cadastrarConcurso(Concurso concurso) throws ExceptionDAO {
		try {
			new ConcursoDAO().cadastrarConcurso(concurso);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Concurso> listaConcursos(String nome) throws ExceptionDAO {
		return new ConcursoDAO().listaConcurso(nome);

	}

	public void setCodConcurso(int int1) {
	}
}