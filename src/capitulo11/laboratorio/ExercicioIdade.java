package capitulo11.laboratorio;

import java.util.Calendar;
import java.util.Scanner;

public class ExercicioIdade {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			try {
				System.out.println("Digite o ano de seu nascimento: ");
				String anoNasc = sc.nextLine();

				int anoNascNumerica = Integer.parseInt(anoNasc);
				System.out.printf("Você tem %d anos", Calendar.getInstance().get(Calendar.YEAR) - anoNascNumerica);

			} finally {
				sc.close();
			}
		} catch (NumberFormatException e) {
			System.out.println("Valor digitado inválido!");
		}

	}
}
