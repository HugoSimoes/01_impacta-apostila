package capitulo09.laboratorio01;

public class Professor extends Pessoa {

	private float salario;
	private String disciplina;

	public Professor(String nome, int idade, char sexo, int numeroRg, String dataNasc, float salario, String curso) {
		super(nome, idade, sexo, new Rg(numeroRg, dataNasc));
		this.salario = salario;
		this.disciplina = curso;

	}

	@Override
	public void falar(String fala) {
	System.out.printf("%s: %s\n: ", getNome(), fala);
	}

	@Override
	public void mostrarDados() {
		System.out.printf("--- Professor:  %s ---\n"
				+ "Idade: %d\n"
				+ "Sexo: %s\n"
				+ "Salário: %.2f\n"
				+ "Disciplina: %s\n"
				+ "Número RG: %d\n"
				+ "Data Nascimento: %s", getNome(), getIdade(), getSexo(), getSalario(),
				getDisciplina(), getRg().getNumero(), getRg().getDataNasc());
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

}
