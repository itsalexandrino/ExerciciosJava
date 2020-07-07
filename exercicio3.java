package exercicio;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int idade;

		System.out.println("Informe a idade: ");

		idade = sc.nextInt();

		if (idade >= 10 && idade <= 14) {

			System.out.println("Sua idade: " + idade + " esta na categoria (infantil)");

		} else if (idade >= 15 && idade <= 17) {
			System.out.println("Sua idade: " + idade + " esta na categoria (juvenil)");
		} else if (idade >= 18 && idade <=25){
			System.out.println("Sua idade: " + idade + " esta na categoria (adulto)");
		}else {
			System.out.println("Valor invalido");
		}

	}

}
