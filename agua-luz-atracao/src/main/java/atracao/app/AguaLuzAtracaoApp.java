package atracao.app;

import java.util.Date;
import java.util.List;

import atracao.model.cadastro.Endereco;
import atracao.model.cadastro.Pais;
import atracao.model.cadastro.Pessoa;
import atracao.model.cadastro.PreferenciaNotificacao;
import atracao.model.cadastro.Servico;
import atracao.model.contrato.Contrato;
import atracao.output.GeradorArquivo;
import atracao.repository.ContratoRepository;

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
		GeradorArquivo gerador = new GeradorArquivo();
		gerador.gerarArquivoCsv(contratos);
		gerador.gerarArquivoTxt(contratos);
	}

	private static void faseAtracao() {

		// Criação do primeiro contrato
		Contrato contrato1 = new Contrato();
		contrato1.setNumeroProtocolo(123);
		contrato1.setServico(Servico.LUZ);

		// Criaçao da instancia de endereço q vai fazer parte da Pessoa
		Endereco endereco = new Endereco("Rua 7", "9", "65074550", "Vinhais", "Sao Luis", "MA", "Quadra 11");

		// Criação da primeira "Pessoa"
		Pessoa pessoa = new Pessoa("Athos Franco", "607.198.163.86", "0909099009", "(98) 98208-0536", endereco,
				Pais.BRASIL, PreferenciaNotificacao.SMS);

		// Atribuiçao da pessoa ao contrato e data
		contrato1.setCadastro(pessoa);
		contrato1.setDataHora(new Date());

		contratoRepositorio.gravar(contrato1); // "gravando" esse contrato dentro do repositorio fake

		// Repetiçao do mesmo processo, novo contrato
		Contrato contrato2 = new Contrato();
		contrato2.setNumeroProtocolo(78678);
		contrato2.setServico(Servico.AGUA);

		Endereco endereco2 = new Endereco("Rua D", "Casa 44", "65074333", "Maranhao Novo", "Sao Luis", "MA",
				"Quadra 10");

		Pessoa pessoa2 = new Pessoa("Leticia", "897897987", "0101010101", "982080536", endereco2,
				Pais.ESTADOS_UNIDOS, PreferenciaNotificacao.WHATS);

		contrato2.setCadastro(pessoa2);
		contrato2.setDataHora(new Date());

		contratoRepositorio.gravar(contrato2);
	}
}
