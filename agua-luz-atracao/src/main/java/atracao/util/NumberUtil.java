package atracao.util;

public class NumberUtil {

	// formatar num de celular
	public static String formatarCelular(String numeroOriginal, int tamMaximo) {

		String numeroFormatado = numeroOriginal.trim().replaceAll("\\D+", ""); // remove espaços ANTES ou DEPOIS do
																				// numero e remove qualquer caractere
																				// que nao seja um dígito

		// Se o numero for maior q 11 caracteres, o valor é recortado
		if (numeroFormatado.length() > 11) {
			numeroFormatado = numeroFormatado.substring(0, tamMaximo);

		} else { // caso seja menor que 11 caracteres, o valor é preenchido com espaço
			String formato = "%-" + tamMaximo + "s";
			numeroFormatado = String.format(formato, numeroFormatado);
		}

		return numeroFormatado;

	}

	// formatar numero com zeros à esquerda
	public static String adicionaZerosEsquerda(String numOriginal, int tamanho) {
		
		String novaString = numOriginal.replaceAll("\\D+", "");

		if (novaString.length() >= tamanho) {
			return novaString.substring(0, tamanho);
		}

		StringBuilder sb = new StringBuilder();
		while (sb.length() < tamanho - novaString.length()) {
			sb.append('0');
		}
		sb.append(novaString);

		return sb.toString();
	}

}
