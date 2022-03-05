package notificacao.output;

import java.text.NumberFormat;
import java.util.Locale;

public class GeradorNotificacao {

	public static void enviarMensagem(TipoNotificacao tipo, String[] conteudo, int index) {

		String siglaIdioma = conteudo[13].split("-")[0];
		String siglaPais = conteudo[13].split("-")[1];

		Locale localeExtraido = new Locale(siglaIdioma, siglaPais);

		NumberFormat formatacaoValorMonetario = NumberFormat.getCurrencyInstance(localeExtraido);

		String valorFormatado = formatacaoValorMonetario.format(Double.parseDouble(conteudo[5].replace(",", ".")));

		System.out.println(
				"[Mensagem #" + index + " enviada via " + tipo.getTipo() + " para o n�mero: " + conteudo[11] + "] \n");

		System.out.println("Senhor(a) " + conteudo[0] + ", Informamos que conforme contrato com protocolo de n�mero "
				+ conteudo[1] + " est� agendado para a data " + conteudo[2] + " �s " + conteudo[3] + "\n a instala��o da "
				+ conteudo[4] + " com taxa de valor " + valorFormatado
				+ " em sua resid�ncia localizada no endere�o abaixo: \n" + "- Logradouro: " + conteudo[6] + "\n"
				+ "- Complemento: " + conteudo[7] + "\n" + "- Bairro: " + conteudo[8] + "\n" + "- Cidade: "
				+ conteudo[9] + "\n" + "- CEP: " + conteudo[10] + "\n");

		System.out.println("-----------------------------------------");

	}

}
