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
		System.out.println("O salario do professor � de R$" + salario);
	}

	public static void main(String[] args) {
		// /*A escola �APRENDER� faz o pagamento de seus professores por hora/aula. Fa�a um programa que calcule e exiba o sal�rio de um professor � partir do seu n�vel e da quantidade de aulas que ele d�. Sabe-se que o valor da hora/aula segue a tabela abaixo:
		/*� Professor N�vel 1 R$12,00 por hora/aula
		� Professor N�vel 2 R$17,00 por hora/aula
		� Professor N�vel 3 R$25,00 por hora/aula*/
		/*Criar um m�todo/fun��o para LER os dados (n�vel e quantidade de aulas dadas);
		* Criar um m�todo para calcular o sal�rio
		* Criar um m�todo para EXIBIR o sal�rio calculado
		* */

		lerDados();
		calcularSalario();
		exibirSalario();
	}

}
