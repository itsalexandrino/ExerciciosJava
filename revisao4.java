package exercicio;

import java.util.Scanner;

public class revisao4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		int soma = 0,contador = 1;
		
		for(int i = 1; i <= 99; i = i +2) {
			
			System.out.println("Dividendo: " + i + " || Divisor: " + contador);
			soma  = soma + i/contador;
			contador++;
		}
		
		System.out.println("\n\nResultado da soma: " + soma);
	}

}
