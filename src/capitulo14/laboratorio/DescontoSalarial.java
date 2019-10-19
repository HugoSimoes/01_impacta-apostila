package capitulo14.laboratorio;

import java.util.Locale;

public class DescontoSalarial {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double[] salariosBrutos = {1350.00, 4320.00, 8235.25, 2500.55, 1830.00, 850.26, 
										3614.29, 12500.00};
		
		double[] salariosLiquidos;
		
	salariosLiquidos = 	DoubleArrayUtils.transformaValores(salariosBrutos, 
											(salario) -> salario - salario * 0.1);
	
		for (double salario : salariosLiquidos) {
			System.out.printf("%.2f", salario);
		}
	}
}
