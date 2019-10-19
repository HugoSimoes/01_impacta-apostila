package capitulo15;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {
	public static void main(String[] args) {
		List<Pessoa> listaPessoas = new ArrayList<>();

		listaPessoas.add(new Pessoa("Hugo", 32, 'M'));
		listaPessoas.add(new Pessoa("Sophia", 32, 'F'));
		listaPessoas.add(new Pessoa("Joyce", 29, 'F'));
		listaPessoas.add(new Pessoa("Jessica", 28, 'F'));
		listaPessoas.add(new Pessoa("Ângelo", 31, 'M'));

		listaPessoas.forEach(System.out::println);
		
		System.out.println("\nUSANDO");

	}
}
