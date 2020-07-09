package exercicio;

import java.util.Scanner;

public class array3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int [][] matriz = new int [3][3];
		int contador = 0;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("Informe o valor da matriz na posição [" + (i+1)+ "] [" + (j+1) + "] : ");
				matriz[i][j] = sc.nextInt();
				
				if (matriz[i][j] > 10 ) {
					contador++;
				}
				
			}
		}
		
		System.out.println("A quantidade de valores maiores que 10 é: " + contador);
		

	}

}
