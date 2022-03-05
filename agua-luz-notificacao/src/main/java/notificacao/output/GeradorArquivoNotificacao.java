package notificacao.output;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GeradorArquivoNotificacao {
	
	public static void gerarArquivoTxt(String conteudo) {
		// VERIFICA SE O CAMINHO EXISTE. SE NÃO EXISTIR, USAR O .MKDIRS() PARA CRIAR O
				// CAMINHO
				File output = new File("C:\\estudo\\mjv-java-school\\agua-luz-output");
				if (!output.exists())
					output.mkdirs();

				Path path = Paths.get("C:\\estudo\\mjv-java-school\\agua-luz-output\\agua-luz-notificacao.txt");

				// tratamento de exceção
				try {
					Files.write(path, conteudo.toString().getBytes(StandardCharsets.UTF_8));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

}
