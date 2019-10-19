package capitulo10;

public class App {
	public static void main(String[] args) {
		Eletrodomestico aparelho;
		
		aparelho = new Geladeira();
		aparelho.ligar();
		
		aparelho = new Televisao();
		aparelho.ligar();
		
		aparelho = new Microondas();
		aparelho.ligar();
		
		System.out.println("\n-------------------------------------------------\n");
		
		Geladeira g1 = new Geladeira();
		Televisao t1 = new Televisao();
		Microondas m1 = new Microondas();
		Geladeira g2 = new Geladeira();
		Televisao t2 = new Televisao();
		Microondas m2 = new Microondas();
		
		
		
		
	}
}
