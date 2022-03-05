package notificacao.app;

import notificacao.model.LeitorArquivo;
import notificacao.output.GeradorNotificacao;
import notificacao.output.TipoNotificacao;
import notificacao.util.TextoUtil;

public class AguaLuzNotificacaoApp {

	public static void main(String[] args) {

		// Cada linha do arquivo � um contrato diferente, portanto, m�todo .split() para
		// dividir a string em suas quebras de linhas e armazenar cada uma na array
		// "linhas"
		String linhasContrato[] = LeitorArquivo.lerArquivoTxt().split("\n");

		// Ser� feito um loop nas linhas do arquivo de texto, formatando e gerando
		// notifica��o para cada um dos contratos

		int index = 1; // mant�m um registro numerico de qual msg est� sendo enviada

		for (String contrato : linhasContrato) {

			// O m�todo .formatarContrato() recebe como parametro cada uma das linhas
			// representando um contrato, e formata cada uma das entradas para serem
			// exibidas na msg de notifica��o
			String[] conteudoMensagem = TextoUtil.formatarContrato(contrato);

			TipoNotificacao tipoNotificacao = conteudoMensagem[12].equals("WHATS") ? TipoNotificacao.WHATS
					: TipoNotificacao.SMS;

			// Envia a notifica��o
			GeradorNotificacao.enviarMensagem(tipoNotificacao, conteudoMensagem, index);

			index++;
		}

	}

}
