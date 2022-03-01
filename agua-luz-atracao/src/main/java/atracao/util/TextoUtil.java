package atracao.util;

public class TextoUtil {
	public static String fill(String original, int tamMaximo) {
		String formato = "%-" + tamMaximo + "s";
		String novaString = String.format(formato, original);
		return novaString;
	}
	
	public static String cut(String original, int tamMaximo) {
		String novaString = original.substring(0, Math.min(tamMaximo, original.length()));
		return novaString;
	}

	
	public static String formatField(String original, int tamMaximo) {
		String novaString = fill(original, tamMaximo);
		novaString = cut(novaString, tamMaximo);
		return novaString;
		
	}
}
