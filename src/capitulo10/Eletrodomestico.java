package capitulo10;

public interface Eletrodomestico {
	void ligar();
	
	void desligar();
	
	default void descongelar() {
		System.out.println("Descongelando..");
	}
	
	default void imprimirMensagem() {
		mensagem();
	}
	
	default void mensagem() {
		System.out.println("Olá esta é a mensagem da interface");
	}
	
	static void ligarTudo(Eletrodomestico ... eletros) {
		for(Eletrodomestico e : eletros) {
			e.ligar();
		}
	}
	
	default void acionarTimer(int minutos) {
		try {
			Thread.sleep(minutos * 60000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		desligar();
	}
}

