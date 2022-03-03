package notificacao.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LeitorArquivo {

	public static String lerArquivoTxt() {
		// Esse método utiliza a classe Files e Path para obter o arquivo
		// "agua-luz-contratos.txt" gerado pela 1º fase

		Path path = Paths.get("C:\\estudo\\mjv-java-school\\agua-luz-output\\agua-luz-contratos.txt");

		try {

			byte[] textoEmBytes = Files.readAllBytes(path);
			String arquivoTxt = new String(textoEmBytes);

			return arquivoTxt;

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}

	public static void main(String[] args) {
		System.out.println("olá mundo");
	}

}
