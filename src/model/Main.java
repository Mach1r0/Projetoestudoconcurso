package model;

public class Main {

	public static Matematica matematica;
	public static Concurso concurso;
	public static Portugues portugues;

	public static void main(String[] args) {

		matematica = new Matematica(true, null, null, null, null, null, null, null);
		portugues = new Portugues("Conhecimentos bancarios", null, null, null, null, null, null, null);
		concurso = new Concurso("Banco do Brasil", "03/04/2023", "2023", null, 0, 0);

		System.out.println(concurso.toString());
		System.out.println();
		System.out.println(portugues.toString());
		System.out.println();
		System.out.println(matematica.toString());
		System.out.println();

	}
}
