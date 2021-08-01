package edu.br.infnet.testes;

import edu.br.infnet.model.domain.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoTeste {

    public static void main(String[] args) {

        List<Aluno> alunos;

        alunos = new ArrayList<>();

        Aluno aluno1 = new Aluno("Ingrid Nogueira", "ingrid@gmail.com");

        Aluno aluno2 = new Aluno("Suellen Nogueira", "zukkk@gmail.com");

        Aluno aluno3 = new Aluno("Nathalia Nogueira", "nathalia@gmail.com");

        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);

        System.out.println("Aluno(a): " + alunos.get(0));

        System.out.println("Quantidade de alunos: " + alunos.size());

        for (Aluno aluno : alunos) {
            System.out.println("Aluno: " + aluno.getNome());
        }
    }

}
