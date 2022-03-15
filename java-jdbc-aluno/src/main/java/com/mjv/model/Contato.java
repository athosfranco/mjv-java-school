package com.mjv.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_contato")
public class Contato {
	// CRIAÇÃO DO BANCO DE DADOS ATRAVÉS DO MAPEAMENTO
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(columnDefinition = "varchar(60)")
	private String nome;

	@Column(columnDefinition = "varchar(20)")
	private String telefone;

	@Column(columnDefinition = "varchar(30)")
	private String email;

	@Enumerated(EnumType.STRING)
	private Categoria categoria;

	@Column(nullable = false)
	private boolean ativo;

	@Column(columnDefinition = "varchar(120)")
	private String observacao;

	// getters e setters

	public String getNome() {
		return nome;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", categoria="
				+ categoria + ", ativo=" + ativo + ", observacao=" + observacao + "]";
	}

}
