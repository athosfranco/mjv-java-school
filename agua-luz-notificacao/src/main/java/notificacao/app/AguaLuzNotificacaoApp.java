package notificacao.app;

import notificacao.model.LeitorArquivo;
import notificacao.util.TextoUtil;

public class AguaLuzNotificacaoApp {

	public static void main(String[] args) {

		// Cada linha do arquivo � um contrato diferente, portanto, m�todo .split() para
		// dividir a string em suas quebras de linhas e armazenar cada uma na array
		// "linhas"
		String linhas[] = LeitorArquivo.lerArquivoTxt().split("\n");

		// O m�todo .formatarContrato() recebe como parametro a array de "linhas" e
		// formata cada uma das entradas para serem exibidas na msg de notifica��o
		TextoUtil.formatarContrato(linhas);

		// IMPLEMENTAR M�TODO .gerarNotificacao();

	}

}
