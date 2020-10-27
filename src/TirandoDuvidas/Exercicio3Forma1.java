package TirandoDuvidas;

import java.util.Scanner;

public class Exercicio3Forma1 {
	public static String ct1,np1,ct2,np2,ct3,np3,ct4,np4,ct5,np5;
	
	public static void par() {
		if(ct1==ct2 && ct3!=ct4 && ct3!=ct5 && ct4!=ct5 || ct1==ct3 && ct2!=ct4 && ct2!=ct5 && ct4!=ct5 || ct1==ct4 && ct3!=ct2 && ct3!=ct5 && ct2!=ct5 || ct1==ct5 && ct3!=ct4 && ct3!=ct2 && ct4!=ct2 || ct2==ct3 && ct4!=ct1 && ct4!=ct5 && ct1!=ct5 || ct2==ct4 && ct3!=ct1 && ct3!=ct5 && ct1!=ct5) {
			
		}
	}

	public static void main(String[] args) {
		// SEM return e SEM argumentos
		Scanner r = new Scanner(System.in);
		System.out.println("Digite a carta e o naipe das cinco cartas:");
		ct1 = r.next();
		np1 = r.next();
		ct2 = r.next();
		np2 = r.next();
		ct3 = r.next();
		np3 = r.next();
		ct4 = r.next();
		np4 = r.next();
		ct5 = r.next();
		np5 = r.next();
		
		System.out.println("voce possui: ");
		

	}

}
