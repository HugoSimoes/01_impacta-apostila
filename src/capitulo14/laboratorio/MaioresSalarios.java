package capitulo14.laboratorio;

import java.util.Locale;

public class MaioresSalarios {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double[] salariosBrutos = {1350.00, 4320.00, 8235.25, 2500.55, 1830.00, 850.26, 
										3614.29, 12500.00};
	
		double[] salariosTop;
		
		salariosTop = DoubleArrayUtils.filtraValores(salariosBrutos, (salario) -> salario >= 3000.00);
		

	}
}
