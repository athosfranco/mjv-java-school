package atracao.model.cadastro;

public enum Pais {
	// enum não é apenas uma variável constante, mas sim um OBJETO CONSTANTE
	BRASIL("pt", "BR"), JAPAO("ja", "JP"), ESTADOS_UNIDOS("en", "US"), ALEMANHA("de", "DE");

	// atributos do enum
	private String siglaIdioma;
	private String siglaPais;

	// o construtor é privado, pois o enum é PRÉ-DEFINIDO
	// métodos com o mesmo nome da classe e sem nenhum tipo de retorno são chamados
	// de CONSTRUTORES
	private Pais(String siglaIdioma, String siglaPais) {
		this.siglaIdioma = siglaIdioma;
		this.siglaPais = siglaPais;
	}

	// Os getters sao definidos para se obter o valor
	public String getSiglaIdioma() {
		return siglaIdioma;
	}

	public String getSiglaPais() {
		return siglaPais;
	}
}