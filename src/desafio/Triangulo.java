package desafio;

/*
 * Triangulo 5 x 9
*/
public class Triangulo {
	public static void main(String[] args) {
		String[][] triangulo = new String[5][9];
		
		System.out.println("\nTriangulo (6 x 9");
		int meio = triangulo[0].length / 2;
		meio += triangulo[0].length % 2 == 0 ? 1 : 0;
		
		for(int linha = 0; linha < triangulo.length; linha++) {
			for(int coluna = 0; coluna < triangulo[linha].length; coluna++) {
				if(coluna >= (meio - linha) && coluna <= (meio + linha)) {
					triangulo[linha][coluna] = "*";
				} else {
					triangulo[linha][coluna] = " ";
				}
				System.out.printf("%s ", triangulo[linha][coluna]);
			}
			System.out.println();
		}
	}
}
