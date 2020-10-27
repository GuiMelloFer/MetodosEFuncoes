package Aula4exercicios;

import java.util.Scanner;

//Crie uma função que receba uma String contendo a sigla de um estado e verifique se esse estado existe ou não. Caso exista, a função deve retornar um boolean true. Caso não exista, ele deve retornarum boolean false.A main do seu programa deve conter a digitação do estado, a chamada da função e a exibição de uma mensagem para afirmar se o estado existe ou não, dependendo do que a função retornar.

public class Ex1 {
	
	public static boolean estado(String a) {
		boolean existe;
		if (a.equalsIgnoreCase("SP")||a.equalsIgnoreCase("RJ")||a.equalsIgnoreCase("MG")||a.equalsIgnoreCase("ES")||a.equalsIgnoreCase("RS")||a.equalsIgnoreCase("SC")||a.equalsIgnoreCase("PR")||a.equalsIgnoreCase("MS")||a.equalsIgnoreCase("MT")||a.equalsIgnoreCase("GO")||a.equalsIgnoreCase("AC")||a.equalsIgnoreCase("AM")||a.equalsIgnoreCase("RR")||a.equalsIgnoreCase("RO")||a.equalsIgnoreCase("AP")||a.equalsIgnoreCase("DF")||a.equalsIgnoreCase("PA")||a.equalsIgnoreCase("TO")||a.equalsIgnoreCase("AL")||a.equalsIgnoreCase("BA")||a.equalsIgnoreCase("MA")||a.equalsIgnoreCase("PB")||a.equalsIgnoreCase("PE")||a.equalsIgnoreCase("PI")||a.equalsIgnoreCase("RN")||a.equalsIgnoreCase("SE")||a.equalsIgnoreCase("CE")) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		String sigla;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a sigla de um estado:");
		sigla=leitor.next();
		
		 estado(sigla);
		if (estado(sigla)==true) {
			System.out.println("O estado existe");
		}else if(estado(sigla)==false){
			System.out.println("O estado não existe");
		}

	}

}
