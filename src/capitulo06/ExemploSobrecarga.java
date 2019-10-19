package capitulo06;

public class ExemploSobrecarga {
	public void teste() {
		System.out.println("Não há nada para imprimir");
	}
	
	public void teste(String text) {
		System.out.println("Imprimindo "+text);
	}
	
	public void teste(double number) {
		System.out.println("Imprimindo "+number);
	}
	
	public void teste(String t, double n) {
		System.out.println("Imprimdo "+t+" e "+n);
	}
}
