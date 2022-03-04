package atracao.model.cadastro;

public enum PreferenciaNotificacao {

	SMS("SMS"), WHATS("WhatsApp");

	private String preferencia;

	public String getPreferencia() {
		return preferencia;
	}

	private PreferenciaNotificacao(String preferencia) {
		this.preferencia = preferencia;
	}

}
