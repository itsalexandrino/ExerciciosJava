package exercicio;

import java.util.Scanner;

public class revisao5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double [] vetor = new double[5];
		int menu;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Informe o valor do vetor[" + (i+1)+ "]: ");
			vetor[i] = sc.nextDouble();
		}
		
		System.out.println("Informe a opção\n1- Vetor na ordem direta \n2- Vetor na ordem inversa");
		menu = sc.nextInt();
		
		if (menu == 1) {
			System.out.printf("Vetor: ");
			for(int i = 0; i < 5; i++) {
				System.out.printf(vetor[i] + "\t");
			}
		}else if(menu == 2){
			System.out.printf("Vetor na ordem inversa: ");
			for (int i = 4; i >= 0 ; i--) {
				System.out.printf(vetor[i]+ "\t");
			}
		} else {
			System.out.println("Opção Invalida");
		}
	}

}
