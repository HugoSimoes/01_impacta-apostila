package capitulo14;

public class OperacaoApp {
	public static void main(String[] args) {

		Operacao op = new Operacao();

		System.out.println(op.execute(20, 10));

		Funcional04 f01 = new Funcional04() {

			@Override
			public double execute(int val01, int val02) {
				double result = (val01 + val02) / (val02 - val01);
				return result;
			}
		};

		System.out.println(f01.execute(20, 10));

		Funcional04 f02 = (v1, v2) -> (v1 + v2) / (v2 - v1);
		System.out.println(f02.execute(15, 5));

		Funcional04 f04 = (v1, v2) -> {
			double result = (v1 + v2) / (v2 - v1);
			if (result % 2 == 0) {
				return result;
			} else {
				return result + 1;
			}
		};
		
		System.out.println(f04.execute(10, 4));
	}
}
