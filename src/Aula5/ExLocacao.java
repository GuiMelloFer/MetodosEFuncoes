package Aula5;

import java.util.Scanner;

public class ExLocacao {
	
	public static int posicao=0;
	
	
	public static void opcao1(String[] data, String[] marca, double[] valor, String nova_data, String nova_marca, double novo_valor) {
		
			data[posicao] = nova_data;
			marca[posicao] = nova_marca;
			valor[posicao] = novo_valor;
			posicao++;
		
	}
	
	public static double opcao2(double[] valor) {
		double soma_total=0;
		for(int i=0; i<posicao; i++) {
			soma_total = soma_total + valor[i];
		}
		return soma_total;
	}
	
	public static double opcao3(double[] valor, String[]marca, String marca_digitada) {
		double soma_marcas=0.0;
		
		for(int i=0;i<posicao;i++) {
			if(marca[i].equals(marca_digitada)) {
				soma_marcas = soma_marcas + valor[i];
			}
		}
		return soma_marcas;
	}
	
	public static double opcao4(double[]valor) {

		double soma_media=0, media=0;
		
		for(int i=0; i<posicao;i++) {
			soma_media = soma_media + valor[i];
		}
		media = soma_media / valor.length;
		return media;
	}
	
	public static int opcao6(String marca_digitada6, String[]marca) {
		
		int qntd_locacoes=0;
		
		for(int i=0; i<posicao;i++) {
			if(marca_digitada6.equals(marca[i])) {
				qntd_locacoes++;
			}
		}
		return qntd_locacoes;
	}
	
	public static double opcao5(double[]valor, String[]marca,String marca_digitada5) {
		 
		double media_marca = opcao3(valor,marca,marca_digitada5) / opcao6(marca_digitada5,marca);
		
//		for(int i=0; i<posicao;i++) {
//			if(marca_digitada5.equals(marca[i])) {
//				somas = somas + valor[i];
//				quantidade++;
//			}
//			
//		}
//		media_marca = somas/quantidade;
		
		return media_marca;
		
	}
	


	public static void main(String[] args) {
		String[] data = new String[3];
		String[] marca = new String[3];
		double[] valor = new double[3];
		Scanner leitor = new Scanner (System.in);
		
		int opcao=0;
		
		while(opcao!=7) {
			System.out.println("LOCADORA LOUCURA!");
			System.out.println("1-locação\n2-Total parcial\n3-Total por marca\n4-Média geral\n5-Média por marca\n6-Quantidade de locações por marca\n7-Sair");
			opcao=leitor.nextInt();
			
			switch(opcao) {
			case 1:
				 String nova_marca;
				 String nova_data;
				 double novo_valor;
				 
				
					System.out.println("Digite a marca do veiculo:");
					nova_marca=leitor.next();
					System.out.println("Digite a data de locação:");
					nova_data = leitor.next();
					System.out.println("Digite o valor do carro: ");
					novo_valor=leitor.nextDouble();
				opcao1(data,marca,valor,nova_marca,nova_data,novo_valor);
				break;
				
			case 2:
				opcao2(valor);
				System.out.println("O total parcial é de R$" + opcao2(valor));
				break;
				
			case 3:
				String marca_digitada;
				System.out.println("Digite a marca:");
				marca_digitada=leitor.next();
				
				System.out.println("O total da marca escolhida é de R$" + opcao3(valor,marca,marca_digitada));
				break;
				
			case 4:
				opcao4(valor);
				System.out.println("A media de tudo é " + opcao4(valor));
				break;
				
			case 5:
				String marca_digitada5;
				System.out.println("Digite a marca:");
				marca_digitada5=leitor.next();
	
				System.out.println("A media da marca escolhida é " + opcao5(valor,marca,marca_digitada5));
				break;
				
			case 6:
				String marca_digitada6;
				System.out.println("Digite a marca:");
				marca_digitada6=leitor.next();
				
				opcao6(marca_digitada6,marca);
				System.out.println("A quantidade de locações dessa marca é " + opcao6(marca_digitada6,marca));
					break;
				
			}
		}
		leitor.close();
	}

}
