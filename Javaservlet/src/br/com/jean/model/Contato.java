package br.com.jean.model;

import java.util.Calendar;
import java.util.Date;

public class Contato {
	
	private String nome, endereco, email;
	private Calendar dataNascimento;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento2) {
		this.dataNascimento = dataNascimento2;
	}
	
		

}
