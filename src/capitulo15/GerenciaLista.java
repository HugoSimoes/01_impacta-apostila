package capitulo15;

import java.util.ArrayList;
import java.util.List;

public class GerenciaLista {
	public static void exibirLista(List<String> lista) {
		lista.forEach((item) -> System.out.println(item));
	}

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add("Hugo");
		nomes.add("Ângelo");
		nomes.add("Jessica");
		nomes.add("Joyce");
		nomes.add("Sophia");
		
		GerenciaLista.exibirLista(nomes);
		
	}
}
