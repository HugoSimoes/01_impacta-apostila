package capitulo10;

public class Geladeira implements Eletrodomestico{

	@Override
	public void ligar() {
		System.out.println("Geladeira ligando...");
	}

	@Override
	public void desligar() {
		System.out.println("Geladeira desligando...");
	}
	
	public void descongelar() {
		System.out.println("Geladeira entrando no modo fost free...");
	}

	/*
	 * @Override public void mensagem() { // TODO Auto-generated method stub
	 * 
	 * }
	 */

	
	
}
