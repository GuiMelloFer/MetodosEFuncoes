package Aula3;

import java.util.Scanner;

public class ProgramaComFuncoes2 {
	
	//criar as variaveis globalmente pois todos precisam
	public static int a;
	public static int b;

	public static void lerValores() {
		Scanner leitor = new Scanner (System.in);
		System.out.println("Digite o primeiro valor");
		a=leitor.nextInt();
		System.out.println("Digite o segundo valor");
		b=leitor.nextInt();
		System.out.println("A soma � "+ soma(a,b));
		System.out.println("A subtracao � "+ subtracao(a,b));
		System.out.println("A multiplica��o � " + multiplicacao(a,b));
		System.out.println("A divis�o �"+ divisao(a,b));
		
	}
	public static int soma(int a,int b) {
		int soma;
		soma = a+b;
		return soma;
		
	}
	
	public static int subtracao(int a,int b) {
		int subtracao;
		subtracao = a-b;
		return subtracao;
		
	}
	
	public static int multiplicacao(int a,int b) {	
		int multi;
		multi = a*b;
		return multi;
	}
	
	public static double divisao(int a,int b) {
		double divisao;
		divisao = a/b;
		return divisao;
	}
	
	
	
	public static void main(String[] args) {

		lerValores();
		
	}

}
