package capitulo09;

public class Programador extends Funcionario {
	private String linguagem;
	private String so;

	/*
	 * public Programador() { super(); }
	 */
	public Programador(String nome, long matricula, String linguagem, String so) {
		super(nome, matricula);
		this.linguagem = linguagem;
		this.so = so;
	}

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}

	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}

}
