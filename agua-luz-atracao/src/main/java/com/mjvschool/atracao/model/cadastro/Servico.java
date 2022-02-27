package com.mjvschool.atracao.model.cadastro;

public enum Servico {
	AGUA("água", 137.21), // nome da conta e valor fixo
	LUZ("Luz", 132.15);

	private String nome;
	private Double valor;

	private Servico(String nome, Double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public Double getValor() {
		return valor;
	}

}