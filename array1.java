package exercicio;

public class array1 {

	public static void main(String[] args) {
		
		
		int [] vetor = new int[6];
		int soma = 0;
		
		vetor[0] = 1;
		vetor[1] = 0;
		vetor[2] = 5;
		vetor[3] = -2;
		vetor[4] = -5;
		vetor[5] = 7;
		
		soma = vetor[0] + vetor[1] + vetor[5];
		
		System.out.println("Somas das posições: " + soma+"\n\n");
		
		vetor[3] = 100;
		
		for(int i = 0; i < 6; i++) {
			System.out.println("Valor do vetor na Posição [" + (i + 1) + "]: " + vetor[i]);
		}

	}

}
