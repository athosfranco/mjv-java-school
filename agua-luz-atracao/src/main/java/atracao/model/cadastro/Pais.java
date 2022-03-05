package atracao.model.cadastro;

public enum Pais {
	// enum n�o � apenas uma vari�vel constante, mas sim um OBJETO CONSTANTE
	BRASIL("pt", "BR"), JAPAO("ja", "JP"), ESTADOS_UNIDOS("en", "US"), ALEMANHA("de", "DE");

	// atributos do enum
	private String siglaIdioma;
	private String siglaPais;

	// o construtor � privado, pois o enum � PR�-DEFINIDO
	// m�todos com o mesmo nome da classe e sem nenhum tipo de retorno s�o chamados
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