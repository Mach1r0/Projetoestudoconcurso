package projetoEstudopraconcurso;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static Concurso concurso;
	public static Humanas humanas;

	public static void main(String[] args) {		
		ArrayList<Exatas> exatas = new ArrayList(); 
		Exatas exatas2 = new Exatas("Matematica24", "Matematica24", "Matematica24", "Matematica24", "Matematica2", "Matematica2");
		Exatas exatas3 = new Exatas("Matematica34", "Matematica24", "Matematica2", "Matematica2", "Matematica2", "Matematica2");
		Exatas exatas4= new Exatas("Matematica44", "Matematica24", "Matematica2", "Matematica2", "Matematica2", "Matematica2");
		Exatas exatas5 = new Exatas("Matematica46","Matematica25" , "Matematica2", "Matematica2", "Matematica2", "Matematica2");
		exatas.add(exatas2);
		exatas.add(exatas3);
		exatas.add(exatas4);
		exatas.add(exatas5);
		  Scanner scanner = new Scanner(System.in);
	        System.out.println("Digite o nome da disciplina: ");
	        String disciplina = scanner.nextLine();

	        for (Exatas e : exatas) {
	            if (e.getNomeMateria().equalsIgnoreCase(disciplina)) {
	                System.out.println("Disciplina encontrada:");
	                System.out.println(e.toString());
	                return;
	        }
	   System.out.println("Disciplina não encontrada na lista.");
		concurso = new Concurso("Banco do Brasil", "15 horas", "15 dias");
		humanas = new Humanas("texto legal", "texte ", "texte", "texte", "texte", "text");
		System.out.println(concurso.toString());
		System.out.println(exatas.toString());
		System.out.println(humanas.toString());
	}	
}}
