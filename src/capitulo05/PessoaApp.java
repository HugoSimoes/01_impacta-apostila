package capitulo05;

public class PessoaApp {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		p1.nome = "Julio";
		p1.idade = 50;
		p1.endereco = "Alameda Santos, 589";
		p1.telefone = "(11) 9 4767-767";
		
		p2.nome = "Hugo";
		p2.idade = 32;
		p2.endereco = "Av Dr. Bernardino B F de Carvalho, 1661";
		p2.telefone = "(11) 9 8878-0000";
		
		System.out.println(p1);
		System.out.println(p2);
		
		p1 = p2;
		
		System.out.println(p1);
		System.out.println(p2);
		
		p1.nome = "Julio";
		p1.telefone = "(11) 9 9221-5543";
		
		System.out.println(p1);
		System.out.println(p2);
	}
}
