package capitulo14;

public class AppFuncional01 {
	public static void main(String[] args) {
		Funcional01 msgErro = () -> System.out.println("Oopsss... Deu merda, volta!!!");
		msgErro.execute();
	}
}
