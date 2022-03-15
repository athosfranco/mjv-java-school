package atracao.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import atracao.model.cadastro.Endereco;
import atracao.model.contrato.Contrato;

//ESTA CLASSE FUNCIONA COMO UM "BANCO DE DADOS FAKE". AQUI SER�O ARMAZENADOS OS CONTRATOS CRIADOS PELA APLICA��O DURANTE A SUA EXECU��O.

public class ContratoRepository {

	// lista de contratos
	private List<Contrato> contratos = new ArrayList<Contrato>();

	// m�todo pra gravar um contrato na lista
	public void gravar(Contrato contrato) {
		contratos.add(contrato);
	}

	// m�todo para listar todos os contratos
	public List<Contrato> listarTodos() {
		return contratos;
	}

	////////////// CREATE
	public void registrar(Contrato contrato) throws Exception {

		Connection connection = FabricaConexao.getConexao();

		String sqlEndereco = "INSERT INTO tb_endereco (logradouro, numero, complemento, bairro, cidade, uf, cep, pais)"
				+ " VALUES(?,?,?,?,?,?,?,?)";

		FabricaConexao.abrirConexao();

		PreparedStatement stmt = connection.prepareStatement(sqlEndereco);

		Endereco endereco = contrato.getCadastro().getEndereco();

		// 1 parametro
		stmt.setString(1, endereco.getLogradouro());

		// 2 parametro
		stmt.setString(2, endereco.getNumero());

		// 3 parametro - COMPL.
		stmt.setString(3, endereco.getComplemento());

		// 4 parametro - BAIRRO
		stmt.setString(4, endereco.getBairro());

		// 5 parametro - CIDADE
		stmt.setString(5, endereco.getCidade());

		// 6 parametro - UF
		stmt.setString(6, endereco.getEstado());

		// 7 parametro - PAIS
		stmt.setString(7, contrato.getCadastro().getPais().getSiglaPais());

		// executar comando sql
		stmt.execute();

		// confirma�ao console
		System.out.println("INSER��O DE ENDERE�O NA TABELA REALIZADO");

		// Fecha o statement endere�o
		stmt.close();

		// Registrando a pessoa
		String sqlPessoa = "INSERT INTO tb_pessoa (cpf, nome, rg, celular, endereco_id, tipo_notificacao)"
				+ " VALUES(?,?,?,?,?,?)";

		stmt = connection.prepareStatement(sqlPessoa);

		// 1 parametro - CPF
		stmt.setString(1, contrato.getCadastro().getCpf());

		// 2 parametro - NOME
		stmt.setString(2, contrato.getCadastro().getNome());

		// 3 parametro - RG
		stmt.setString(2, contrato.getCadastro().getRg());

		// 4 parametro - CELULAR
		stmt.setString(3, contrato.getCadastro().getCelular());

		// 5 parametro - ENDERE�O ID
		stmt.setInt(4, 1);
		stmt.setString(5, contrato.getCadastro().getPreferenciaStr());

		// 6 parametro - TIPO NOTIFICA�AO
		stmt.setString(6, contrato.getCadastro().getPreferencia().getPreferencia());

		// executar comando sql
		stmt.execute();

		// confirma�ao console
		System.out.println("INSER��O DE PESSOA NA TABELA REALIZADO");

		// Fecha o statement endere�o
		stmt.close();
		
		// Registrando o contrato
		String sqlContrato = "INSERT INTO tb_contrato (numero_protocolo, pessoa_id, tipo_servico, data)"
				+ " VALUES(?,?,?,?)";

		stmt = connection.prepareStatement(sqlPessoa);

		// 1 parametro - NUM PROTOCOLO
		stmt.setString(1, String.valueOf(contrato.getNumeroProtocolo()));

		// 2 parametro - ID PESSOA
		stmt.setInt(2, 1);

		// 3 parametro - TIPO SERVI�O
		stmt.setString(2, contrato.getCadastro().getRg());

		// 4 parametro - CELULAR
		stmt.setString(3, contrato.getCadastro().getCelular());

		// 5 parametro - ENDERE�O ID
		stmt.setInt(4, 1);
		stmt.setString(5, contrato.getCadastro().getPreferenciaStr());

		// 6 parametro - TIPO NOTIFICA�AO
		stmt.setString(6, contrato.getCadastro().getPreferencia().getPreferencia());

		// executar comando sql
		stmt.execute();

		// confirma�ao console
		System.out.println("INSER��O DE CONTRATO NA TABELA REALIZADO");

		// Fecha o statement ender

		
	}

}
/*
 * 
 * ////////////// DELETE public void remover(int id) throws Exception {
 * 
 * String sql = "DELETE FROM tb_aluno WHERE id = ?";
 * 
 * FabricaConexao.abrirConexao();
 * 
 * Connection connection = FabricaConexao.getConexao();
 * 
 * PreparedStatement ps = connection.prepareStatement(sql);
 * 
 * ps = connection.prepareStatement(sql);
 * 
 * ps.setInt(1, id);
 * 
 * ps.execute();
 * 
 * // confirma�ao
 * System.out.println("EXCLUS�O DO BANCO DE DADOS REALIZADA COM SUCESSO!");
 * 
 * // Fecha as conex�es
 * 
 * if (ps != null) ps.close();
 * 
 * if (connection != null) connection.close();
 * 
 * }
 * 
 * ///////////////// UPDATE public void update(Aluno aluno, int id) throws
 * Exception {
 * 
 * String sql = "UPDATE tb_aluno SET nome = ?, altura = ?, sexo = ?, ativo = ?"
 * + " WHERE id = ?";
 * 
 * // Cria uma conex�o com o banco FabricaConexao.abrirConexao(); Connection
 * connection = FabricaConexao.getConexao();
 * 
 * // Cria um PreparedStatment, classe usada para executar a query
 * 
 * PreparedStatement ps = connection.prepareStatement(sql);
 * 
 * ps = connection.prepareStatement(sql);
 * 
 * // 1 parametro ps.setString(1, aluno.getNome());
 * 
 * // 2 parametro ps.setDouble(2, aluno.getAltura());
 * 
 * // 3 parametro ps.setString(3, aluno.getSexo());
 * 
 * // 4 parametro ps.setBoolean(4, aluno.isAtivo());
 * 
 * // 5 parametro (ID) ps.setInt(5, id);
 * 
 * // executar comando sql ps.execute();
 * 
 * // confirma�ao console
 * System.out.println("ATUALIZA��O DE DADOS NA TABELA REALIZADO COM SUCESSO");
 * 
 * // Fecha as conex�es
 * 
 * if (ps != null) ps.close();
 * 
 * if (connection != null) connection.close();
 * 
 * }
 * 
 * ///////////////////// READ public void obter() throws Exception {
 * 
 * // Cria uma conex�o com o banco FabricaConexao.abrirConexao(); Connection
 * connection = FabricaConexao.getConexao();
 * 
 * String sql = "SELECT * from tb_aluno"; PreparedStatement statement =
 * connection.prepareStatement(sql);
 * 
 * ResultSet result = statement.executeQuery();
 * 
 * while (result.next()) {
 * 
 * result.getString("nome"); result.getDouble("altura");
 * result.getString("sexo"); result.getBoolean("ativo");
 * 
 * // etc. } }
 * 
 */