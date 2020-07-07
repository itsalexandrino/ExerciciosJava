package exercicio;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int num1,num2,num3, maior = 0;
		
		System.out.println("Informe o numero 1: ");
		num1 = sc.nextInt();
		System.out.println("Informe o numero 2: ");
		num2 = sc.nextInt();
		System.out.println("Informe o numero 3: ");
		num3 = sc.nextInt();
		
		if (num1 > num2) {
			
			maior = num1;
		}else {
			maior = num2;
		}
		if(num3 > maior) {
			maior = num3;
		}
		
		System.out.println("Numero maior: " + maior);
		
		
	}

}
