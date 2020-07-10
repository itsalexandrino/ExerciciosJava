package exercicio;

import java.util.Scanner;

public class revisao1 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		double preco, conta;
		int menu;
		
		System.out.println("Informe o valor do produto");;
		preco = sc.nextDouble();
		
		System.out.println("Informe a operação: \n1- A vista em dinheiro/cheque \n2- A vista no"
				+ " cartão de credito\n3- Em duas vezes sem juros\n4- Em tres vezes");
		menu = sc.nextInt();
		
		switch(menu) {
		
		case 1:
			
			conta = preco * 0.20;
			conta = preco - conta;
			System.out.println("Valor a ser pago com 20% de desconto: "+ conta);
			break;
		case 2:
			conta = preco * 0.15;
			conta = preco - conta;
			System.out.println("Valor a ser pago com 15% de desconto: " + conta);
			break;
		case 3:
			System.out.println("Valor a ser pago: " + (preco/2) + " reais Duas vezes.");
			break;
		case 4:
			conta = preco * 0.10;
			conta = preco + conta;
			System.out.println("Valor a ser pago: "+ (Math.round(conta/3))+" reais Tres vezes. ");
			break;
		default:
			System.out.println("Opção Invalida");
			break;
			
		}
	}

}
