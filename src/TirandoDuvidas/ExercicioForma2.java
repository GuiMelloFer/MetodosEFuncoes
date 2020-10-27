package TirandoDuvidas;

import java.util.Scanner;

public class ExercicioForma2 {

	
	
	public static double validar(double valor, String desconto) {
		if(desconto.equalsIgnoreCase("vale10")) {
			valor = valor * 0.90;
			return valor;
		}else {
			return valor;
		}
	}
	
	public static void main(String[] args) {
		// Função COM return e COM argumentos
		 double preco;
		 String cupom;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o preço do produto");
		preco=leitor.nextDouble();
		System.out.println("Digite o cupom de desconto");
		cupom=leitor.next();
		
		
		if(cupom.equalsIgnoreCase("vale10")) {
			System.out.println("Cupom aplicado, valor R$" + validar(preco,cupom));
		}else {
			System.out.println("Cupom invalido, valor R$ " + validar(preco,cupom));
		}

	}

}
