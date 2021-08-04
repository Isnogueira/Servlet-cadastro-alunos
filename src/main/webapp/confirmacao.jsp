<%@ page import="edu.br.infnet.model.domain.Aluno" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>APP2021 - Confirmação</title>
    <!--<link rel="stylesheet" href="css/meuestilo.css">-->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

   <%String nome = (String)request.getAttribute("nomeAluno");
   List<Aluno>alunos = (List<Aluno>) request.getAttribute("lista");
   int qtde = alunos.size();
   %>

    <div class="container">
       <h2> Aluno(a) <%=nome%> cadastrado com sucesso!</h2>
        <hr>
        <h3>Quantidade de alunos cadastrados: <%=qtde%></h3>
        <hr>
        <%for (Aluno aln : alunos) {%>
            <h4>Aluno(a): <%=aln.getNome()%> </h4>
            <hr>
        <%}%>
        <a href="aluno">Voltar</a>
    </div>
</body>
</html>
