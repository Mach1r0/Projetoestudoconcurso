package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;

import model.Concurso;

public class ConcursoDAO {
    public void cadastrarConcurso(Concurso concurso) throws Exception {
        String sql = "Insert into concurso (nome, dia, edital, vagas, salario, banca) value (?,?,?,?,?,?)";
        PreparedStatement pStatement = null;
        Connection connection = null;

        try {
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, concurso.getNome());
            pStatement.setString(2, concurso.getDia());
            pStatement.setString(3, concurso.getEdital());
            pStatement.setInt(4, concurso.getVagas());
            pStatement.setFloat(5, concurso.getSalario());
            pStatement.setString(6, concurso.getBanca());
            pStatement.execute();
        } catch (SQLException e) {
            throw new ExceptionDAO("Erro ao cadastrar concurso" + e);
        } finally {
            try {
                if (pStatement != null) {
                    pStatement.close();
                }
            } catch (SQLException e) {
                throw new ExceptionDAO("Erro ao fechar o Statement" + e);
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new ExceptionDAO("Erro ao fechar a conexão:" + e);
            }
        }

    }

    public ArrayList<Concurso> listaConcurso(String string) throws ExceptionDAO {
        String sql = "SELECT * FROM concurso WHERE nome LIKE '%" + string + "%' ORDER BY nome";
        Connection connection = null;
        PreparedStatement pStatement = null;
        ArrayList<Concurso> concursos = new ArrayList<>();

        try {
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            ResultSet rs = pStatement.executeQuery();

            while (rs.next()) {
                Concurso concurso = new Concurso();
                concurso.setCodConcurso(rs.getInt("CodConcurso"));
                concurso.setNome(rs.getString("nome"));
                concurso.setDia(rs.getString("dia"));
                concurso.setEdital(rs.getString("edital"));
                concurso.setVagas(rs.getInt("vagas"));
                concurso.setSalario(rs.getFloat("salario"));
                concurso.setBanca(rs.getString("banca"));

                concursos.add(concurso);
            }
        } catch (Exception e) {
            throw new ExceptionDAO("Erro ao listar concursos: " + e);
        } finally {
            try {
                if (pStatement != null) {
                    pStatement.close();
                }
            } catch (SQLException e) {
                throw new ExceptionDAO("Erro ao fechar o Statement: " + e);
            }
        }
        return concursos;
    }

    public void alterarConcurso(Concurso concurso) throws ExceptionDAO {
        String sql = "Update  Filme set nome = ?, dia = ?, edital = ?, vagas = ?, salario = ?, banca = ? where codConcurso =  ?";
        PreparedStatement pStatement = null;
        Connection connection = null;

        try {
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, concurso.getNome());
            pStatement.setString(2, concurso.getDia());
            pStatement.setString(3, concurso.getEdital());
            pStatement.setInt(4, concurso.getVagas());
            pStatement.setFloat(5, concurso.getSalario());
            pStatement.setString(6, concurso.getBanca());
            pStatement.setInt(6, concurso.getCodConcurso());

        } catch (Exception e) {
            throw new ExceptionDAO("Erro ao alterar concurso: " + e);
        } finally {
            try {
                if (pStatement != null) {
                    pStatement.close();
                }
            } catch (SQLException e) {
                throw new ExceptionDAO("Erro ao fechar o Statement: " + e);
            }
        }
    }
}
