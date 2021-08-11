package edu.br.infnet.model.repository;

import edu.br.infnet.model.domain.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoDao {

    private static List<Aluno> alunos  = new ArrayList<>();;

    public static void incluir (Aluno aluno){
         alunos.add(aluno);
    }

    public static List<Aluno> obterLista(){
        return alunos;
    }

    public static Aluno validar(String email, String senha){

        if(email.equals(senha)){
            return new Aluno("Ingrid Nogueira", email);
        }
        return null;
    }
}
