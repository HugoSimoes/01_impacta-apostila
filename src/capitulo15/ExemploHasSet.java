package capitulo15;

import java.util.HashSet;

public class ExemploHasSet {
	public static void main(String[] args) {
		HashSet<String> nomes = new HashSet<>();
		
		nomes.add("Hugo");
		nomes.add("Ângelo");
		nomes.add("Jessica");
		nomes.add("Joyce");
		nomes.add("Sophia");
		
		System.out.println(nomes);
		nomes.forEach((item) -> System.out.println(item));
	}
}
