package capitulo13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FuncionarioTest {

	@Test
	void idadeInvalida() {
		Funcionario f = new Funcionario();
		int idade = 10;

		f.setIdade(idade);

		assertTrue(f.getIdade() != idade);
	}
	
	@Test
	void idadeValida() {
		Funcionario f = new Funcionario();
		int idade = 16;
		f.setIdade(idade);
		
		assertTrue(f.getIdade() == idade);
	}

}
