package notificacao.output;

public enum TipoNotificacao {

	SMS("SMS"), WHATS("WhatsApp");

	private String tipo;

	public String getTipo() {
		return tipo;
	}

	private TipoNotificacao(String tipo) {
		this.tipo = tipo;
	}

}
