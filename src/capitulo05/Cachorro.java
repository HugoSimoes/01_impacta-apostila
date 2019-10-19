package capitulo05;

public class Cachorro {

	String nome;
	String raca;
	String porte;
	char sexo;
	int idade;
	Pessoa dono;

	@Override
	public String toString() {
		return getClass().getSimpleName() + " - Nome: " + nome + " , Sexo: " + sexo + "" + ", Idade = " + idade;
	}
}
