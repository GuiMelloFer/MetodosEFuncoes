package TirandoDuvidas;

import java.util.Scanner;

public class Exercicio1Forma2 {

	
	public static void perimetro(int base, int altura) {
		System.out.println("O perímetro é: " + 2*(base+altura));
	}
	
	public static void area(int base, int altura) {
		System.out.println("A área é: " + base*altura);
	}
	
	public static void diagonal(int base, int altura) {
		System.out.println("A valor da diagonal é: " + Math.sqrt(base*base + altura*altura));
	}
	

	public static void main(String[] args) {
		// SEM return e COM argumentos
		int base;
		int altura;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a base e a altura: ");
		base=leitor.nextInt();
		altura=leitor.nextInt();
		
		perimetro(base,altura);
		area(base,altura);
		diagonal(base,altura);
		

	}

}
