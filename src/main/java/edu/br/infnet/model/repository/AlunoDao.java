package edu.br.infnet.model.repository;

import edu.br.infnet.model.domain.Aluno;

public class AlunoDao {

    public static Aluno validar(String email, String senha){

        if(email.equals(senha)){
            return new Aluno("Ingrid Nogueira", email);
        }
        return null;
    }
}
