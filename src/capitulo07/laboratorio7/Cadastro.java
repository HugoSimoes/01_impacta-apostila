package capitulo07.laboratorio7;

public class Cadastro {
	private String nome;
	private String sobrenome;
	private int idade;

	public Cadastro() {

	}

	public Cadastro(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public Cadastro(String nome, String sobrenome, int idade) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void mostrar() {
		System.out.printf("Nome: %s\nSobrenome: %s\nIdade: %d\n\n", nome, sobrenome, idade );
	}

}
