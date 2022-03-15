package atracao.model.cadastro;

public class Pessoa {
	private String nome;
	private String cpf;
	private String rg;
	private String celular;
	private Endereco endereco;
	private PreferenciaNotificacao preferencia;
	private Pais pais;

	// método set é definido aqui, para justamente definir qual o país da instância
	// dessa classe
	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Pais getPais() {
		return pais;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public PreferenciaNotificacao getPreferencia() {
		return preferencia;
	}
	
	public String getPreferenciaStr() {
		return preferencia.getPreferencia();
	}

	public void setPreferencia(PreferenciaNotificacao preferencia) {
		this.preferencia = preferencia;
	}

	// pessoa constructor
	public Pessoa(String nome, String cpf, String rg, String celular, Endereco endereco, Pais pais,
			PreferenciaNotificacao preferencia) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.celular = celular;
		this.endereco = endereco;
		this.pais = pais;
		this.preferencia = preferencia;
	}
}