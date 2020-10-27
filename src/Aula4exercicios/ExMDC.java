package Aula4exercicios;

import java.util.Scanner;

public class ExMDC {
	


	public static void main(String[] args) {
		//programa de mmc e mdc sem funçoes
		int num1, num2,maxdc,mdc=1, novo1, novo2;
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite os dois numeros:");
		num1=leitor.nextInt();
		num2=leitor.nextInt();
		
		//mdc
		if(num1>num2) {
			//o problema é que ele nao ve o 2 novamente 
			for(int i=2; i<num1;i++) {
				if(num1%i==0 && num2%i==0) {
					
					novo1=num1/i;
					novo2=num2/i;
					maxdc=i*mdc;
					mdc = maxdc;
					num1=novo1;
					num2=novo2;
					
				}
			}
		}
		if(num2>num1) {
			for(int i=2; i<num2; i++) {
				if(num1%i==0 && num2%i==0) {
					mdc=i*mdc;
					mdc = mdc;
					
				}
			}
		}
		System.out.println("mdc é " + mdc );
	}

}


