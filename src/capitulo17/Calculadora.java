package capitulo17;

public class Calculadora {
	private int soma;
	
	
	public int somaArray(int[] array) {
		soma = 0;
		for (int i = 0; i < array.length; i++) {
			soma += array[i];
			System.out.printf("Executando a soma %s somando %d como total %d%b", Thread.currentThread().getName(), array[i], soma);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			
			}
	
		}
		return 0;
	}
	
	
}
