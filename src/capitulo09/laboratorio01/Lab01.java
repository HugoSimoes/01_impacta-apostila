package capitulo09.laboratorio01;

public class Lab01 {
	public static void main(String[] args) {
		Pessoa rafael = new Professor("Rafael", 38, 'M', 261454789, "05/12/1974", 2500.F, "Portugues");
		Pessoa manuel = new Aluno("Manuel", 19, 'M', 521234567, "15/06/1993", 1099.0F, "Ciência da Computação");
		Pessoa claudia = new Aluno("Claudia", 22, 'F', 415678912, "12/08/1990", 799.0F, "Administração");
		
		rafael.falar("Manuel");
		manuel.falar("Presente");
		rafael.falar("Claudia");
		claudia.falar("Presente");
		
		System.out.println();
		
		rafael.mostrarDados();
		System.out.println();
		manuel.mostrarDados();
		System.out.println();
		claudia.mostrarDados();
		
	}
}
