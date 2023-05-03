package  projetoEstudopraconcurso;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static Exatas exatas;
	public static Concurso concurso;
	public static Humanas humanas;

	public static void main(String[] args) {	
		
		exatas = new Exatas("MD1", "1+1", "Díficil", "sim","2");
		humanas = new Humanas("Conhecimentos bancarios", "MyQLS é legal?", 
				"Díficil", "sim", "muito legal");
	 	concurso = new Concurso("Banco do Brasil", "03/04/2023", "2023");

		System.out.println(concurso.toString());
		System.out.println();
		System.out.println(humanas.toString());
		System.out.println();
		System.out.println(exatas.toString());
		System.out.println();

		
	}	
}
