package Aula3;

import java.util.Scanner;

public class FuncoesComReturn01 {

//	o objetivo do programa vai ser receber o nome e sobrenome de um usuario e  formar seu nome completo
	public static String formarNome(String nome, String sobrenome) {
		//System.out.println(nome + " " + sobrenome);
		return nome + " " + sobrenome;
	}
	
// agora deve receber o nome e fazer uma saudaçao sem perder a funçao anterior 
	public static void saudar(String nome, String sobrenome) {
		System.out.println(formarNome(nome,sobrenome)+", você é top");
	}
	public static void main(String[] args) {
		formarNome("Double", "Zi");

	}

}
