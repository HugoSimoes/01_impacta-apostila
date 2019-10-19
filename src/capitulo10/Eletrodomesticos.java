package capitulo10;

public interface Eletrodomesticos {
	void ligar();

	void desligar();

	default void descongelar() {
		System.out.println("Descongelando...");
	}

	default void imprimirMensagem() {
	
	}
	
	
	static void ligarTudo(Eletrodomestico... eletros) {
		for (Eletrodomestico e : eletros) {
			e.ligar();
		}
	}
}
