package TirandoDuvidas;

import java.util.Scanner;

public class Exercicio1Forma1 {
	public static int base;
	public static int altura;
	
	public static void perimetro() {
		System.out.println("O perímetro é: " + 2*(base+altura));
	}
	
	public static void area() {
		System.out.println("A área é: " + base*altura);
	}
	
	public static void diagonal() {
		System.out.println("A valor da diagonal é: " + Math.sqrt(base*base + altura*altura));
	}
	

	public static void main(String[] args) {
		// SEM return e SEM argumentos
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a base e a altura: ");
		base=leitor.nextInt();
		altura=leitor.nextInt();
		
		perimetro();
		area();
		diagonal();
		

	}

}
