package exercicio;

import java.util.Scanner;


public class array4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int matriz1[][] = new int[2][2];
		int matriz2[][] = new int[2][2];
		int matrizSoma[][] = new int[2][2];
		int matrizDif[][] = new int[2][2];
		
		int menu, constante;
		
		
		System.out.println("Primeira matriz");
		
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.println("Informe o valor da matriz na posição [" + (i+1)+ "] [" + (j+1) + "] : ");
				matriz1[i][j] = sc.nextInt();
				
			}
		}
		
		System.out.println("Segunda matriz");
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.println("Informe o valor da matriz na posição [" + (i+1)+ "] [" + (j+1) + "] : ");
				matriz2[i][j] = sc.nextInt();
				
			}
		}
		
		System.out.println("Informe a operação \n1- Soma das matrizes \n2- Subtração das matrizes \n3- Adicionar constante \n4- Imprimir as matrizes");
		menu = sc.nextInt();
		
		
		switch(menu){
			
		case 1:
			for(int i = 0; i < 2; i++) {
				for(int j = 0; j < 2; j++) {
					matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
					
				}
			}
			System.out.println("Soma das matrizes 1 e 2 \n");
			for(int i = 0; i < 2; i++) {
				for(int j = 0; j < 2; j++) {
					System.out.printf("\t" + matrizSoma[i][j]);
					
				}
				System.out.println(" ");
			}
			break;
		case 2:
			for(int i = 0; i < 2; i++) {
				for(int j = 0; j < 2; j++) {
					matrizDif[i][j] = matriz1[i][j] - matriz2[i][j];
					
				}
			}
			System.out.println("Diferença das matrizes 1 e 2 \n");
			for(int i = 0; i < 2; i++) {
				for(int j = 0; j < 2; j++) {
					System.out.printf("\t" + matrizDif[i][j]);
					
				}
				System.out.println(" ");
			}
			break;
		case 3:
			
			System.out.println("Informe o valor da constante");
			constante = sc.nextInt();
			
			System.out.println("Matriz 1\n");
			for(int i = 0; i < 2; i++) {
				for(int j = 0; j < 2; j++) {
					System.out.printf("\t" + (matriz1[i][j] + constante) );
					
				}
				System.out.println(" ");
			}
			System.out.println("Matriz 2\n");
			for(int i = 0; i < 2; i++) {
				for(int j = 0; j < 2; j++) {
					System.out.printf("\t" + (matriz2[i][j] + constante));
					
				}
				System.out.println(" ");
			}
			
			
			
		
			break;
			
		case 4:
			System.out.println("Matriz 1\n");
			for(int i = 0; i < 2; i++) {
				for(int j = 0; j < 2; j++) {
					System.out.printf("\t" + matriz1[i][j]);
					
				}
				System.out.println(" ");
			}
			System.out.println("Matriz 2\n");
			for(int i = 0; i < 2; i++) {
				for(int j = 0; j < 2; j++) {
					System.out.printf("\t" + matriz2[i][j]);
					
				}
				System.out.println(" ");
			}
			break;
			
			default:
				System.out.println("Opção Invalida");
				break;
		}
	}

}
