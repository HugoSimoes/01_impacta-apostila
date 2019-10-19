package capitulo16;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class LeituraArquivo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FileInputStream arquivo = new FileInputStream("arquivo.txt");
			DataInputStream conteudo = new DataInputStream(arquivo);
			while(arquivo.available() > 0) {
				System.out.print(conteudo.readChar());
			}
			conteudo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		}
}
