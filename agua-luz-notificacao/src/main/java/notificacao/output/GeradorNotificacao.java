package notificacao.output;

public class GeradorNotificacao {

	public static void enviarMensagem(TipoNotificacao tipo, String[] conteudoDaMensagem, int index) {

		System.out.println(
				"Enviando mensagem #" + index + " via " + tipo.getTipo() + " para o número: " + conteudoDaMensagem[11]);

		System.out.println("Senhor(a) " + conteudoDaMensagem[0]
				+ ", Informamos que conforme contrato com protocolo de número " + conteudoDaMensagem[1]
				+ " está agendado para a data " + conteudoDaMensagem[2] + " às " + conteudoDaMensagem[3]
				+ " a instalação da " + conteudoDaMensagem[4] + " com taxa de valor R$ " + conteudoDaMensagem[5]
				+ " em sua residência localizada no endereço abaixo: \n" + "- Logradouro: " + conteudoDaMensagem[6]
				+ "\n" + "- Complemento: " + conteudoDaMensagem[7] + "\n" + "- Bairro: " + conteudoDaMensagem[8] + "\n"
				+ "- Cidade: " + conteudoDaMensagem[9] + "\n" + "- CEP: " + conteudoDaMensagem[10] + "\n");

		System.out.println("-----------------------------------------");

	}

}
