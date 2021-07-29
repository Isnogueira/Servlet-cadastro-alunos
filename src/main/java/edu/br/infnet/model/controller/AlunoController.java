package edu.br.infnet.model.controller;

import edu.br.infnet.model.domain.Aluno;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AlunoController extends HttpServlet {
/*
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
*/
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);

        Aluno aluno = new Aluno(req.getParameter("nome"), req.getParameter("email"));

        aluno.setCurso(req.getParameter("curso"));
        aluno.setRegiao(req.getParameter("regiao"));
        aluno.setDisciplinas(req.getParameterValues("disciplina"));

        System.out.println(aluno);
        System.out.println("\nDisciplinas:" + aluno.getDisciplinas().length);

        req.getRequestDispatcher("confirmacao.html").forward(req, resp);

    }
}
