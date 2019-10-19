package capitulo05.carro;

import java.util.Locale;

public class Garagem {
	Carro carroPasseio;
	Carro carroUtilitario;

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Garagem g = new Garagem();
		g.carroPasseio = new Carro();
		g.carroUtilitario = new Carro();

		g.carroPasseio.cor = "Vermelho";
		g.carroPasseio.modelo = "VW Jetta";
		g.carroPasseio.potenciaMotor = 2.0;

		g.carroUtilitario.cor = "Branco";
		g.carroUtilitario.modelo = "Renault Boxer";
		g.carroUtilitario.potenciaMotor = 3.8;

		System.out.println("Carro Passeio: \n" + g.carroPasseio);
		System.out.println("Carro Utilitário: \n" + g.carroUtilitario);

	}

}
