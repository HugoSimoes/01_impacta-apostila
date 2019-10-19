package capitulo14;

public class Operacao implements Funcional04{

	@Override
	public double execute(int val01, int val02) {
		double result = (val01 + val02) / (val02 - val01);
		return result;
	}
	
}
