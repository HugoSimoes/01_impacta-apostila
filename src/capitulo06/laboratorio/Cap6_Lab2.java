package capitulo06.laboratorio;

public class Cap6_Lab2 {
	public static void main(String[] args) {
			Calculadora calc = new Calculadora();
			
			System.out.println("Método Subtrair sobrecarregados");
			System.out.println("Chamando a versão de subtrair"+calc.subtrair(10.0, 9.0));
			System.out.println(calc.subtrair(10.0, 8));
			System.out.println(calc.subtrair(10, 9.0));
			System.out.println(calc.subtrair(10, 9));
	}
}
