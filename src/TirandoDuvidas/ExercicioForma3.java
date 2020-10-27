package TirandoDuvidas;

import java.util.Scanner;

public class ExercicioForma3 {

	public static double preco;
	public static String cupom;
	
	public static boolean validar() {
		if(cupom.equalsIgnoreCase("vale10")) {
			preco = preco * 0.90;
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// Função COM return e SEM argumentos
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o preço do produto");
		preco=leitor.nextDouble();
		System.out.println("Digite o cupom de desconto");
		cupom=leitor.next();
		
		if(validar()==true) {
			System.out.println("Cupom aplicado, valor R$" + preco);
		}else {
			System.out.println("Cupom invalido, valor R$ " + preco);
		}

	}

}
