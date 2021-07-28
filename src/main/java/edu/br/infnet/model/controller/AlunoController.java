package edu.br.infnet.model.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AlunoController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        String nome = req.getParameter("nome");
        String email = req.getParameter("email");
        String curso = req.getParameter("curso");
        String regiao = req.getParameter("regiao");
        String[] disciplinas = req.getParameterValues("disciplina");

        System.out.println("Nome: " + nome + "\nE-mail: " + email + "\nCurso: " + curso + "\nRegião: " + regiao
                + "\nDisciplinas Cursadas: " + disciplinas.length);

    }
}
