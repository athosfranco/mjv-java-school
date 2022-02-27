package com.mjvschool.atracao.app;

import java.util.Date;
import java.util.List;

import com.mjvschool.atracao.model.cadastro.Endereco;
import com.mjvschool.atracao.model.cadastro.Pais;
import com.mjvschool.atracao.model.cadastro.Pessoa;
import com.mjvschool.atracao.model.cadastro.Servico;
import com.mjvschool.atracao.model.contrato.Contrato;
import com.mjvschool.atracao.output.GeradorArquivoCsv;
import com.mjvschool.atracao.repository.ContratoRepository;

public class AguaLuzAtracaoApp {

	// inicializa uma nova instancia do contrato
	private static ContratoRepository contratoRepositorio = new ContratoRepository();

	public static void main(String[] args) {
		// Aqui s�o chamados os dois m�todos principais da aplica��o, pra realizar as
		// a��es de:

		// ATRA��O - Cria��o das instancias das classes de Pessoa e Contrato
		faseAtracao();

		// GERAR ARQUIVO - Gerar o arquivo desejado com base nos dados especificados na
		// fase de Atra��o.
		faseGeracaoArquivo();
	}

	private static void faseGeracaoArquivo() {
		// A fase de gera�ao de arquivos precisa saber quais s�o os contratos para os
		// quais ser�o gerados os arquivos necess�rios
		// Para isso, consultamos o repositorio fake e usamos o m�todo criado
		// "listarTodos()" para obter todos os contratos que estao
		// armazenados dentro dele.

		List<Contrato> contratos = contratoRepositorio.listarTodos();
		GeradorArquivoCsv gerador = new GeradorArquivoCsv();
		gerador.gerarArquivo(contratos);
	}

	private static void faseAtracao() {

		// Cria��o do primeiro contrato
		Contrato contrato1 = new Contrato();
		contrato1.setNumeroProtocolo(123);
		contrato1.setServico(Servico.LUZ);

		// Cria��o da primeira "Pessoa"
		Pessoa pessoa = new Pessoa();
		pessoa.setCpf("123213");
		pessoa.setNome("Athos Franco");
		pessoa.setRg("89789");
		pessoa.setPais(Pais.BRASIL);
		pessoa.setCelular("982080536");

		// Cria�ao da instancia de endere�o q vai fazer parte da Pessoa
		Endereco endereco = new Endereco();
		endereco.setBairro("Santo Antonio");
		endereco.setCep("27.310-657");
		endereco.setCidade("Sao Paulo");
		endereco.setEstado("SP");
		endereco.setLogradouro("Rua das Marias");
		endereco.setNumero("243");
		pessoa.setEndereco(endereco); // definindo o endere�o da Pessoa criada com o endere�o criado
		contrato1.setCadastro(pessoa);
		contrato1.setDataHora(new Date());

		contratoRepositorio.gravar(contrato1); // "gravando" esse contrato dentro do repositorio fake

		// Repeti�ao do mesmo processo, novo contrato
		Contrato contrato2 = new Contrato();
		contrato2.setNumeroProtocolo(78678);
		contrato2.setServico(Servico.AGUA);

		Pessoa pessoa2 = new Pessoa();
		pessoa2.setCpf("897897987");
		pessoa2.setNome("Let�cia Ferreira");
		pessoa2.setRg("98908");
		pessoa2.setPais(Pais.ESTADOS_UNIDOS);

		pessoa2.setCelular("98789789");

		Endereco endereco2 = new Endereco();
		endereco2.setBairro("Santo Antonio");
		endereco2.setCep("27.310-657");
		endereco2.setCidade("Sao Paulo");
		endereco2.setEstado("SP");
		endereco2.setLogradouro("Rua das Marias");
		endereco2.setNumero("243");
		pessoa2.setEndereco(endereco2);
		contrato2.setCadastro(pessoa2);
		contrato2.setDataHora(new Date());

		contratoRepositorio.gravar(contrato2);
	}
}
