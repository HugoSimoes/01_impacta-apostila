package capitulo13;

public class TesteFuncionario {
	public static void main(String[] args) {
		testeSetIdadeInvalida();
		testeIdadeValida();
	}

	public static void testeSetIdadeInvalida() {
		Funcionario f = new Funcionario();
		int idade = 15;

		f.setIdade(idade);

		if (f.getIdade() != idade) {
			System.out.println("testeSetIdadeInvalida: PASSOU");
		} else {
			System.out.println("testeSetIdadeInvalida: FALHOU");
		}
	}

	public static void testeIdadeValida() {
		Funcionario f = new Funcionario();
		int idade = 16;
		f.setIdade(idade);
		if (f.getIdade() == idade) {
			System.out.println("testeSetIdadeValida : PASSOU");
		} else {
			System.out.println("testeSetIdadeValida : FALHOU ");
		}
	}
}
