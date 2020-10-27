package desafio;

import java.util.Random;
import java.util.Scanner;

public class ExercicioMP3 {
	
	public static boolean shuffle=false ;
	public static int posicao=0;
	
	public static void exibeLista (String[] musicas) {
		for(int i=0;i<musicas.length;i++) {
			System.out.println(" " + musicas[i] + " ");
		}
	}
	
	public static void ativaShuffle () {
		shuffle = !shuffle;
	}
	
	public static String avancarMusica(String[]musica) {
		Random random = new Random();
		
		if(shuffle==true) {
			posicao = random.nextInt(musica.length);
		}else  {
			posicao++;
		if(posicao==musica.length) {
			posicao=0;
		}
		}
		return musica[posicao];
		}
	
	
	public static String voltarMusica(String[]musica) {
		Random random = new Random();
		
		if(shuffle==true) {
			posicao = random.nextInt(musica.length);
		}else  {
			posicao--;
		}
		return musica[posicao];
	}
	
	
	public static String play(String[]musica) {
		return musica[posicao];
	}
	
	public static String stop(String[]musica) {
		posicao=0;
		shuffle=false;
		return musica[posicao];
	}
	

	
		public static void main(String[] args) {
			
		String[] musicas = {"Wonderwall", "Hotel California", "Boolevard of broken dreams", "Lazysong", "Love yourself", "Radioactive", "Take it easy", "Alone", "One", "Take on me", "Ew", "Tic tok", "Run", "Oxigen", "Bills","Genius","Naked","Cringe", "Monster", "River", "Work it", "Don't stop now", "Ela partiu", "Descobridor dos sete mares", "Ta vendo aquela lua", "Fugidinha", "Olha onda", "Thriller", "Sorvete de ovomaltine", "Caro diabo","BOB"};
			String opcao="";
			Scanner leitor = new Scanner(System.in);
			
			
			while(!opcao.equalsIgnoreCase("sair")) {
			
			System.out.println("-----MENU MP3-----");
			System.out.println("Escolha uma opção\n Exibir lista\n Ativar Shuffle\n Avançar música\n Voltar música\n Play\n Stop\n Sair");
			opcao=leitor.nextLine();
			
			if(opcao.equalsIgnoreCase("exibir lista")) {
				exibeLista(musicas);
				
			}else if(opcao.equalsIgnoreCase("ativar shuffle")) {
				ativaShuffle();
				
			}else if(opcao.equalsIgnoreCase("avancar musica")  ||  opcao.equalsIgnoreCase("avançar musica")) {
			System.out.println("Proxima musica..." + avancarMusica(musicas));	
				
				
			}else if(opcao.equalsIgnoreCase("voltar musica")) {
				System.out.println("Proxima musica... " + voltarMusica(musicas));
				
			}else if(opcao.equalsIgnoreCase("play")) {
				System.out.println("Tocando agora..." + play(musicas));
				
			}else if(opcao.equalsIgnoreCase("stop")) {
				System.out.println("PARADO proxima musica... " + stop(musicas));
				
			}else if(opcao.equalsIgnoreCase("sair")) {
				break;
			}
			
			}

	}

}
