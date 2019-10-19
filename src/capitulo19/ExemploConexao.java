package capitulo19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale;

public class ExemploConexao {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
			try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"
					+ "cadalunos?useTimezone=true&serverTimezone=America/Sao_Paulo", "root",
					"123456");
			System.out.println("Connexão estabelecida com sucesso");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
