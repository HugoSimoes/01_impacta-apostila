package desafio;

public class Cap08_Lab02 {
	public static void main(String[] args) {
		if (args.length > 0) {
			int soma = 0;
			String numTexto = "";

			for (int i = 0; i < args.length; i++) {
				soma += Integer.parseInt(args[i]);
				numTexto += args[i] + " ";
			}

			double media = soma / args.length;
			System.out.printf("A média das idades:\n" + "%s\n" + "é de: %s anos", numTexto, media);
		}
	}
}
