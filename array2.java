package exercicio;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int [] vetor = new int[6];
		int somaPar = 0, somaImpar = 0, quantPar = 0, quantImpar = 0;
		
		
		for(int i = 0; i < 6; i++) {
			System.out.println("Infome o valor do vetor [" + (i+1) + "] : ");
			vetor[i] = sc.nextInt();
			
			if (vetor[i] % 2 == 0) {
				somaPar = somaPar + vetor[i];
				quantPar++;
			} else {
				somaImpar = somaImpar + vetor[i];
				quantImpar++;
			}
		}
		
		System.out.println("Soma dos valores pares: " + somaPar);
		System.out.println("Quantidade de numeros pares: " + quantPar + "\n\n");
		System.out.println("Soma dos valores impares: " + somaImpar);
		System.out.println("Quantidade de numeros impares: " + quantImpar);

	}

}
