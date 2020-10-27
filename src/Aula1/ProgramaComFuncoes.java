package Aula1;

import java.util.Scanner;

public class ProgramaComFuncoes {

	public static void soma() {
		int a, b, soma;
		Scanner leitor = new Scanner (System.in);
		System.out.println("Digite o primeiro valor");
		a=leitor.nextInt();
		System.out.println("Digite o segundo valor");
		b=leitor.nextInt();
		soma = a+b;
		System.out.println("A soma é: " + soma);
		
	}
	
	public static void subtracao() {
		int a, b, subtracao;
		Scanner leitor = new Scanner (System.in);
		System.out.println("Digite o primeiro valor");
		a=leitor.nextInt();
		System.out.println("Digite o segundo valor");
		b=leitor.nextInt();
		subtracao = a-b;
		System.out.println("A subtração é: " + subtracao);
		
	}
	
	public static void multiplicacao() {
		int a, b, multi;
		Scanner leitor = new Scanner (System.in);
		System.out.println("Digite o primeiro valor");
		a=leitor.nextInt();
		System.out.println("Digite o segundo valor");
		b=leitor.nextInt();
		multi = a*b;
		System.out.println("A multiplicação é: " + multi);
	}
	
	public static void divisao() {
		int a, b, divisao;
		Scanner leitor = new Scanner (System.in);
		System.out.println("Digite o primeiro valor");
		a=leitor.nextInt();
		System.out.println("Digite o segundo valor");
		b=leitor.nextInt();
		divisao = a*b;
		System.out.println("A multiplicação é: " + divisao);
	}
	
	
	
	public static void main(String[] args) {

		soma();
		subtracao();
		multiplicacao();
		divisao();
	}

}
