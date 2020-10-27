package Aula2;

import java.util.Scanner;

public class ProgramaComFuncoes2 {
	
	

	public static void lerValores() {
		int a,b;
		Scanner leitor = new Scanner (System.in);
		System.out.println("Digite o primeiro valor");
		a=leitor.nextInt();
		System.out.println("Digite o segundo valor");
		b=leitor.nextInt();
		
		soma(a,b);
		subtracao(a,b);
		multiplicacao(a,b);
		divisao(a,b);
	}
	public static void soma(int valor1, int valor2) {
		int soma;
		soma = valor1 + valor2;
		System.out.println("A soma é: " + soma);
		
	}
	
	public static void subtracao(int valor1, int valor2) {
		int subtracao;
		subtracao = valor1 - valor2;
		System.out.println("A subtração é: " + subtracao);
		
	}
	
	public static void multiplicacao(int valor1, int valor2) {
		int multi;
		multi = valor1*valor2;
		System.out.println("A multiplicação é: " + multi);
	}
	
	public static void divisao(int valor1,int valor2) {
		double divisao;
		divisao = valor1 / valor2;
		System.out.println("A multiplicação é: " + divisao);
	}
	
	
	
	public static void main(String[] args) {

		lerValores();
		
	}

}
