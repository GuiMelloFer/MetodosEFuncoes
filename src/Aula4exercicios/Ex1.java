package Aula4exercicios;

import java.util.Scanner;

//Crie uma fun��o que receba uma String contendo a sigla de um estado e verifique se esse estado existe ou n�o. Caso exista, a fun��o deve retornar um boolean true. Caso n�o exista, ele deve retornarum boolean false.A main do seu programa deve conter a digita��o do estado, a chamada da fun��o e a exibi��o de uma mensagem para afirmar se o estado existe ou n�o, dependendo do que a fun��o retornar.

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
			System.out.println("O estado n�o existe");
		}

	}

}
