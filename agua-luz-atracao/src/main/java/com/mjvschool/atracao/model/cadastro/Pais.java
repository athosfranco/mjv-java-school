package com.mjvschool.atracao.model.cadastro;

public enum Pais {
	// enum não é apenas uma variável constante, mas sim um OBJETO CONSTANTE
	BRASIL("BR", "Brasil"), PERU("PE", "Peru"), ESTADOS_UNIDOS("US", "Estados Unidos");

	// atributos do enum
	private String sigla;
	private String nome;

	// o construtor é privado, pois o enum é PRÉ-DEFINIDO
	// métodos com o mesmo nome da classe e sem nenhum tipo de retorno são chamados
	// de CONSTRUTORES
	private Pais(String sigla, String nome) {
		this.nome = nome;
		this.sigla = sigla;
	}

	// Os getters sao definidos para se obter o valor
	public String getSigla() {
		return sigla;
	}

	public String getNome() {
		return nome;
	}
}