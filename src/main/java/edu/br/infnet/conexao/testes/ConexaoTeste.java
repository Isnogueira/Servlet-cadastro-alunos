package edu.br.infnet.conexao.testes;

import edu.br.infnet.conexao.Conexao;

public class ConexaoTeste {

    public static void main(String[] args) {

        if(Conexao.obterConexao() != null){

            System.out.println("Conexão bem sucedida!");
        } else {

            System.err.println("Deu ruim!");
        }
    }

}
