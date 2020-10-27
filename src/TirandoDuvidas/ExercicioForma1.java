package TirandoDuvidas;

import java.util.Scanner;

public class ExercicioForma1 {

	public static double preco;
	public static String cupom;
	
	public static void validar() {
		if(cupom.equalsIgnoreCase("vale10")) {
			preco = preco * 0.90;
			System.out.println("O valor com desconto aplicado é R$"+preco);
		}else {
			System.out.println("O desconto não é valido. Valor de R$"+preco);
		}
	}
	
	public static void main(String[] args) {
		// Função SEM return e SEM argumentos
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o preço do produto");
		preco=leitor.nextDouble();
		System.out.println("Digite o cupom de desconto");
		cupom=leitor.next();
		
		validar();

	}

}
