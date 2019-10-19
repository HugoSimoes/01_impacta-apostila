package desafio;

import java.util.Set;
import java.util.TreeSet;

public class MegaSena02 {
public static void main(String[] args) {
	Set<Integer> jogo = new TreeSet<>();
	while(jogo.size() < 6) {
		jogo.add((int) (1 + Math.random() * 60));
	}
	jogo.forEach(num -> System.out.printf("%02d ", num));
}
}
