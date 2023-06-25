package model;

public class Main {

	public static Matematica matematica;
	public static Concurso concurso;
	public static Portugues portugues;

	public static void main(String[] args) {

		matematica = new Matematica("MD1", "1+1", "Díficil", true, "2");
		portugues = new Portugues("Conhecimentos bancarios", "MyQLS é legal?",
				"Díficil", "sim", "muito legal");
		concurso = new Concurso("Banco do Brasil", "03/04/2023", "2023", null, 0, 0);

		System.out.println(concurso.toString());
		System.out.println();
		System.out.println(portugues.toString());
		System.out.println();
		System.out.println(matematica.toString());
		System.out.println();

	}
}
