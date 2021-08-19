package edu.br.infnet.controller;

import edu.br.infnet.model.domain.Aluno;
import edu.br.infnet.model.infra.repository.AlunoDao;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;


public class AlunoController extends HttpServlet {

    public AlunoController() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tela = request.getParameter("tela");
        if("lista".equals(tela)){
            request.getRequestDispatcher("aluno/cadastro.jsp").forward(request, response);
        } else{

            request.setAttribute("lista", AlunoDao.obterLista());
            request.getRequestDispatcher("aluno/lista.jsp").forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Aluno aluno = new Aluno(request.getParameter("nome"), request.getParameter("email"));
        aluno.setIdade(Integer.valueOf(request.getParameter("idade")));
        aluno.setCurso(request.getParameter("curso"));
        aluno.setMensalidade(Float.valueOf(request.getParameter("mensalidade")));
        aluno.setRegiao(request.getParameter("regiao"));
        aluno.setDisciplinas(request.getParameterValues("disciplina"));

        AlunoDao.incluir(aluno);

        request.setAttribute("nomeAluno", aluno.getNome());

        request.setAttribute("qtdAlunos", AlunoDao.obterLista().size());

        request.setAttribute("lista", AlunoDao.obterLista());

        request.getRequestDispatcher("confirmacao.jsp").forward(request, response);
    }

}
