package MetodosArrays;

public class Ex1 {
	
	public static void exibe(String[] lista) {
		for (int i=0; i<lista.length; i++) {
			System.out.println(lista[i]);
		}
	}

	public static void main(String[] args) {
		String[] lista_de_arquivos= {"c:\\www  \\index.html", "c:  \\www  \\css  \\style.css", "c:\\www  \\js \\index.js", "c:  \\www  \\img  \\logo.png", "c:\\www  \\img  \\equipe.jp"};

		exibe(lista_de_arquivos);
	}

}
