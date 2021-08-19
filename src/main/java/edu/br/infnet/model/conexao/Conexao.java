package edu.br.infnet.model.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	private static Connection conn = null;
	
	public static Connection obterConexao(){

		if (conn == null){

			String serverName = "localhost";			
			String bancoDados = "dbapp2021";
			String url = "jdbc:mysql://" + serverName + "/" + bancoDados + "?useTimezone=true&serverTimezone=UTC";				
			String usuario = "root";              				
			String senha = "SIun2014@";

			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				conn = DriverManager.getConnection(url,usuario, senha);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
				
		return conn;
	}
}