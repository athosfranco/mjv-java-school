package atracao.repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class FabricaConexao {
	private static Connection conexao;

	public static void abrirConexao() throws Exception {
		if (conexao == null) {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5433/mjv_school_db";
			String user = "postgres";
			String senha = "postgres098234";

			conexao = DriverManager.getConnection(url, user, senha);

			System.out.println("Conexão realizada");

		}
	}

	public static Connection getConexao() {
		return conexao;
	}

}
