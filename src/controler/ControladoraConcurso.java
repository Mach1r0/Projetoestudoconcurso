package controler;

import model.Concurso;

public class ControladoraConcurso {

    public boolean cadastrarConcurso(String nome, String dia, String edital, int vagas, String banca, float salario) {
        if (nome != null && nome.length() > 0 && dia != null && dia.length() > 0 && edital != null
                && edital.length() > 0 && banca != null && banca.length() > 0 && salario >= 0 && vagas >= 0) {
            Concurso concurso = new Concurso(nome, dia, edital, banca, vagas, salario);
            concurso.cadastrarConcurso(concurso);
            return true;
        }

        return false;
    }
}
