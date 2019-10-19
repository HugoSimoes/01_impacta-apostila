package capitulo07.laboratorio7;

public class Lab01 {
	public static void main(String[] args) {
		Cadastro c1 = new Cadastro();
		Cadastro c2 = new Cadastro("Hugo", "Ângelo");
		Cadastro c3 = new Cadastro("Hugo", "Ângelo", 32);
		
		c1.mostrar();
		c2.mostrar();
		c3.mostrar();
	}
}
