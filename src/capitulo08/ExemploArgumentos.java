package capitulo08;

public class ExemploArgumentos {
	public static void main(String[] args) {
		if (args.length > 0) {
			if (args[0].equals("DEBUG")) {
				System.out.println("INICIANDO O PROGRAMA EM MODO DEBUG\n...");
			} else if (args[0].equals("DEV")) {
				System.out.println("INICIANDO O PROGRAMA EM MODO DEV\n...");
			} else if (args[0].equals("PROD")) {
				System.out.println("INICIANDO O PROGRAMA EM MODO PROD\n...");
			} else {
				System.out.println("Foi informado um argumento inválido");
			}
		} else {
			System.out.println("Não foram inseridos argumentos para o programa!!");
		}
	}
}
