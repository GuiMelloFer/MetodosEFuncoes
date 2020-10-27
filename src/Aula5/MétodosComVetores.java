package Aula5;

public class MétodosComVetores {
	
	public static int somarVetor(int[]vetor) {
		int soma=0;
		for(int i=0; i<vetor.length; i++) {
			soma = soma + vetor[i];
		}
		return soma;
	}

	public static void main(String[] args) {
		int[] vetor = {1,5,7,3,13};

		System.out.println(somarVetor(vetor));
	}

}
