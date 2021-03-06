package br.com.caelum.agenda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private final String banco = "jdbc:mysql://localhost/fj21";
	private final String usuario = "usuario";
	private final String senha = "abc123";
	
	public Connection getConnection() {		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(banco, usuario, senha);
		} catch (SQLException | ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

}
