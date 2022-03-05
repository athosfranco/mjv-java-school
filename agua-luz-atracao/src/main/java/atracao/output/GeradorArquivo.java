package atracao.output;

//importar a biblioteca io.File para manipular arquivos
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.List;

import atracao.model.cadastro.PreferenciaNotificacao;
import atracao.model.cadastro.Servico;
import atracao.model.contrato.Contrato;
import atracao.util.NumberUtil;
import atracao.util.TextoUtil;

public class GeradorArquivo {

	// ESSE MÉTODO GERA ARQUIVO CSV
	public void gerarArquivoCsv(List<Contrato> contratos) {

		// Utilizamos a StringBuilder ao invés do processo de concatenação padrão de
		// String, pois a StringBuilder é mais poderosa
		StringBuilder conteudo = new StringBuilder();

		// Gera a primeira linha do arquivo .csv contendo o campo das colunas
		conteudo.append("NOME".concat(";").concat("CPF").concat(";").concat("CELULAR").concat(";").concat("LOGRADOURO")
				.concat(";").concat("NUMERO").concat(";").concat("COMPLEMENTO").concat(";").concat("BAIRRO").concat(";")
				.concat("CIDADE").concat(";").concat("ESTADO").concat(";").concat("CEP").concat(";").concat("PROTOCOLO")
				.concat(";").concat("DATA").concat(";").concat("SERVICO").concat(";").concat("VALOR").concat(";")
				.concat("NOTIFICACAO").concat(";").concat("LOCALE"));

		conteudo.append("\n");

		// Faz um loop na lista de contratos e gera uma string com o nome e o CPF para
		// cada contrato, cada um ocupando uma linha no arquivo
		for (Contrato ct : contratos) {
			String nome = ct.getCadastro().getNome();
			String cpf = ct.getCadastro().getCpf();
			String celular = ct.getCadastro().getCelular();
			String logradouro = ct.getCadastro().getEndereco().getLogradouro();
			String num = ct.getCadastro().getEndereco().getNumero();
			String complemento = ct.getCadastro().getEndereco().getComplemento();
			String bairro = ct.getCadastro().getEndereco().getBairro();
			String cidade = ct.getCadastro().getEndereco().getCidade();
			String uf = ct.getCadastro().getEndereco().getEstado();
			String cep = ct.getCadastro().getEndereco().getCep();
			String protocolo = String.valueOf(ct.getNumeroProtocolo());
			String data = String.valueOf(ct.getDataHora());
			String tipoContrato = String.valueOf(ct.getServico());
			String valorServico = String.valueOf(ct.getServico().getValor());
			String preferenciaNotificacao = String.valueOf(ct.getCadastro().getPreferencia());
			String localePais = ct.getCadastro().getPais().getSiglaIdioma() + "-"
					+ ct.getCadastro().getPais().getSiglaPais();

			conteudo.append(nome.concat(";").concat(cpf).concat(";").concat(celular).concat(";").concat(logradouro)
					.concat(";").concat(num).concat(";").concat(complemento).concat(";").concat(bairro).concat(";")
					.concat(cidade).concat(";").concat(uf).concat(";").concat(cep).concat(";").concat(protocolo)
					.concat(";").concat(data).concat(";").concat(tipoContrato).concat(";").concat(valorServico)
					.concat(";").concat(preferenciaNotificacao).concat(";").concat(localePais));

			conteudo.append("\n");

		}

		System.out.println(conteudo.toString());

		// VERIFICA SE O CAMINHO EXISTE. SE NÃO EXISTIR, USAR O .MKDIRS() PARA CRIAR O
		// CAMINHO
		File output = new File("C:\\estudo\\mjv-java-school\\agua-luz-output");
		if (!output.exists())
			output.mkdirs();

		Path path = Paths.get("C:\\estudo\\mjv-java-school\\agua-luz-output\\agua-luz-contratos.csv");

		// tratamento de exceção
		try {
			Files.write(path, conteudo.toString().getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// ESSE MÉTODO GERA ARQUIVO NO ASPECTO POSICIONAL
	@SuppressWarnings("deprecation")
	public void gerarArquivoTxt(List<Contrato> contratos) {

		StringBuilder conteudo = new StringBuilder();

		for (Contrato ct : contratos) {
			// Formata o CPF
			conteudo.append(TextoUtil.formatField(ct.getCadastro().getCpf().replace(".", ""), 11));

			// Formata o NOME
			conteudo.append(TextoUtil.formatField(ct.getCadastro().getNome(), 30).toUpperCase());

			// Formata o CELULAR
			conteudo.append(NumberUtil.formatarCelular(ct.getCadastro().getCelular(), 11));

			// Formata o LOGRADOURO
			conteudo.append(TextoUtil.formatField(ct.getCadastro().getEndereco().getLogradouro(), 20).toUpperCase());

			// Formata o NUMERO
			conteudo.append(NumberUtil.adicionaZerosEsquerda(ct.getCadastro().getEndereco().getNumero(), 6));

			// Formata o COMPLEMENTO
			conteudo.append(TextoUtil.formatField(ct.getCadastro().getEndereco().getComplemento(), 10).toUpperCase());

			// Formata o BAIRRO
			conteudo.append(TextoUtil.formatField(ct.getCadastro().getEndereco().getBairro(), 15).toUpperCase());

			// Formata a CIDADE
			conteudo.append(TextoUtil.formatField(ct.getCadastro().getEndereco().getCidade(), 30).toUpperCase());

			// Formata a UF
			conteudo.append(TextoUtil.formatField(ct.getCadastro().getEndereco().getEstado(), 2).toUpperCase());

			// Formata o CEP
			conteudo.append(TextoUtil.formatField(ct.getCadastro().getEndereco().getCep().replace(".", ""), 8));

			// Formata o PROTOCOLO
			conteudo.append(NumberUtil.adicionaZerosEsquerda(String.valueOf(ct.getNumeroProtocolo()), 10));

			// Formata a DATA
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			String dataFormatada = formatter.format(ct.getDataHora());
			conteudo.append(dataFormatada.replaceAll("\\D+", ""));

			// Formata a HORA
			String hora = String.valueOf(ct.getDataHora().getHours()) + String.valueOf(ct.getDataHora().getMinutes());
			conteudo.append(NumberUtil.adicionaZerosEsquerda(hora, 4));

			// Formata o TIPO
			String tipoContrato = ct.getServico() == Servico.AGUA ? "A" : "L";
			conteudo.append(tipoContrato);

			// Formata o VALOR
			conteudo.append(NumberUtil.adicionaZerosEsquerda(String.valueOf(ct.getServico().getValor()), 8));

			// Formata a PREFERENCIA DE NOTIFICACAO
			String preferencia = TextoUtil
					.formatField(ct.getCadastro().getPreferencia() == PreferenciaNotificacao.SMS ? "SMS" : "WHATS", 5);
			conteudo.append(preferencia);

			// Formata o PAÍS (LOCALE)
			String localePais = ct.getCadastro().getPais().getSiglaIdioma() + "-"
					+ ct.getCadastro().getPais().getSiglaPais();
			conteudo.append(localePais);

			conteudo.append("\n");
		}
		
		System.out.println(conteudo.toString());

		// VERIFICA SE O CAMINHO EXISTE. SE NÃO EXISTIR, USAR O .MKDIRS() PARA CRIAR O
		// CAMINHO
		File output = new File("C:\\estudo\\mjv-java-school\\agua-luz-output");
		if (!output.exists())
			output.mkdirs();

		Path path = Paths.get("C:\\estudo\\mjv-java-school\\agua-luz-output\\agua-luz-contratos.txt");

		// tratamento de exceção
		try {
			Files.write(path, conteudo.toString().getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
