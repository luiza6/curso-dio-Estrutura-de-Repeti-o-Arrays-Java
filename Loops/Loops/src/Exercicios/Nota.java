package Exercicios;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

public class Nota {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Abertura da entrada de fluxo de dados através do teclado

		System.out.println("Digite uma nota de 0 a 10: ");
		int nota = scan.nextInt();

		while (nota < 0 || nota > 10) {
			System.out.println("Nota Invádide. Digite Novamente: ");
			nota = scan.nextInt();
		}

		System.out.println("Nota: " + 10);

	}

}
