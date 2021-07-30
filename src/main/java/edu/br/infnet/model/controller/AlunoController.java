package edu.br.infnet.model.controller;

import edu.br.infnet.model.domain.Aluno;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AlunoController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("index.html").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Aluno aluno = new Aluno(request.getParameter("nome"), request.getParameter("email"));
        aluno.setIdade(Integer.valueOf(request.getParameter("idade")));
        aluno.setCurso(request.getParameter("curso"));
        aluno.setMensalidade(Float.valueOf(request.getParameter("mensalidade")));
        aluno.setRegiao(request.getParameter("regiao"));
        aluno.setDisciplinas(request.getParameterValues("disciplina"));

        System.out.println(aluno);
        request.getRequestDispatcher("confirmacao.html").forward(request, response);


    }
}
