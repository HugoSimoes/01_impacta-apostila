package capitulo16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ManipularArquivo {
	public static void main(String[] args) {
		 try {

	            Path arquivo = Paths.get("C:\\Users\\hgo_6\\Pictures\\shopping.jpg");
	            Path novaPasta = Paths.get("C:\\Users\\\\hgo_6\\Pictures\\Hugo");
	            Path pasta = Paths.get("C:\\Users\\hgo_6\\Pictures");
	            
	            if (!Files.exists(arquivo)) {
	                System.out.println("O item não existe.");
	            } else if (Files.isDirectory(arquivo)) {
	                System.out.println("O item é um diretório.");
	            } else if (Files.isRegularFile(arquivo)) {
	                System.out.println("O item é um arquivo.");
	            }

	            /* Exibe  */
	            System.out.println(Files.size(arquivo));

	            /* Cria o diretório rascunhos. */
	            Files.createDirectories(novaPasta);

	            /* Exibe o conteúdo do diretório Mp3 */
	            Files.list(pasta).forEach(f -> System.out.println(f.getFileName()));

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
		
		
	}
}
