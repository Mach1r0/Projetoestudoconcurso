package projetoEstudopraconcurso;

public class main {
	
	static Concurso c;
	static Exatas e;
	static Humanas h;
	
	 public static void main(String[] args) {
		 c = new Concurso("Banco do Brasil", "15 horas", "15 dias");
		 e = new Exatas("Matematica", "1 + 1", "sim", "texte", "text", "texte");
		 h = new Humanas("texto legal", "texte ", "texte", "texte", "texte");
		 System.out.println(c.toString());
		 System.out.println(e.toString());
		 System.out.println(h.toString());	
	 }	
}