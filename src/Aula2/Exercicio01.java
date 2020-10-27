package Aula2;

import java.util.Scanner;

public class Exercicio01 {
	
	public static int nivel;
	public static double salario;
	public static int qntd;
	
	public static void lerDados(){
		Scanner leitor = new Scanner (System.in);
		System.out.println("Digite seu nivel");
		nivel=leitor.nextInt();
		System.out.println("Insira a quantidade de aulas dadas");
		qntd=leitor.nextInt();
	}
	
	public static void calcularSalario() {
		if(nivel==1) {
			salario= 12*qntd;
		}else if(nivel==2) {
			salario = 17 * qntd;
		}else if(nivel==3) {
			salario = 25 * qntd;
		}
	}
	
	public static void exibirSalario(){
		System.out.println("O salario do professor é de R$" + salario);
	}

	public static void main(String[] args) {
		// /*A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um programa que calcule e exiba o salário de um professor à partir do seu nível e da quantidade de aulas que ele dá. Sabe-se que o valor da hora/aula segue a tabela abaixo:
		/*• Professor Nível 1 R$12,00 por hora/aula
		• Professor Nível 2 R$17,00 por hora/aula
		• Professor Nível 3 R$25,00 por hora/aula*/
		/*Criar um método/função para LER os dados (nível e quantidade de aulas dadas);
		* Criar um método para calcular o salário
		* Criar um método para EXIBIR o salário calculado
		* */

		lerDados();
		calcularSalario();
		exibirSalario();
	}

}
