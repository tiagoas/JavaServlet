package br.com.jean.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
		System.out.println("Conectando ao Banco");
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/bd", "root", "1234");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
