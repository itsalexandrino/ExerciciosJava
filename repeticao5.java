package exercicio;

import java.util.Scanner;

public class repeticao5 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int num, soma = 0;
		
		System.out.println("Informe o numero: ");
		num = sc.nextInt();
		
		do {
			
			soma = soma + num;
			System.out.println("Informe o numero: ");
			num = sc.nextInt();
			
		}while(num != 0);
		
		System.out.println("Soma dos numeros: " + soma);
	}

}
