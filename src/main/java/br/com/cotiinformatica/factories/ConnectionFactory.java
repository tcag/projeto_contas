package br.com.cotiinformatica.factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	// atributospara conexão com o banco de dados

	private static final String DRIVER = "org.postgresql.Driver";

	private static final String URL = "jdbc:postgresql://localhost:5432/bd_projeto_contas_2";

	private static final String USER = "postgres";

	private static final String PASSWORD = "coti";

	// método para abrir e retornar uma conexão // com o banco de dados

	public static Connection getConnection() throws Exception {
		Class.forName(DRIVER);
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}

}
