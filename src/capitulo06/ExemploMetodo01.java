package capitulo06;

public class ExemploMetodo01 {
	void meuMetodo() {
		int x = 10;
		int y = 15;
		int resultado = x + y;
		System.out.println("Calculo realizado com sucesso! "+resultado);
	}
	
	public int meuMetodo02() {
		int x = 10;
		int y = 15;
		int resultado = x + y;
		
		return resultado;
	}
	
	public int meuMetodo03(int valor1, int valor2) {
		int resultado;
		resultado = valor1 + valor2;
		return resultado;
	}
}
