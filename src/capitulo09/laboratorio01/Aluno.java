package capitulo09.laboratorio01;


public class Aluno extends Pessoa{
	private float mensalidade;
	private String curso;
	
	public Aluno(String nome, int idade, char sexo, int numeroRg, 
			String dataNasc, float mensalidade, String curso) {
		super(nome, idade, sexo, new Rg(numeroRg, dataNasc));
		this.mensalidade = mensalidade;
		this.curso = curso;
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
				+ "Mensalidade: %s\n"
				+ "Curso: %s\n"
				+ "Número RG: %d\n"
				+ "Data Nascimento: %s", getNome(), getIdade(), getSexo(), getMensalidade(),
				getCurso(), getRg().getNumero(), getRg().getDataNasc());
		
	}

	public float getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}



}
