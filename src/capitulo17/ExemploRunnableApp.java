package capitulo17;

public class ExemploRunnableApp implements Runnable {
	public static void main(String[] args) {

	}

	@Override
	public void run() {
		for (int i = 0; i < 15; i++) {
			System.out.println("Runnable rodando - " + 1);
		}
	}
}
