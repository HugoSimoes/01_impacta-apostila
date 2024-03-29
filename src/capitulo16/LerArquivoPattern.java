package capitulo16;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LerArquivoPattern {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("arquivoPattern.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String linha = br.readLine();
			while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
			}
			br.close();
		} catch(IOException e) {
			System.out.println("Erro: "+ e.getMessage());
		}
	}
}
