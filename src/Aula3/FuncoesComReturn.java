package Aula3;

import java.util.Scanner;

public class FuncoesComReturn {
	
	public static int soma(int a, int b) {
		//System.out.println((a+b));
		return a + b;
	}
	
	public static double media(int a, int b) {
		return soma(v1+v2)/2;
	}

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		int v1,v2;
		System.out.println("Dois valores");
		v1=leitor.nextInt();
		v2=leitor.nextInt();
		System.out.println(soma(v1,v2));
		leitor.close();

	}

}
