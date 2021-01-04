package com.itau.Login.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;



//TABELA
@Entity
@Table(name="tb_cadastro")
public class CadastroItau {
	
	//ATRIBUTOS
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column
	@NotEmpty(message="Este campo não pode ser vazio")
	private String nome;
	
	@Column
	@Email
	@NotEmpty(message="Este campo não pode ser vazio")
	private String email;
	
	@Column
	@CPF
	@NotEmpty(message="Este campo não pode ser vazio")
	@Size(min = 11, max = 11, message="O campo CPF deve ter 11 numeros")
	private String cpf;
	

	@Column
	@NotEmpty(message="Este campo não pode ser vazio")
	@Size(min = 9, message="O campo senha deve ter no mínimo 9 numeros")
	private String senha;
	
	


	
	//METÓDOS SETS E GETS
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}

	
}
