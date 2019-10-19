package capitulo05;

public class CachorroApp {
	public static void main(String[] args) {
		
		Cachorro lili = new Cachorro();
		
		lili.nome = "Lili";
		lili.raca = "Salsicha Viralata";
		lili.porte = "Pequeno";
		lili.sexo = 'F';
		lili.idade = 2;
		
		Cachorro buck = new Cachorro();
		buck.nome = "Buck";
		buck.raca = "Pug";
		buck.porte = "Pequeno";
		buck.sexo = 'M';
		buck.idade = 4;
		
		System.out.println(lili);
		System.out.println(buck);
		
	}
}
