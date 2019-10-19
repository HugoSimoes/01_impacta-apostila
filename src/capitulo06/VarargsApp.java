package capitulo06;

public class VarargsApp {
	public static void main(String[] args) {
		ExemploVarargs obj = new ExemploVarargs();

		int[] x = { 8, 12, 15, 35, 18 };
		int a = 8, b = 12, c = 15, d = 35, e = 18;
		
		int soma = obj.somarValores(x);
		System.out.println(soma);
		
		int soma2 = obj.somar(a, b, c, d, e);
		System.out.println(soma2);
	}
}
