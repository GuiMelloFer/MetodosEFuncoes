package TirandoDuvidas;

import java.util.Scanner;

public class ExercicioForma4 {

	
	
	public static void validar(double valor, String desconto) {
		if(desconto.equalsIgnoreCase("vale10")) {
			valor = valor * 0.90;
			System.out.println("O valor com desconto aplicado � R$"+valor);
		}else {
			System.out.println("O desconto n�o � valido. Valor de R$"+valor);
		}
	}
	
	public static void main(String[] args) {
		// Fun��o SEM return e COM argumentos
		 double preco;
		 String cupom;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o pre�o do produto");
		preco=leitor.nextDouble();
		System.out.println("Digite o cupom de desconto");
		cupom=leitor.next();
		
		validar(preco,cupom);

	}

}
