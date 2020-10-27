package Aula2;

import java.util.Scanner;

public class Ex2 {
	
	public static void dados() {
		String plano;
		double faturamento;
		Scanner leitor = new Scanner (System.in);
		System.out.println("Digite o plano (basic, silver, gold, platina): ");
		plano = leitor.next();
		System.out.println("Digite o faturamento:");
		faturamento=leitor.nextDouble();
		
		bonus(plano,faturamento);
	}
	
	public static void bonus(String a, double b) {
		double lucro;
		if(a.equals("basic")) {
			lucro = b * 0.30;
			System.out.println("Voce nos deve R$"+lucro);
		}else if(a.equals("silver")) {
			lucro = b * 0.20;
			System.out.println("Voce nos deve R$"+lucro);
		}else if(a.equals("gold")) {
			lucro = b * 0.10;
			System.out.println("Voce nos deve R$"+lucro);
		}else if(a.equals("platina")) {
			lucro = b * 0.05;
			System.out.println("Voce nos deve R$"+lucro);
		}
	}

	public static void main(String[] args) {
		
		dados();
	}

}
