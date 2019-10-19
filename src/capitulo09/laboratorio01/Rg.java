package capitulo09.laboratorio01;

public class Rg {
	private int numero;
	private String dataNasc;

	public Rg(int numero, String dataNasc) {
		super();
		this.numero = numero;
		this.dataNasc = dataNasc;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

}
