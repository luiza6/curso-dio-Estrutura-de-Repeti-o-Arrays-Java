package Exercicios;

import java.util.Scanner;

/*
Fa�a um programa que pe�a uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inv�lido
e continue pedindo
at� que o usu�rio informe um valor v�lido.
*/

public class Nota {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Abertura da entrada de fluxo de dados atrav�s do teclado

		System.out.println("Digite uma nota de 0 a 10: ");
		int nota = scan.nextInt();

		while (nota < 0 || nota > 10) {
			System.out.println("Nota Inv�dide. Digite Novamente: ");
			nota = scan.nextInt();
		}

		System.out.println("Nota: " + 10);

	}

}
