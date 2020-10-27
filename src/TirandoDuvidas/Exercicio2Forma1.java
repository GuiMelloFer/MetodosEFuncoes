package TirandoDuvidas;

import java.util.Scanner;

public class Exercicio2Forma1 {
	public static double temperatura;
	public static String mascara;
	public static int familia;
	public static boolean liberado1, liberado2, liberado3;
	
	public static void temp() {
		if(temperatura>37) {
			liberado1=false;
		}else {
			liberado1 = true;
		}
	}
	
	public static void mask() {
		if(mascara.equalsIgnoreCase("sim")) {
			liberado2 = true;
		}else {
			liberado2 = false;
		}
	}
	
	public static void family() {
		if(familia>2) {
			liberado3=false;
		}else {
			liberado3=true;
		}
	}
	
	public static void agrega() {
		if(liberado1==true && liberado2==true && liberado3==true) {
			System.out.println("Liberada a entrada!");
		}else {
			System.out.println("ATIVAR ARMAS");
		}
	}

	public static void main(String[] args) {
		// SEM return e SEM argumentos
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
