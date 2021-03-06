package Exercicios;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer n?mero inteiro entre 1 a 10.
O usu?rio deve informar de qual numero ele deseja ver a tabuada.
A sa?da deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

public class Tabuada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual numero deseja ver a tabuada?");
		int tabuada = scan.nextInt();

		System.out.println("Com for: ");

		for (int i = 1; i < 11; i++) {
			System.out.println(tabuada + " X " + i + " = " + tabuada * i);
		}

		/*int count = 1;

		System.out.println("Com Do-While: ");
		do {
			System.out.println(tabuada + " X " + count + " = " + tabuada * count);
			count++;
		} while (count < 11);*/

	}

}
