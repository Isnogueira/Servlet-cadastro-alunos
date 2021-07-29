package edu.br.infnet.model.domain;

import java.util.Arrays;

public class Aluno {
    private String nome;
    private String email;
    private String curso;
    private String regiao;
    private String[] disciplinas;

    public Aluno(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "\nnome='" + nome + '\'' + "," +
                "\nemail='" + email + '\'' + "," +
                "\ncurso='" + curso + '\'' + "," +
                "\nregiao='" + regiao + '\'' + "," +
                "\ndisciplinas Cursadas=" + Arrays.toString(disciplinas) + "\n" +
                '}';
    }
}
