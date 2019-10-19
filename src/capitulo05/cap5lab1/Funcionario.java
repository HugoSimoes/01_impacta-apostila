package capitulo05.cap5lab1;

public class Funcionario {
	String nome;
	String sobrenome;
	String cargo;
	double salario;
	
	@Override
	public String toString() {
		return String.format("Nome: %s\nSobrenome: %s\nCargo: %s\nSalario: %.2f", 
				this.nome, this.sobrenome, this.cargo, this.salario);
	}
}
