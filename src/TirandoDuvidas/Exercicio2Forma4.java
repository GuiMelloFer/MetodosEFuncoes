package TirandoDuvidas;

import java.util.Scanner;

public class Exercicio2Forma4 {
	
	public static boolean liberado1, liberado2, liberado3;
	
	public static boolean temp(double temperatura) {
		if(temperatura>37) {
			return false;
		}else {
			return true;
		}
	}
	
	public static boolean mask(String mascara) {
		if(mascara.equalsIgnoreCase("sim")) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean family(int familia) {
		if(familia>2) {
			return false;
		}else {
			return true;
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
		// COM return e COM argumentos
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
		agrega(temp(temperatura),mask(mascara),family(familia));

	}

}
