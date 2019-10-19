package capitulo06;

public class MetodoApp {
	public static void main(String[] args) {
		ExemploMetodo01 obj = new ExemploMetodo01();
		
		obj.meuMetodo();
		
		int numero = obj.meuMetodo02();
		System.out.println(numero);
		
		int num = obj.meuMetodo03(10, 15);
		System.out.println(num);
	}
}
