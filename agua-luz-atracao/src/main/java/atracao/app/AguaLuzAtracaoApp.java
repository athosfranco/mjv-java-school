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
		// Aqui s?o chamados os dois m?todos principais da aplica??o, pra realizar as
		// a??es de:

		// ATRA??O - Cria??o das instancias das classes de Pessoa e Contrato
		faseAtracao();

		// GERAR ARQUIVO - Gerar o arquivo desejado com base nos dados especificados na
		// fase de Atra??o.
		faseGeracaoArquivo();
	}

	private static void faseGeracaoArquivo() {
		// A fase de gera?ao de arquivos precisa saber quais s?o os contratos para os
		// quais ser?o gerados os arquivos necess?rios
		// Para isso, consultamos o repositorio fake e usamos o m?todo criado
		// "listarTodos()" para obter todos os contratos que estao
		// armazenados dentro dele.

		List<Contrato> contratos = contratoRepositorio.listarTodos();
		GeradorArquivo gerador = new GeradorArquivo();
		gerador.gerarArquivoCsv(contratos);
		gerador.gerarArquivoTxt(contratos);
	}

	private static void faseAtracao() {
		//////////////// CRIA??O DOS CONTRATOS

		// CONTRATO #1
		Contrato contrato1 = new Contrato();
		contrato1.setNumeroProtocolo(8964);
		contrato1.setServico(Servico.LUZ);

		// Cria?ao da instancia de endere?o q vai fazer parte da Pessoa
		Endereco endereco = new Endereco("Rua 7", "9", "65074550", "Vinhais", "Sao Luis", "MA", "Quadra 11");

		// Cria??o da primeira "Pessoa"
		Pessoa pessoa = new Pessoa("Athos Franco", "607.198.163.86", "568568345", "(98) 98208-0536", endereco,
				Pais.BRASIL, PreferenciaNotificacao.SMS);

		// Atribui?ao da pessoa ao contrato e data
		contrato1.setCadastro(pessoa);
		contrato1.setDataHora(new Date());

		contratoRepositorio.gravar(contrato1); // "gravando" esse contrato dentro do repositorio fake

		// CONTRATO #2
		Contrato contrato2 = new Contrato();
		contrato2.setNumeroProtocolo(7867844);
		contrato2.setServico(Servico.AGUA);

		Endereco endereco2 = new Endereco("Rua D", "Casa 44", "65074333", "Maranhao Novo", "Sao Luis", "MA",
				"Quadra 10");

		Pessoa pessoa2 = new Pessoa("Leticia Ferreira", "897897987", "569458942", "982080536", endereco2, Pais.ESTADOS_UNIDOS,
				PreferenciaNotificacao.WHATS);

		contrato2.setCadastro(pessoa2);
		contrato2.setDataHora(new Date());

		contratoRepositorio.gravar(contrato2);

		// CONTRATO #3
		Contrato contrato3 = new Contrato();
		contrato3.setNumeroProtocolo(68945563);
		contrato3.setServico(Servico.LUZ);

		Endereco endereco3 = new Endereco("Rua das Marias", "243", "27.310-657", "Santo Antonio", "Sao Paulo", "SP",
				"Quadra 10");

		Pessoa pessoa3 = new Pessoa("Gleyson Sampaio", "234.765.987-27", "2022025687", "(11) 99768-1515", endereco3,
				Pais.ALEMANHA, PreferenciaNotificacao.WHATS);

		contrato3.setCadastro(pessoa3);
		contrato3.setDataHora(new Date());

		contratoRepositorio.gravar(contrato3);
		
		
		// CONTRATO #4
		Contrato contrato4 = new Contrato();
		contrato4.setNumeroProtocolo(9530321);
		contrato4.setServico(Servico.LUZ);

		Endereco endereco4 = new Endereco("Rua Dq Bacelar", "203", "65.700-235", "Borborema", "Fortaleza", "CE",
				"Quadra 15");

		Pessoa pessoa4 = new Pessoa("Marcio Feitosa", "123.455.778-98", "2345986", "(98) 98745-2213", endereco4,
				Pais.ESTADOS_UNIDOS, PreferenciaNotificacao.WHATS);

		contrato4.setCadastro(pessoa4);
		contrato4.setDataHora(new Date());

		contratoRepositorio.gravar(contrato4);
	}
}
