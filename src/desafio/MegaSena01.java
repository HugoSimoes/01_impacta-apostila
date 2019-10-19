package desafio;

import java.util.Arrays;

public class MegaSena01 {
	public static void main(String[] args) {
		Integer[] jogo = { 0, 0, 0, 0, 0, 0 };
		int sorteado, cont = 0;

		sorteio: do {
			sorteado = (int) (1 + Math.random() * 60);
			for (int i = 0; i < jogo.length; i++) {
				if (jogo[i] == 0) {
					jogo[i] = sorteado;
					cont++;
					continue sorteio;
				} else if (jogo[i] == sorteado) {
					continue sorteio;
				}
			}

		} while (cont < 6);

		Arrays.sort(jogo);
		
			System.out.printf("%02d %02d %02d %02d %02d %02d", (Object[]) jogo);
		}
	}

