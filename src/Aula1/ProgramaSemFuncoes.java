package Aula1;

import java.util.Scanner;

public class ProgramaSemFuncoes {

	public static void main(String[] args) {
		int a, b, soma, sub;
		Scanner leitor = new Scanner (System.in);

		System.out.println("Digite o primeiro valor");
		a=leitor.nextInt();
		System.out.println("Digite o segundo valor");
		b=leitor.nextInt();
		
		soma = a+b;
		sub = a-b;
		
		System.out.println("A soma é: " + soma);
		System.out.println("A subtração é: " + sub);
	}

}
