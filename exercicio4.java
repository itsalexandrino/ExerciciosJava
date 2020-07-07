package exercicio;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		double raiz, potencia;
		
		System.out.println("Informe o numero");
		num = sc.nextInt();
		
		
		if (num % 2 == 0) {
			
			raiz = Math.sqrt(num);
			
			System.out.println("Numero " + num + " é par e sua raiz quadrada é: " + raiz);
			
		}else {
			potencia = Math.pow(num, 2);
			System.out.println("Numemro " + num + " é impar e elevado a dois é: " + potencia);
		}
				
				

	}

}
