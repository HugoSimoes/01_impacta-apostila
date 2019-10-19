package capitulo14;

public class ReferenciaApp {
	public static void main(String[] args) {
		OperacaoAritimetica soma = (value1, value2) -> value1 + value2;
		System.out.println(soma.execute(10, 20));
		
		OperacaoAritimetica calculaJuros = FinancialUtils::calculaJuros;
		
		System.out.println(calculaJuros.execute(1000, 10));
	}
}
