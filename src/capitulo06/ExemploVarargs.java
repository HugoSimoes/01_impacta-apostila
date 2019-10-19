package capitulo06;

public class ExemploVarargs {
	public int somarValores(int[] valores) {
		int soma = 0;
		for (int valor : valores) {
			soma += valor;
		}
		return soma;
	}
	
	public int somar(int ... valores) {
		int soma = 0;
		for(int valor : valores) {
			soma += valor;
		}
		return soma;
	}
}
