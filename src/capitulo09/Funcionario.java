package capitulo09;

public class Funcionario {
	private String nome;
	private long matricula;
	
	/*
	 * public Funcionario() { super(); }
	 */
	
	public Funcionario(String nome, long matricula) {
		super();
		setNome(nome);
		setMatricula(matricula);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

}
