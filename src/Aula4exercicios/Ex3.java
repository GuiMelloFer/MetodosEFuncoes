package Aula4exercicios;

import java.util.Scanner;

//Crie um programa com uma função que receba um ano em uma variável inteira, faça os testes para verificar se ele é bissexto, e retorne uma String dizendo “O ano informado é bissexto”ou “O ano informado não é bissexto).A  main  do seu programa deve  conter  a digitação do  ano,  a  chamada da  função  e a exibição do texto retornado.

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
			System.out.println("O ano de " + anoDigitado + " é bissexto!!");
		}else if(anoBissexto(anoDigitado)==false) {
			System.out.println("O ano de " + anoDigitado + " não é bissexto :(");
		}
		
		leitor.close();
	}

}
