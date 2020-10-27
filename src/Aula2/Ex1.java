package Aula2;

import java.util.Scanner;

public class Ex1 {
	
	public static void lerDados() {
		Scanner leitor = new Scanner (System.in);
		int a, b, c;
		System.out.println("Digite o numero de votos de cada candidato em ordem:");
		a=leitor.nextInt();
		b=leitor.nextInt();
		c=leitor.nextInt();
		
		vencedor(a,b,c);
	}
	
	public static void vencedor(int primeiro, int segundo, int terceiro) {
		if(primeiro>segundo && primeiro>terceiro) {
			System.out.println("O vencedor foi o primeiro candidato");
		}else if (segundo>primeiro && segundo>terceiro) {
			System.out.println("O vencedor foi o segundo candidato");
		}else if(terceiro>segundo && terceiro > primeiro) {
			System.out.println("O vencedor foi o terceiro candidato");
		}
	}

	public static void main(String[] args) {
		// Faça  um  programa  que  receba o  número de votos  de 3  candidatos  ao cargo de Orador da formatura da turma de1EMA. O programa deverá exibir quem foi o VENCEDOR da FORMATURA.Criar um métodopara verificar e exibir o vencedor e um outro método para ler os votos.
		
		lerDados();

	}

}
