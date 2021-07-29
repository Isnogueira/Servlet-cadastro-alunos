<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>APP2021 - Cadastro</title>
    <!--<link rel="stylesheet" href="css/meuestilo.css">-->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<form action="aluno" method="post">
    <div class="container">
        <h2>Cadastro</h2>
        <div class="form-group">
            <label for="nome">Nome:</label>
            <input type="text" class="form-control" id="nome" value="Ingrid Nogueira" placeholder="Entre com o nome" name="nome">
        </div>
        <div class="form-group">
            <label for="email">E-mail:</label>
            <input type="email" class="form-control" id="email" value="ingrid@gmail.com" placeholder="Entre com o email" name="email">
        </div>
        <div class="container">
            <h2>Curso</h2>
            <form>
                <label class="radio-inline">
                    <input type="radio" name="curso" value="Graduacao" checked="checked">Graduação
                </label>
                <label class="radio-inline">
                    <input type="radio" name="curso" value="Especializacao">Especialização
                </label>
                <label class="radio-inline">
                    <input type="radio" name="curso" value="Mestrado">Mestrado
                </label>
                <label class="radio-inline">
                    <input type="radio" name="curso" value="Doutorado">Doutorado
                </label>
            </form>
        </div>
        <div class="container">
            <h2>Região</h2>
            <select class="form-control" id="regiao" name="regiao">
                <option>Nordeste</option>
                <option>Norte</option>
                <option>Sudeste</option>
                <option>Sul</option>
                <option>Centro-oeste</option>
            </select>
        </div>
        <div class="container">
            <h2>Disciplinas</h2>
            <label class="checkbox-inline"><input type="checkbox" name="disciplina" value="java" checked>Java</label>
            <label class="checkbox-inline"><input type="checkbox" name="disciplina" value="python" checked>Python</label>
            <label class="checkbox-inline"><input type="checkbox" name="disciplina" value="javascript">Javascript</label>
        </div>
        <br>
        <button type="submit" class="btn btn-default">Cadastrar</button>
    </div>
</form>
</body>
</html>