package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}