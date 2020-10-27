package TirandoDuvidas;

import java.util.Scanner;

public class Exercicio1Forma3 {
	public static int base;
	public static int altura;
	
	public static String perimetro() {
		return "O perímetro é: " + 2*(base+altura);
	}
	
	public static String area() {
		return "A área é: " + base*altura;
	}
	
	public static String diagonal() {
		return "A valor da diagonal é: " + Math.sqrt(base*base + altura*altura);
	}
	

	public static void main(String[] args) {
		// COM return e SEM argumentos
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a base e a altura: ");
		base=leitor.nextInt();
		altura=leitor.nextInt();
		
		System.out.println(perimetro());
		System.out.println(area());
		System.out.println(diagonal());
		

	}

}
