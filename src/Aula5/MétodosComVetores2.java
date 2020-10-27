package Aula5;

public class MétodosComVetores2 {
	
	public static void zerarVetor(int[]vetor) {
		for(int i=0; i<vetor.length;i++) {
			vetor[i]=0;
		}
	}

	public static void main(String[] args) {
		int[] vetor = {1,5,7,3,13};
		for(int i=0; i<vetor.length;i++) {
			System.out.println(vetor[i]+"-");
		}
		zerarVetor(vetor);
		System.out.println("Vetor depois de zerar");
		for(int i=0; i<vetor.length;i++) {
			System.out.println(vetor[i]+"-");
		}
	}

}
