package TirandoDuvidas;

import java.util.Scanner;

public class TipoFuncao3 {
	
	public static String username;
	public static String password;
	
	//função de login COM retorno de dados e SEM argumentos
	public static String login3() {
		if(username.equals("admin") && password.equals("123")) {
			return "login bem sucedido";
		}else {
			return "Usuario ou senha incorretos. Tente novamente.";
		}
		
	}
	
	public static boolean login3boolean() {
		if(username.equals("admin") && password.equals("123")) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		//String username;
		//String password;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("FAZER LOGIN");
		System.out.println("Por favor, digite seu email");
		username = leitor.next();
		System.out.println("Digite sua senha");
		password=leitor.next();
		leitor.close();
		
		System.out.println(login3());
		
		if(login3boolean()) {
			System.out.println("login bem sucedido");
		}else {
			System.out.println( "Usuario ou senha incorretos. Tente novamente.");
		}
	}

}
