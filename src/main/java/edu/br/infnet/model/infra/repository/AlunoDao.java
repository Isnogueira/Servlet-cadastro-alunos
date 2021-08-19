package edu.br.infnet.model.infra.repository;

import edu.br.infnet.model.conexao.Conexao;
import edu.br.infnet.model.domain.Aluno;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlunoDao {

    public static void incluir (Aluno aluno){


        String sql = "INSERT INTO taluno (nome, email, idade, curso, mensalidade, regiao, disciplinas) " +
                "VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = Conexao.obterConexao().prepareStatement(sql);

            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getEmail());
            ps.setInt(3, aluno.getIdade());
            ps.setString(4, aluno.getCurso());
            ps.setFloat(5, aluno.getMensalidade());
            ps.setString(6, aluno.getRegiao());
            ps.setString(7, Arrays.toString(aluno.getDisciplinas()));
            ps.execute();

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    public static List<Aluno> obterLista(){

        List<Aluno> alunos  = new ArrayList<>();

        String sql = "SELECT * FROM taluno ORDER BY nome";

        try {
            PreparedStatement ps = Conexao.obterConexao().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                Aluno aluno = new Aluno(rs.getString("nome"), rs.getString("email"));
                aluno.setIdade(rs.getInt("idade"));
                aluno.setCurso(rs.getString("curso"));
                aluno.setMensalidade(rs.getFloat("mensalidade"));
                aluno.setRegiao(rs.getString("regiao"));
                //aluno.setDisciplinas(rs.getString("disciplinas"));

                alunos.add(aluno);
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return alunos;
    }

    public static Aluno validar(String email, String senha){

        if(email.equals(senha)){
            return new Aluno("Ingrid Nogueira", email);
        }
        return null;
    }
}
