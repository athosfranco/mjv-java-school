package com.mjv.repository;

public class JdbcRepository {

	////////////// EM DESUSO, APENAS P CONSULTA

	/*
	 * public void registrar(Aluno aluno) throws Exception {
	 * 
	 * String sql = "INSERT INTO tb_aluno (nome, altura, sexo, ativo)" +
	 * " VALUES(?,?,?,?)";
	 * 
	 * bancoConexao.abrirConexao();
	 * 
	 * Connection connection = bancoConexao.getConexao();
	 * 
	 * PreparedStatement ps = connection.prepareStatement(sql);
	 * 
	 * // 1 parametro ps.setString(1, aluno.getNome());
	 * 
	 * // 2 parametro ps.setDouble(2, aluno.getAltura());
	 * 
	 * // 3 parametro ps.setString(3, aluno.getSexo());
	 * 
	 * // 4 parametro ps.setBoolean(4, aluno.isAtivo());
	 * 
	 * // executar comando sql ps.execute();
	 * 
	 * // confirmaçao console
	 * System.out.println("INSERÇÃO DE DADOS NA TABELA REALIZADO");
	 * 
	 * // Fecha as conexões
	 * 
	 * if (ps != null) ps.close();
	 * 
	 * if (connection != null) connection.close();
	 * 
	 * }
	 * 
	 * ////////////// DELETE public void remover(int id) throws Exception {
	 * 
	 * String sql = "DELETE FROM tb_aluno WHERE id = ?";
	 * 
	 * bancoConexao.abrirConexao();
	 * 
	 * Connection connection = bancoConexao.getConexao();
	 * 
	 * PreparedStatement ps = connection.prepareStatement(sql);
	 * 
	 * ps = connection.prepareStatement(sql);
	 * 
	 * ps.setInt(1, id);
	 * 
	 * ps.execute();
	 * 
	 * // confirmaçao
	 * System.out.println("EXCLUSÃO DO BANCO DE DADOS REALIZADA COM SUCESSO!");
	 * 
	 * // Fecha as conexões
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
	 * // Cria uma conexão com o banco bancoConexao.abrirConexao(); Connection
	 * connection = bancoConexao.getConexao();
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
	 * // confirmaçao console
	 * System.out.println("ATUALIZAÇÃO DE DADOS NA TABELA REALIZADO COM SUCESSO");
	 * 
	 * // Fecha as conexões
	 * 
	 * if (ps != null) ps.close();
	 * 
	 * if (connection != null) connection.close();
	 * 
	 * }
	 * 
	 * ///////////////////// READ public void obter() throws Exception {
	 * 
	 * // Cria uma conexão com o banco bancoConexao.abrirConexao(); Connection
	 * connection = bancoConexao.getConexao();
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
	 * // etc. }
	 * 
	 * }
	 * 
	 */

}
