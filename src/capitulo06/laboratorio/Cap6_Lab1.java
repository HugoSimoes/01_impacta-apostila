package capitulo06.laboratorio;

import java.util.Scanner;

public class Cap6_Lab1{
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor que deseja somar: \n");
		int soma = calc.somar(sc.nextInt(), sc.nextInt());
		System.out.println("Soma "+soma);
		
		
		System.out.println("Digite o valor que deseja Subtrair:\n");
		int resto = calc.subtrair(sc.nextInt(), sc.nextInt());
		System.out.println("Resto: "+resto);
		
		sc.close();
	}
}
 