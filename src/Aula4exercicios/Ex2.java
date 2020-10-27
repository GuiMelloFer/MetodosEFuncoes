package Aula4exercicios;

import java.util.Scanner;

//Crie  uma  fun��o  que  valida  se  um  tri�ngulo  existe  ou  n�o.  Al�m  disso,  crie  uma fun��o que verifica o tipo do tri�ngulo(ela deve primeiro validar se o tri�ngulo existe).A  main  do  seu  programa  deve  ter  a  leitura  dos  lados  do tri�ngulo  e  achamada  da fun��o que retorna o tipo dele.
public class Ex2 {
	
	public static boolean existe(int a, int b, int c) {
		if((a+b)>c && (a+c)>b && (b+c)>a) {
			return true;
			
		}else {
			return false;
		}
	}
	
	public static String tipo_triang(int a, int b, int c) {
		
			if(a==b && a!=c || a==c && a!=b || b==c && a!=b) {
				return "Isosceles";
				
			}else if(a==b && a==c) {
				return "Equilatero";
				
			}else if(a!=b && a!=c && b!=c) {
				return "Escaleno";
				
			}else {
				return null;
			}
	}

	public static void main(String[] args) {
		int ladoA, ladoB,ladoC;
		Scanner leitor = new Scanner (System.in) ;
			System.out.println("Digite os 3 lados do triangulo:");
			ladoA=leitor.nextInt();
			ladoB=leitor.nextInt();
			ladoC=leitor.nextInt();
			
			existe(ladoA, ladoB, ladoC);

			if(existe(ladoA, ladoB, ladoC)==true) {
				tipo_triang(ladoA, ladoB, ladoC);
				System.out.println("apos a verifica��o o triangulo foi declarado como: " + tipo_triang(ladoA, ladoB, ladoC));
			}else {
				System.out.println("o triangulo n�o existe");
			}
	}

}
