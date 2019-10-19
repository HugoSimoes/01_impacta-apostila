package desafio;

public class Cap08_Lab1 {
	public static int maiorNumero(int[] numero) {
		int maior = 0;
		if (numero.length > 0) {

			for (int i = 0; i < numero.length; i++) {
				if (numero[i] > maior) {
					maior = numero[i];
				}
			}

		}
		return maior;
	}

	public static int retornaMaiorNumro(int... numeros) {
		int maior = 0;
		if (numeros.length > 0) {
			maior = numeros[0];

			for (int i = 0; i < numeros.length; i++) {
				maior = numeros[0];
			}

		}
		return maior;
	}
	
}
