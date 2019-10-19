package capitulo10.laboratorio;

public class Cap10_Lab1 {
	public static void main(String[] args) {
		Imprimivel relatorio;
		Imprimivel grafico;
		
		relatorio = new Relatorio();
		
		grafico = new Grafico();
		
		relatorio.imprimir();
		grafico.imprimir();
	}
}
