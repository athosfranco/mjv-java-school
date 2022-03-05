package notificacao.util;

import java.util.Locale;

public class TextoUtil {

	public static String[] formatarContrato(String linhaContrato) {

		String[] conteudoNotificacao = new String[15];

		// Este "for" loop está pegando cada entrada de acordo com a sua posição no
		// arquivo de texto e formatando a mesma para a forma como deve ser exibida na
		// notificação

		// Formatar o NOME ////////////////////////////////////////////////
		String nome = linhaContrato.substring(11, 30);

		String[] nomeRepartido = nome.split(" ");

		for (int i = 0; i < nomeRepartido.length; i++) {
			nomeRepartido[i] = nomeRepartido[i].substring(0, 1).toUpperCase()
					+ nomeRepartido[i].substring(1).toLowerCase();
		}

		String nomeFormatado = String.join(" ", nomeRepartido);

		conteudoNotificacao[0] = nomeFormatado;

		// CPF
		String cpf = linhaContrato.substring(0, 11);
		conteudoNotificacao[14] = cpf;

		// PROTOCOLO
		String protocolo = linhaContrato.substring(143, 153);
		conteudoNotificacao[1] = protocolo;

		// LOCALE
		String localeExtraido = linhaContrato.substring(179);
		conteudoNotificacao[13] = localeExtraido;

		String siglaIdioma = localeExtraido.split("-")[0];
		String siglaPais = localeExtraido.split("-")[1];

		Locale locale = new Locale(siglaIdioma, siglaPais);

		// Formatar a DATA ////////////////////////////////////////////////

		String data = linhaContrato.substring(153, 161);

		String ano = data.substring(0, 4);
		String mes = data.substring(4, 6);
		String dia = data.substring(6, 8);

		data = siglaPais.equals("BR") ? dia + "/" + mes + "/" + ano : ano + "/" + mes + "/" + dia;

		conteudoNotificacao[2] = data;

		// Formatar a HORA ////////////////////////////////////////////////
		String hora = linhaContrato.substring(161, 165);
		String horas = hora.substring(0, 2);
		String minutos = hora.substring(2, 4);
		hora = horas + ":" + minutos + "h";
		conteudoNotificacao[3] = hora;

		// Formatar o TIPO DE SERVIÇO /////////////////////////////////////
		String tipo = linhaContrato.substring(165, 166);
		tipo = tipo.equals("A") ? "Água" : "Luz";
		conteudoNotificacao[4] = tipo;

		// Formatar o VALOR ///////////////////////////////////////////////
		String valor = linhaContrato.substring(166, 174);
		valor = valor.replace("0", "");
		String reais = valor.substring(0, 3);
		String cents = valor.substring(3);
		valor = reais + "," + cents;
		conteudoNotificacao[5] = valor;

		// Formatar o LOGRADOURO ////////////////////////////////////////////////
		String logradouro = linhaContrato.substring(52, 72);

		String[] logradouroRepartido = logradouro.split(" ");

		for (int i = 0; i < logradouroRepartido.length; i++) {
			logradouroRepartido[i] = logradouroRepartido[i].substring(0, 1).toUpperCase()
					+ logradouroRepartido[i].substring(1).toLowerCase();
		}

		String logradouroFormatado = String.join(" ", logradouroRepartido);

		conteudoNotificacao[6] = logradouroFormatado;

		// Formatar o COMPLEMENTO ////////////////////////////////////////////////
		String complemento = linhaContrato.substring(78, 88);

		String[] compRepartido = complemento.split(" ");

		for (int i = 0; i < compRepartido.length; i++) {
			compRepartido[i] = compRepartido[i].substring(0, 1).toUpperCase()
					+ compRepartido[i].substring(1).toLowerCase();
		}

		String complementoFormatado = String.join(" ", compRepartido);

		conteudoNotificacao[7] = complementoFormatado;

		// Formatar o BAIRRO ////////////////////////////////////////////////
		String bairro = linhaContrato.substring(88, 103);

		String[] bairroRepartido = bairro.split(" ");

		for (int i = 0; i < bairroRepartido.length; i++) {
			bairroRepartido[i] = bairroRepartido[i].substring(0, 1).toUpperCase()
					+ bairroRepartido[i].substring(1).toLowerCase();
		}

		String bairroFormatado = String.join(" ", bairroRepartido);

		conteudoNotificacao[8] = bairroFormatado;

		// Formatar a CIDADE com UF //////////////////////////////////////////////
		String cidade = linhaContrato.substring(103, 133);
		String uf = linhaContrato.substring(133, 135);

		String[] cidadeRepartido = cidade.split(" ");

		for (int i = 0; i < cidadeRepartido.length; i++) {
			cidadeRepartido[i] = cidadeRepartido[i].substring(0, 1).toUpperCase()
					+ cidadeRepartido[i].substring(1).toLowerCase();
		}

		String cidadeFormatado = String.join(" ", cidadeRepartido);

		conteudoNotificacao[9] = cidadeFormatado + " / " + uf;

		// Formatar o CEP ///////////////////////////////////////////////////////
		String cep = linhaContrato.substring(135, 143);
		String inicioCep = cep.substring(0, 2);
		String meioCep = cep.substring(2, 5);
		String finalCep = cep.substring(5);

		cep = inicioCep + "." + meioCep + "-" + finalCep;

		conteudoNotificacao[10] = cep;

		// Numero Celular
		String celular = linhaContrato.substring(41, 52);
		conteudoNotificacao[11] = celular;

		// Preferencia de Notificacao
		conteudoNotificacao[12] = linhaContrato.substring(174, 179);

		/*
		 * OUTROS DADOS - por enquanto não são necessários
		 * 
		 * String cpf = contrato.substring(0, 11); String celular =
		 * contrato.substring(41, 52); String numero = contrato.substring(72, 78);
		 * 
		 */

		return conteudoNotificacao;
	}

}
