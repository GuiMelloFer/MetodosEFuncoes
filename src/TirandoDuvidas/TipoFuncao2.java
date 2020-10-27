package TirandoDuvidas;

import java.util.Scanner;

public class TipoFuncao2 {
	
//	public static String username;
//	public static String password;
	
	//função de login SEM retorno de dados e COM argumentos
	public static void login2(String usuario, String senha) {
		if(usuario.equals("admin") && senha.equals("123")) {
			System.out.println("login bem sucedido");
		}else {
			System.out.println("Usuario ou senha incorretos. Tente novamente.");
		}
		
	}

	public static void main(String[] args) {
		String username;
		String password;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("FAZER LOGIN");
		System.out.println("Por favor, digite seu email");
		username = leitor.next();
		System.out.println("Digite sua senha");
		password=leitor.next();
		leitor.close();
		
		login2(username,password);
	}

}
