package TirandoDuvidas;

import java.util.Scanner;

public class Exercicio2Forma2 {
	
	public static boolean liberado1, liberado2, liberado3;
	
	public static void temp(double temperatura) {
		if(temperatura>37) {
			liberado1=false;
		}else {
			liberado1 = true;
		}
	}
	
	public static void mask(String mascara) {
		if(mascara.equalsIgnoreCase("sim")) {
			liberado2 = true;
		}else {
			liberado2 = false;
		}
	}
	
	public static void family(int familia) {
		if(familia>2) {
			liberado3=false;
		}else {
			liberado3=true;
		}
	}
	
	public static void agrega(boolean um, boolean dois, boolean tres) {
		if(um==true && dois==true && tres==true) {
			System.out.println("Liberada a entrada");
		}else {
			System.out.println("ATIVAR ARMAS");
		}
	}

	public static void main(String[] args) {
		// SEM return e COM argumentos
		double temperatura;
		String mascara;
		int familia;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual é a temperatura?");
		temperatura = leitor.nextDouble();
		System.out.println("Ta de mascara?");
		mascara=leitor.next();
		System.out.println("Quantas pessoas na familia?");
		familia=leitor.nextInt();
		
		temp(temperatura);
		mask(mascara);
		family(familia);
		agrega(liberado1,liberado2,liberado3);

	}

}
