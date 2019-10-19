package capitulo06.laboratorio;

public class Calculadora {

	public int subtrair(int minuendo, int subtraendo) {
		int resto = minuendo - subtraendo;
		return resto;
	}
	
	public double subtrair(double minuendo, double subtraendo) {
		double resto;
		resto = minuendo - subtraendo;
		return resto;
	}
	
	public double subtrair(int minuendo, double subtraendo) {
		double resto;
		resto = minuendo - subtraendo;
		return resto;
	}
	
	public double subtrair(double minuendo, int subtraendo) {
		double resto;
		resto = minuendo - subtraendo;
		return resto;
	}

	public int dividir(int dividendo, int divisor) {
		int resto = 0;
		if (divisor == 0) {
			System.out.println("Não pode dividir por 0!");
		} else {
			resto = dividendo / divisor;
		}
		return resto;
	}

	public int multiplicar(int multiplicando, int multiplicador) {
		int produto = multiplicador * multiplicando;
		return produto;
	}

	public int somar(int valor1, int valor2) {
		int resultado;
		resultado = valor1 + valor2;
		return resultado;
	}
}
