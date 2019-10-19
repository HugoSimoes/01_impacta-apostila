package capitulo05;

public class Pessoa {
	String nome;
	String endereco;
	String telefone;
	int idade;
	
	@Override
	public String toString() {
		return String.format("Nome: %s\nEndereco: %s\nTelefone: %s\nIdade: %d\n%s\n", this.nome, 
				this.endereco, this.telefone, this.idade, super.toString());
	}
}
