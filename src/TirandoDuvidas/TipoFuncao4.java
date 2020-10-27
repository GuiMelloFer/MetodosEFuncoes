package TirandoDuvidas;

import java.util.Scanner;

public class TipoFuncao4 {
	
//	public static String username;
//	public static String password;
	
	//função de login COM retorno de dados e COM argumentos
	public static boolean login4(String usuario, String senha) {
		if(usuario.equals("admin") && senha.equals("123")) {
			return true;
		}else {
			return false;
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
		
		if(login4(username,password)) {
			System.out.println("login bem sucedido");
		}else {
			System.out.println( "Usuario ou senha incorretos. Tente novamente.");
		}
		}

}
