package edu.br.infnet.controller;

import edu.br.infnet.model.domain.Aluno;
import edu.br.infnet.model.infra.repository.AlunoDao;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AcessoController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("email");
        String senha = request.getParameter("senha");

        Aluno aluno = AlunoDao.validar(email, senha);

        if (aluno != null) {

            request.setAttribute("lista", AlunoDao.obterLista());

            System.out.println("Aluno(a) autenticado " + aluno.getNome() );

            request.getRequestDispatcher("aluno/lista.jsp").forward(request, response);
        } else{
            request.setAttribute("mensagem","Autenticação inválida!");

            doGet(request, response);
        }

    }
}
