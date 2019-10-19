package capitulo16;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class CriarArquivoPattern {
	public static void main(String[] args) {

		String texto = "Trabalhando com I/O de maneira efetivel";
		try {
			OutputStream os = new FileOutputStream("arquivoPattern.txt0");
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write(texto);
			bw.close();
			System.out.println("Arquivo criado com sucesso!!");
		} catch (IOException e) {
		System.out.println("Erro: " + e.getMessage());
		}
	}
}
		

	

