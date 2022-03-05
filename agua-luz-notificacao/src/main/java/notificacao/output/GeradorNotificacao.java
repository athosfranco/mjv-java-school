package notificacao.output;

public class GeradorNotificacao {

	public static void enviarMensagem(TipoNotificacao tipo, String[] conteudoDaMensagem, int index) {

		System.out.println(
				"[Mensagem #" + index + " enviada via " + tipo.getTipo() + " para o n�mero: " + conteudoDaMensagem[11] + "] \n");

		System.out.println("Senhor(a) " + conteudoDaMensagem[0]
				+ ", Informamos que conforme contrato com protocolo de n�mero " + conteudoDaMensagem[1]
				+ " est� agendado para a data " + conteudoDaMensagem[2] + " �s " + conteudoDaMensagem[3]
				+ " a instala��o da " + conteudoDaMensagem[4] + " com taxa de valor R$ " + conteudoDaMensagem[5]
				+ " em sua resid�ncia localizada no endere�o abaixo: \n" + "- Logradouro: " + conteudoDaMensagem[6]
				+ "\n" + "- Complemento: " + conteudoDaMensagem[7] + "\n" + "- Bairro: " + conteudoDaMensagem[8] + "\n"
				+ "- Cidade: " + conteudoDaMensagem[9] + "\n" + "- CEP: " + conteudoDaMensagem[10] + "\n");

		System.out.println("-----------------------------------------");

	}

}
