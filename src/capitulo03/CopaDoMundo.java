package capitulo03;

import java.util.Calendar;

public class CopaDoMundo {
	public static void main(String[] args) {

		for (int ano = 1930; ano <= Calendar.getInstance().get(Calendar.YEAR); ano += 4) {
			if (ano == 1942 || ano == 1946) {
				System.out.println("Não houve copa do mundo neste ano de " + ano);
				continue;
			} else {
				System.out.println("Copa do mundo de " + ano);

			}
		}
	}
}
