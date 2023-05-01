package projetoEstudopraconcurso;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static Concurso concurso;
	public static Humanas humanas;

	public static void main(String[] args) {	
		
		ArrayList<Exatas> exatas = new ArrayList<Exatas>(); 
		Exatas exatas2 = new Exatas("Quimica", " 1+1", "Medio", "sim", "2");
		Exatas exatas3 = new Exatas("Matematica", " 2+2", "Facil", "sim", "4");
		Exatas exatas4= new Exatas("Fisica", " 3+3", "Dificil", "sim", "6");
		exatas.add(exatas2);
		exatas.add(exatas3);
		exatas.add(exatas4);
		
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Digite o nome da disciplina: ");
	    String disciplina = scanner.nextLine();
	    boolean achou = false;
	    
	    for (Exatas e : exatas) {
	      	if (e.getNomeMateria().equalsIgnoreCase(disciplina)) {
	            System.out.println("Disciplina encontrada:");
	    		System.out.println();
	            System.out.println(e.toString());
	            achou = true;
	        }
      	}
	    if (!achou){
	        System.out.println("Disciplina não encontrada");
	    }
		humanas = new Humanas("Conhecimentos bancarios", "MyQLS é legal?", 
				"Díficil", "sim", "muito legal");
	 	concurso = new Concurso("Banco do Brasil", "03/04/2023", "2023");

		System.out.println();
		System.out.println(humanas.toString());
		System.out.println();
		System.out.println(concurso.toString());
	}	
}
