package capitulo16;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CriarArquivo {
	public static void main(String[] args) {

		String texto = "Estamos aprendendo a trabalhar com I/O.";
		try {
			FileOutputStream arquivo = new FileOutputStream("arquivo.txt");
			DataOutputStream conteudo = new DataOutputStream(arquivo);
			conteudo.writeChars(texto);
			conteudo.close();
			System.out.println("Arquivo gerado com sucesso!!");
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
