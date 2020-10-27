package TirandoDuvidas;

import java.util.Scanner;

public class Exercicio2Forma3 {
	public static double temperatura;
	public static String mascara;
	public static int familia;
//	public static boolean liberado1, liberado2, liberado3;
	
	public static boolean temp() {
		if(temperatura>37) {
			return false;
		}else {
			return true;
		}
	}
	
	public static boolean mask() {
		if(mascara.equalsIgnoreCase("sim")) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean family() {
		if(familia>2) {
			return false;
		}else {
			return true;
		}
	}
	
	public static void agrega() {
		if(temp()==true && mask()==true && family()==true) {
			System.out.println("Liberada a entrada!");
		}else {
			System.out.println("ATIVAR ARMAS");
		}
	}

	public static void main(String[] args) {
		// COM return e SEM argumentos
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual é a temperatura?");
		temperatura = leitor.nextDouble();
		System.out.println("Ta de mascara?");
		mascara=leitor.next();
		System.out.println("Quantas pessoas na familia?");
		familia=leitor.nextInt();
		
		temp();
		mask();
		family();
		agrega();

	}

}
