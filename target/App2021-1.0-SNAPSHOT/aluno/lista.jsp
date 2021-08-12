<%@ page import="edu.br.infnet.domain.model.Aluno"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE = html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>APP2021 - Confirmação</title>
    <!--<link rel="stylesheet" href="css/meuestilo.css">-->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
    <%
        List<Aluno>alunos = (List<Aluno>) request.getAttribute("lista");
        int qtde = alunos.size();
   %>
    <div class="container">
        <hr>
        <form action="aluno" method="get">
        <h3>Quantidade de alunos cadastrados: <%=qtde%> |
        <button type="submit" class="btn btn-link" name="tela" value="lista">Incluir</button>
        </h3>
        <form>
        <br>
          <table class="table table-striped">
            <thead>
              <tr>
                <th>Nome</th>
                <th>Email</th>
                <th>Idade</th>
                <th>Curso</th>
                <th>Mensalidade</th>
                <th>Região</th>
              </tr>
            </thead>
            <tbody>
             <%for (Aluno aln : alunos) {%>
                 <tr>
                   <td> <%=aln.getNome()%></td>
                   <td> <%=aln.getEmail()%></td>
                   <td> <%=aln.getIdade()%></td>
                   <td> <%=aln.getCurso()%></td>
                   <td> <%=aln.getMensalidade()%></td>
                   <td> <%=aln.getRegiao()%></td>
                 </tr>
            <%}%>
            </tbody>
          </table>
    </div>
</body>
</html>
