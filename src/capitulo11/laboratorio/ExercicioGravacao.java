package capitulo11.laboratorio;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExercicioGravacao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a Frase desejada: ");
		String texto = sc.nextLine();

		PrintWriter writer = null;
		try {
			writer = new PrintWriter("C:\\Users\\hgo_6\\Desktop\\doc1.txt");
			writer.println(texto);
			System.out.println("Arquivo gravado com sucesso!!!");
		} catch (IOException e) {
			System.out.println("Falha ao gravar as informações digitadas\nErro: " + e.getMessage());
		} finally {
			writer.close();
			sc.close();
		}

	}
}
