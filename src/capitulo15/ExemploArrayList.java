package capitulo15;

import java.util.ArrayList;

public class ExemploArrayList {
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		
		lista.add("Laranja");
		lista.add("Azul");
		lista.add("Amarelo");
		lista.add("Roxo");
		lista.add("Vermelho");

		System.out.println(lista.size());
		System.out.println("Primeiro item da Lista: " + lista.get(0));
		System.out.println("Ultimo item da lista: " + lista.get(lista.size() - 1));
		
		System.out.println("\nUSANDO A ESTRUTURA FOR TRADICIONAL");
		//USANDO O FOR TRADICIONAL
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("\nUSANDO ESTRUTURA FOREACH");
		//USANDO O FOREACH
		for (String item : lista) {
			System.out.println(item);
		}
		
		lista.remove(3);
		lista.remove("Amarelo");
		
		System.out.println("\\nUSANDO O METODO FOREACH COM PROGRAMAÇÃO FUNCIONAL");
		//USANDO O METODO FOREACH COM PROGRAMAÇÃO FUNCIONAL
		lista.forEach((item) -> System.out.println(item));
	}
}
