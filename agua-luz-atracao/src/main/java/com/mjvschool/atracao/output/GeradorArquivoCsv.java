package com.mjvschool.atracao.output;

//importar a biblioteca io.File para manipular arquivos
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

//importar o objeto do Contrato
import com.mjvschool.atracao.model.contrato.Contrato;

public class GeradorArquivoCsv {

	public void gerarArquivo(List<Contrato> contratos) {

		// Utilizamos a StringBuilder ao invés do processo de concatenação padrão de
		// String, pois a StringBuilder é mais poderosa
		StringBuilder conteudo = new StringBuilder();

		// Faz um loop na lista de contratos e gera uma string com o nome e o CPF para
		// cada contrato
		for (Contrato ct : contratos) {
			conteudo.append(ct.getCadastro().getNome().concat(";").concat(ct.getCadastro().getCpf()));
			conteudo.append("\n");
		}

		System.out.println(conteudo.toString());

		// VERIFICA SE O CAMINHO EXISTE. SE NÃO EXISTIR, USAR O .MKDIRS() PARA CRIAR O
		// CAMINHO
		File output = new File("C:\\estudo\\mjv-java-school\\agua-luz-output");
		if (!output.exists())
			output.mkdirs();

		Path path = Paths.get("C:\\estudo\\mjv-java-school\\agua-luz-output\\agua-luz-contratos.txt");

		//tratamento de exceção
		try {
			Files.write(path, conteudo.toString().getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
