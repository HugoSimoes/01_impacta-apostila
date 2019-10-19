package capitulo05.carro;

public class Carro {
	String modelo;
	double potenciaMotor;
	String cor;
	
	
	@Override
	public String toString() {
		return String.format("Cor: %s\nModelo: %s\nPotência: %.1f\n", 
				this.cor, this.modelo, this.potenciaMotor);
	}
}

