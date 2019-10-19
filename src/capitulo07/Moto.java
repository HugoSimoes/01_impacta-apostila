package capitulo07;

public class Moto {
	private String modelo;
	
	public Moto() {
		super();
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Moto [modelo=" + modelo + "]";
	}

}
