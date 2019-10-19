package capitulo19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUD {
	private static final String URL = "jdbc:mysql://localhost:3306/cadastroalunos";
	private static final String USER = "root";
	private static final String PASS = "";
	
	private static Connection conn;
	private static Statement stmt;
	private static PreparedStatement pstmt;
	private static ResultSet rs;
	
	
	public static void main(String[] args) {
		abrirBD();
		inserirRegistro();
		inserirRegistro("Renato", "renato@gmail.com", 188.9);
		listarRegistros();
		atualizarRegistros();
		excluirRegistros();
		fecharBD();
	}
	
	private static void excluirRegistros() {
		String query = "DELETE FROM aluno WHERE idaluno = 2";
		try {
			stmt = conn.createStatement();
			stmt.execute(query);
		} catch (SQLException e) {
			System.out.println("Problemas ao excluir registros");
			e.printStackTrace();
		}
		
	}
	
	private static void atualizarRegistros() {
		String query = "UPDATE aluno SET nome = 'Vinicius', email = 'vini@gmail.com', mensalidade = 1886.89 WHERE idaluno = 1";
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(query);
			System.out.println("Registro atualizado com sucesso!");
		} catch (SQLException e) {
			System.out.println("Problemas ao atualizar o registro!");
			e.printStackTrace();
		}
		
	}
	
	private static void listarRegistros() {
		String query = "SELECT * FROM aluno";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.printf("%d %s %s %.2f\n", 
						rs.getInt("idaluno"), rs.getString("Nome"), rs.getString("email"), rs.getDouble("mensalidade"));
			}
		} catch (SQLException e) {
			System.out.println("Problemas ao listar registros!");
			e.printStackTrace();
		}
		
	}
	
	private static void inserirRegistro(String nome, String email, double mensalidade) {
		try {
			String query = "INSERT INTO aluno (Nome, email, mensalidade) VALUES (?,?,?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, nome);
			pstmt.setString(2, email);
			pstmt.setDouble(3, mensalidade);
			pstmt.execute();
			System.out.println("Registro inserido com sucesso!");
		} catch (Exception e) {
			System.out.println("Problemas ao inserir registro!");
			e.printStackTrace();
		}
	}
	
	private static void inserirRegistro() {
		try {
			String query = "INSERT INTO aluno (Nome, email, mensalidade) VALUES ('Diego', 'teste@teste.com', 123.8)";
			stmt = conn.createStatement();
			stmt.execute(query);
			
			System.out.println("Registro inserido com sucesso!");
		} catch (SQLException e) {
			System.out.println("Problemas ao inserir o registro!");
			e.printStackTrace();
		}
	}
	
	private static void abrirBD() {
		try {
			conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Conectado com sucesso!");
		} catch (SQLException e) {
			System.out.println("Problemas ao conectar com o base de dados!");
			e.printStackTrace();
		}
	}
	
	private static void fecharBD() {
		try {
			conn.close();
			System.out.println("Conexão fechada com sucesso!");
		} catch (SQLException e) {
			System.out.println("Problemas ao fechar a conexão!");
			e.printStackTrace();
		}
	}
}
