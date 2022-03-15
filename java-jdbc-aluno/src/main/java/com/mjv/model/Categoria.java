package com.mjv.model;

public enum Categoria {

	FAMILIA("Família"), AMIGOS("Amigos"), PROFISSIONAL("Profissional"), OUTROS("Outros");

	// atributos do enum
	private String descricao;

	private Categoria(String descricao) {
		this.descricao = descricao;

	}

	public String getDescricao() {
		return descricao;
	}

	
}
