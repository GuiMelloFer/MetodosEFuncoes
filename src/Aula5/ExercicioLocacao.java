package Aula5;

import java.util.Scanner;

public class ExercicioLocacao {
	
	public static int posicao = 0;
	
	public static void fazLocacao(String[] data, String[] marca, double[] preco, String nova_data, String nova_marca, double novo_preco) {
		data[posicao] = nova_data;
		marca[posicao] = nova_marca;
		preco[posicao] = novo_preco;
		posicao++;
	}
	
	public static void printaLocacoes(String[] data, String[] marca, double[] preco) {
		for(int i=0;i<data.length; i++) {
			System.out.println(data[i] + " - " + marca[i] + " - R$" + preco[i]);
		}
	}

	public static double soma_geral(double[]preco) {
		double soma = 0;
		for(int i=0; i<posicao; i++) {
			soma = soma + preco[i];
		}
		return soma;
	}
	
//	double soma_marca=0;
//	String marca;
//	System.out.println("Digite uma das marcas:");
//	marca=leitor.next();
//	
//	for(int i=0;i<marca_carro.length; i++) {
//		if(marca.equals(marca_carro[i])) {
//			soma_marca = soma_marca + preco_locacao[i];
//		}
//	}
//	System.out.println("A soma dessa marca é de R$"+soma_marca);
	public static double soma_marca(String nome_marca) {
		double soma_marca;
		for(int i=0;i<posicao; i++) {
			if(nome_marca.equals(marca [i])) {
				soma_marca = soma_marca + preco_locacao[i];
			}
		}
	}
	

	public static void main(String[] args) {
		String[] data_locacao = new String[100];
		String[] marca_carro = new String[100];
		double[] preco_locacao = new double[100];
		Scanner leitor = new Scanner (System.in);
		int opcao=0;
		
		while(opcao!=7) {
			System.out.println("LOCADORA LOUCURA!");
			System.out.println("1-locação\n2-Total parcial\n3-Total por marca\n4-Média geral\n5-Média por marca\n6-Quantidade de locações por marca\n7-Sair");
			opcao=leitor.nextInt();
			
			switch(opcao) {
			case 1:
				String nova_data;
				String nova_marca;
				double novo_preco;
				System.out.println("Digite a marca do carro alugado");
				nova_marca = leitor.next();
				System.out.println("Digite a data da locação do carro alugado");
				nova_data = leitor.next();
				System.out.println("Digite o preço da locação do carro alugado");
				novo_preco = leitor.nextDouble();
				fazLocacao(data_locacao, marca_carro, preco_locacao,nova_data, nova_marca, novo_preco);
				break;
				
			case 2: 
				soma_geral(preco_locacao);
				
				break;
				
			case 3: 
				
				String marca;
				System.out.println("Digite uma das marcas:");
				marca=leitor.next();
				soma_marca(marca);
				
				break;
				
			case 4: 
				double media_geral, soma_media=0;
				for(int i=0;i<preco_locacao.length; i++) {
					soma_media = soma_media + preco_locacao[i];
				}
				media_geral = soma_media / preco_locacao.length;
				
				System.out.println("A media de preços geral é: R$" + media_geral);
				
				break;
				
			case 5:
				double media_marca=0, soma_marcamedia=0;
				String marca02;
				System.out.println("Digite uma das marcas:");
				marca02=leitor.next();
				
				for(int i=0;i<marca_carro.length; i++) {
					if(marca02.equals(marca_carro[i])) {
						soma_marcamedia = soma_marcamedia + preco_locacao[i];
					}
					media_marca = soma_marcamedia / preco_locacao.length;
						
				}
				System.out.println("A media do preço das locaçoes da marca digitada é: R$" + media_marca);
				break;
				
			case 6:
				
				break;
			case 7:
				break;
			}
		}

	}

}
