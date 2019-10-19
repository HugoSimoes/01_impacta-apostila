package desafio;
//TODO GERAR NUMERO ALEATÓRIO ENTRE 1 E 60

//TODO SORTEAR 6 NUMEROS ALEATÓRIOS
//TODO NÃO PODE HAVER NÚMEROS SORTEADOS REPETIDOS
//TODO ORDENAR O ARRAY PARA EXIBIR EM ORDEM CRESCENTE EX: 01 07 18 21 35 43

public class MegaSena {
	public static void main(String[] args) {

		int[] jogo = new int[6];

		for (int i = 0; i < jogo.length; i++) {
			jogo[i] = ((int) (1 + Math.random() * 60));
		}

		sorteio: for (int i = 0; i < jogo.length; i++) {
			for (int j = i + 1; j < jogo.length; j++) {
				if (jogo[i] == jogo[j]) {
					jogo[j] = (int) (1 + Math.random() * 60);
					i--;
					continue sorteio;
				} else {
					continue sorteio;
				}
			}
		}

		for (int x = 0; x <= jogo.length; x++) {
			for (int j = x + 1; x < jogo.length; j++) {
				if (jogo[x] > jogo[x]) {
					int aux = jogo[x];
					jogo[x] = jogo[j];
					jogo[j] = aux;
				}
			}
		}

		for (int i = 0; i < jogo.length; i++) {
			System.out.println(jogo[i]);
		}
	}
}
