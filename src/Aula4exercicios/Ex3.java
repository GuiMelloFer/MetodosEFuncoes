package Aula4exercicios;

import java.util.Scanner;

//Crie um programa com uma fun��o que receba um ano em uma vari�vel inteira, fa�a os testes para verificar se ele � bissexto, e retorne uma String dizendo �O ano informado � bissexto�ou �O ano informado n�o � bissexto).A  main  do seu programa deve  conter  a digita��o do  ano,  a  chamada da  fun��o  e a exibi��o do texto retornado.

public class Ex3 {
	
	public static boolean anoBissexto(int ano) {
		if(ano%4==0 && ano%100!=0 || ano%4==0 && ano%400==0 ) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		int anoDigitado;
		Scanner leitor = new Scanner (System.in) ;
		System.out.println("Digite o ano:");
		anoDigitado = leitor.nextInt();
		
		anoBissexto(anoDigitado);
		if(anoBissexto(anoDigitado)==true) {
			System.out.println("O ano de " + anoDigitado + " � bissexto!!");
		}else if(anoBissexto(anoDigitado)==false) {
			System.out.println("O ano de " + anoDigitado + " n�o � bissexto :(");
		}
		
		leitor.close();
	}

}
