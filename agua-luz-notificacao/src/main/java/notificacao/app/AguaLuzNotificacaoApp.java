package notificacao.app;

import java.text.NumberFormat;
import java.util.Locale;

import notificacao.model.LeitorArquivo;
import notificacao.output.GeradorNotificacao;
import notificacao.output.TipoNotificacao;
import notificacao.util.TextoUtil;

public class AguaLuzNotificacaoApp {

	public static void main(String[] args) {

		// Cada linha do arquivo é um contrato diferente, portanto, método .split() para
		// dividir a string em suas quebras de linhas e armazenar cada uma na array
		// "linhas"
		String linhasContrato[] = LeitorArquivo.lerArquivoTxt().split("\n");

		// Será feito um loop nas linhas do arquivo de texto, formatando e gerando
		// notificação para cada um dos contratos

		int index = 1; // mantém um registro numerico de qual msg está sendo enviada

		for (String contrato : linhasContrato) {

			// O método .formatarContrato() recebe como parametro cada uma das linhas
			// representando um contrato, e formata cada uma das entradas para serem
			// exibidas na msg de notificação
			String[] conteudoMensagem = TextoUtil.formatarContrato(contrato);

			TipoNotificacao tipoNotificacao = conteudoMensagem[12].equals("SMS") ? TipoNotificacao.SMS
					: TipoNotificacao.WHATS;

			// Envia a notificação
			GeradorNotificacao.enviarMensagem(tipoNotificacao, conteudoMensagem, index);

			index++;
		}
		
		Locale localeBR = new Locale("de","DE");
		
		NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
		
		double valorDinheiro = 340.55;
		
		System.out.println(dinheiro.format(valorDinheiro));
		
		
		

	}

}
