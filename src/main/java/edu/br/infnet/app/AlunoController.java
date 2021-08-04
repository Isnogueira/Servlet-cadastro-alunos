package edu.br.infnet.app;

import edu.br.infnet.model.domain.Aluno;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AlunoController extends HttpServlet {

    private List<Aluno> alunos;

    public AlunoController() {
        super();
        alunos = new ArrayList<>();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("cadastro.html").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Aluno aluno = new Aluno(request.getParameter("nome"), request.getParameter("email"));
        aluno.setIdade(Integer.valueOf(request.getParameter("idade")));
        aluno.setCurso(request.getParameter("curso"));
        aluno.setMensalidade(Float.valueOf(request.getParameter("mensalidade")));
        aluno.setRegiao(request.getParameter("regiao"));
        aluno.setDisciplinas(request.getParameterValues("disciplina"));

        alunos.add(aluno);

        request.setAttribute("nomeAluno", aluno.getNome());

        request.setAttribute("qtdAlunos", alunos.size());

        request.setAttribute("lista", alunos);

        request.getRequestDispatcher("confirmacao.jsp").forward(request, response);
    }

   /* PrintWriter out = response.getWriter(); // --> printar jsp

        out.println("<!DOCTYPE html>\n" +
                "<html lang=\"pt-BR\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "    <title>APP2021 - Confirmação</title>\n" +
                "    <!--<link rel=\"stylesheet\" href=\"css/meuestilo.css\">-->\n" +
                "    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"container\">\n" +
                "        <h2> Aluno(a) " + aluno.getNome() +" cadastrado com sucesso!</h2>\n" +
                "        <hr>\n" +
                "        <h3>Quantidade de alunos cadastrados: " + alunos.size() + "</h3>\n" +
                "        <hr>" +
                "        " +
                "        <hr>" +
                "    </div>\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>");

        for (Aluno aln : alunos) {
        out.println(
                "        <div class=\"container\">\n" +
                        "           <h3>Aluno(a): " + aln.getNome() + "</h3>" +
                        "           <hr>" +
                        "        </div>");
    }

        out.println(
                "        <div class=\"container\">\n" +
                "            <a href=\"aluno\">Voltar</a>\n" +
                "        </div>");*/

}
