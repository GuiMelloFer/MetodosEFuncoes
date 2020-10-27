package Aula3;

import java.util.Scanner;

public class ExVotacaoComReturn {
	
	public static int calcular_idade(int anoNascimento, int anoAtual) {
		int idade;
		idade= anoAtual-anoNascimento;
		return idade;
	}
	
	public static void exibe(int idade) {
		if(idade < 16) {
			System.out.println("Voce não pode votar");
		}else if( idade < 18){
			System.out.println("Voce pode votar");
		}else {
			System.out.println("Voce é obrigado a votar");
		}
	}

	public static void main(String[] args) {
		// programa pra ver se a pessoa pode votar

		int anoNascimento;
		Scanner R=new Scanner(System.in);
		System.out.println("Digite o ano do seu nascimento");
		anoNascimento = R.nextInt();
		R.close();
		int idade = calcular_idade(anoNascimento, 2020);
		exibe(idade);
	}

}
