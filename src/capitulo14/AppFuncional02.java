package capitulo14;

public class AppFuncional02 {
	public static void main(String[] args) {
		Funcional01 f01 = () -> System.out.println("Usando Interface Funcional");
		Funcional02 f02 = (x) -> System.out.println("Usando Uma Interface Funcional Com Parametro:\n"+x);
		Funcional03 f03 = (x, y) -> x * y;
		
		f01.execute();
		f02.execute("Hugo Ângelo");
		System.out.println(f03.execute(3.0, 4.0));
	}
}
