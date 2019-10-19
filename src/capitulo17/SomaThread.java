package capitulo17;

import javax.xml.stream.events.StartDocument;

public class SomaThread implements Runnable{
	
	private String nome;
	private int[] numeros;
	private static Calculadora calc = new Calculadora();	
	
	public SomaThread(String nome, int [] numeros) {
		this.nome = nome;
		this.numeros = numeros;
		//new Tread((this, nome).Start());
	}

	@Override
	public void run() {
		System.out.println("Entrou na Thread");
	}

}
