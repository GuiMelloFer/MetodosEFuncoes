package TirandoDuvidas;

import java.util.Scanner;

public class Exercicio1Forma4 {

	
	public static String perimetro(int base, int altura) {
		return "O per�metro �: " + 2*(base+altura);
	}
	
	public static String area(int base, int altura) {
		return "A �rea �: " + base*altura;
	}
	
	public static String diagonal(int base, int altura) {
		return "A valor da diagonal �: " + Math.sqrt(base*base + altura*altura);
	}
	

	public static void main(String[] args) {
		// COM return e COM argumentos
		int base;
		int altura;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a base e a altura: ");
		base=leitor.nextInt();
		altura=leitor.nextInt();
		
		System.out.println(perimetro(base,altura));
		System.out.println(area(base,altura));
		System.out.println(diagonal(base,altura));
		

	}

}
