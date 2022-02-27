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
		// Aqui são chamados os dois métodos principais da aplicação, pra realizar as
		// ações de:

		// ATRAÇÃO - Criação das instancias das classes de Pessoa e Contrato
		faseAtracao();

		// GERAR ARQUIVO - Gerar o arquivo desejado com base nos dados especificados na
		// fase de Atração.
		faseGeracaoArquivo();
	}

	private static void faseGeracaoArquivo() {
		// A fase de geraçao de arquivos precisa saber quais são os contratos para os
		// quais serão gerados os arquivos necessários
		// Para isso, consultamos o repositorio fake e usamos o método criado
		// "listarTodos()" para obter todos os contratos que estao
		// armazenados dentro dele.

		List<Contrato> contratos = contratoRepositorio.listarTodos();
		GeradorArquivoCsv gerador = new GeradorArquivoCsv();
		gerador.gerarArquivo(contratos);
	}

	private static void faseAtracao() {

		// Criação do primeiro contrato
		Contrato contrato1 = new Contrato();
		contrato1.setNumeroProtocolo(123);
		contrato1.setServico(Servico.LUZ);

		// Criação da primeira "Pessoa"
		Pessoa pessoa = new Pessoa();
		pessoa.setCpf("123213");
		pessoa.setNome("Athos Franco");
		pessoa.setRg("89789");
		pessoa.setPais(Pais.BRASIL);
		pessoa.setCelular("982080536");

		// Criaçao da instancia de endereço q vai fazer parte da Pessoa
		Endereco endereco = new Endereco();
		endereco.setBairro("Santo Antonio");
		endereco.setCep("27.310-657");
		endereco.setCidade("Sao Paulo");
		endereco.setEstado("SP");
		endereco.setLogradouro("Rua das Marias");
		endereco.setNumero("243");
		pessoa.setEndereco(endereco); // definindo o endereço da Pessoa criada com o endereço criado
		contrato1.setCadastro(pessoa);
		contrato1.setDataHora(new Date());

		contratoRepositorio.gravar(contrato1); // "gravando" esse contrato dentro do repositorio fake

		// Repetiçao do mesmo processo, novo contrato
		Contrato contrato2 = new Contrato();
		contrato2.setNumeroProtocolo(78678);
		contrato2.setServico(Servico.AGUA);

		Pessoa pessoa2 = new Pessoa();
		pessoa2.setCpf("897897987");
		pessoa2.setNome("Letícia Ferreira");
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
