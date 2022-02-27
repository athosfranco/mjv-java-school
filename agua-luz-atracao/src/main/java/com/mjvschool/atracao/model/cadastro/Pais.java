package com.mjvschool.atracao.model.cadastro;

public enum Pais {
	// enum n�o � apenas uma vari�vel constante, mas sim um OBJETO CONSTANTE
	BRASIL("BR", "Brasil"), PERU("PE", "Peru"), ESTADOS_UNIDOS("US", "Estados Unidos");

	// atributos do enum
	private String sigla;
	private String nome;

	// o construtor � privado, pois o enum � PR�-DEFINIDO
	// m�todos com o mesmo nome da classe e sem nenhum tipo de retorno s�o chamados
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