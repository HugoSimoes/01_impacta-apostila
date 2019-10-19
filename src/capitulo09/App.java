package capitulo09;

public class App {

	public static void main(String[] args) {
		//Funcionario f = new Funcionario();
		Programador p  = new Programador("Hugo", 1520921, "Java", "Windows");
		
		System.out.println(p.getLinguagem());
		System.out.println(p.getMatricula());
		System.out.println(p.getNome());
		System.out.println(p.getSo());
	}

}
