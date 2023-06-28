package controler;

import java.util.ArrayList;

import DAO.ConcursoDAO;
import DAO.ExceptionDAO;
import model.Concurso;

public class ControladoraConcurso {

    public boolean cadastrarConcurso(String nome, String dia, String edital, int vagas, String banca, float salario)
            throws ExceptionDAO {
        if (nome != null && nome.length() > 0 && dia != null && dia.length() > 0 && edital != null
                && edital.length() > 0 && banca != null && banca.length() > 0 && salario >= 0 && vagas >= 0) {
            Concurso concurso = new Concurso(nome, dia, edital, banca, vagas, salario);
            concurso.cadastrarConcurso(concurso);
            return true;
        }

        return false;
    }

    public ArrayList<Concurso> listaConcursos(String nome) throws ExceptionDAO {
        return new Concurso().listaConcursos(nome);
    }
}
