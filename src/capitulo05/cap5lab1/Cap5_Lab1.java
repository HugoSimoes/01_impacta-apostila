package capitulo05.cap5lab1;

import java.util.Locale;

public class Cap5_Lab1 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Funcionario f = new Funcionario();
		
		f.nome = "Hugo";
		f.sobrenome = "Simões";
		f.cargo = "Oficial de Manutenção Industrial (Mecânica)";
		f.salario = 5800.850;
		
		System.out.println(f);
	}
}
