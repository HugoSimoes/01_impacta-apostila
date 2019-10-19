package capitulo06.laboratorio;

import capitulo06.laboratorio.Aluno;
public class Lab03 {
	public static void main(String[] args) {
		Aluno joao = new Aluno();
		Aluno maria = new Aluno();
		Aluno marcos = new Aluno();
		
		joao.setNome("João");
		Aluno.contadorDeAlunos++;
		joao.imprimeAluno();
		System.out.println(Aluno.contadorDeAlunos);
		
		maria.setNome("Maria");
		Aluno.contadorDeAlunos++;
		marcos.imprimeAluno();
		System.out.println(Aluno.contadorDeAlunos++);
		
	}
	
}
