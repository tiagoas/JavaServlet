package br.com.jean.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;

import br.com.jean.jdbc.ConnectionFactory;
import br.com.jean.model.Contato;

public class ContatoDao {
	private Connection connection;
	
	public ContatoDao() {
		
		this.connection = new ConnectionFactory().getConnection();
		
	}
	
	public void adiciona(Contato contato) {
		String sql = "INSERT INTO Contato (nome, email, endereco, dataNascimento) VALUE (?,?,?,?)";
		try {
			// Inserção
			PreparedStatement stmt = connection.prepareStatement(sql);
			//set
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, (java.sql.Date) new Date(
					contato.getDataNascimento().getTimeInMillis()));
		
			//exec and close
			stmt.execute();
			stmt.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}
}
