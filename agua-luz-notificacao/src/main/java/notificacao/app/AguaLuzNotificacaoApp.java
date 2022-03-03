package notificacao.app;

import notificacao.model.LeitorArquivo;

public class AguaLuzNotificacaoApp {

	public static void main(String[] args) {
		// Cada linha do arquivo é um contrato diferente, portanto, método .split() para
		// dividir a string em suas quebras de linhas e armazenar cada uma na array
		// "linhas"
		String linhas[] = LeitorArquivo.lerArquivoTxt().split("\n");

		for (String contrato : linhas) {
			// Pegando cada entrada de acordo com a sua posição no arquivo de texto
			String cpf = contrato.substring(0, 11);
			String nome = contrato.substring(11, 30);
			String celular = contrato.substring(41, 52);
			String logradouro = contrato.substring(52, 72);
			String numero = contrato.substring(72, 78);
			String complemento = contrato.substring(78, 88);
			String bairro = contrato.substring(88, 103);
			String cidade = contrato.substring(103, 133);
			String uf = contrato.substring(133, 135);
			String cep = contrato.substring(135, 143);
			String protocolo = contrato.substring(143, 153);
			String data = contrato.substring(153, 161);
			String hora = contrato.substring(161, 165);
			String tipo = contrato.substring(165, 166);
			String valor = contrato.substring(166, 174);
			
			

		}

	}

}
