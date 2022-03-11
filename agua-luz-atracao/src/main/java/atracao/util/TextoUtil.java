package atracao.util;

public class TextoUtil {
	public static String preencher(String original, int tamMaximo) {
		String formato = "%-" + tamMaximo + "s";
		String novaString = String.format(formato, original);
		return novaString;
	}
	
	public static String recortar(String original, int tamMaximo) {
		String novaString = original.substring(0, Math.min(tamMaximo, original.length()));
		return novaString;
	}

	
	public static String formatarCampo(String original, int tamMaximo) {
		String novaString = preencher(original, tamMaximo);
		novaString = recortar(novaString, tamMaximo);
		return novaString;
		
	}
}
