package MetodosArrays;

import java.util.Scanner;

public class Ex2 {
	
	public static void ordenaTabela(String[]times, int[]pontos) {
		int troca;
		String trocatime;
		for(int i=0; i<times.length-1;i++) {
			for(int j=i+1;j<times.length;j++) {
				if(pontos[i]<pontos[j]) {
					troca = pontos[i];
					pontos[i] = pontos[j];
					pontos[j] = troca;
					trocatime = times[i];
					times[i] = times[j];
					times[j] = trocatime;
				}
			}
		}
		
	}
	
	public static void printaTabela(String[]times, int[]pontos) {
		for(int i=0; i<times.length;i++) {
			System.out.println(times[i] + "  " + pontos[i]);
		}
	}
	
	public static void campeao(String[]times, int[]pontos) {
		ordenaTabela(times,pontos);
		System.out.println("O campeão é: " + times[0]);
	}
	
	public static void rebaixado(String[]times, int[]pontos) {
		ordenaTabela(times,pontos);
		System.out.println("Os rebaixados são: " + times[9] + " e " + times[10]);
		System.out.println("Só mudança");
	}

	public static void main(String[] args) {
		String[] equipes = new String[10];
		int[] pontos = new int[10];
		int op;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o time e sua pontuação:");
		
			for(int i=0;i<equipes.length;i++) {
				equipes[i] = leitor.next();
				pontos[i]=leitor.nextInt();
			}
		
		
		int opcao=0;
		while(opcao!=5) {
			System.out.println("Digite 1 para ordenar a tabela\nDigite 2 para mostrar a tabela de times e suas pontuações\nDigite 3 para mostrar o campeão\nDigite 4 para mostrar os rebaixados ");
			opcao = leitor.nextInt();
			switch(opcao) {
			case 1:
				ordenaTabela(equipes,pontos);
				break;
			case 2:
				printaTabela(equipes,pontos);
				break;
			case 3:
				campeao(equipes,pontos);
				break;
			case 4:
				rebaixado(equipes,pontos);
				break;
				
			}
		}
		
	}

}
