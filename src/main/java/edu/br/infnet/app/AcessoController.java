package edu.br.infnet.app;

import edu.br.infnet.model.domain.Aluno;
import edu.br.infnet.model.repository.AlunoDao;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class AcessoController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("index.html").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("email");
        String senha = request.getParameter("senha");

        Aluno aluno = AlunoDao.validar(email, senha);

        if (aluno != null) {
            System.out.println("Aluno(a) autenticado " + aluno.getNome() );

            request.getRequestDispatcher("cadastro.html").forward(request, response);
        }

        PrintWriter out = response.getWriter(); // --> printar jsp

        out.println("<!DOCTYPE html>" +
                "<html lang=\"pt-BR\">" +
                "<head>" +
                "    <meta charset=\"UTF-8\">" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">" +
                "    <title>APP2021 - Confirmação</title>" +
                "    <!--<link rel=\"stylesheet\" href=\"css/meuestilo.css\">-->" +
                "    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n" +
                "</head>" +
                "<body>" +
                "    <div class=\"container\">" +
                "        <h2> Autenticacao invalida para o usuario " + email + "</h2>" +
                "        <a href=\"index\">Voltar</a>" +
                "    </div>" +
                "</form>" +
                "</body>" +
                "</html>");

    }
}
