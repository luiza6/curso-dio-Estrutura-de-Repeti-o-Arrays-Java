package Exercicios;

import java.util.Scanner;

/*
Fa�a um programa que leia 5 n�meros
e informe o maior n�mero
a soma dos numeros
e a m�dia desses n�meros.
*/

public class MaiorEMedia {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int count = 0;
		int soma = 0;
		int maior = 0;
		int media = 0;

		System.out.println("Informe 5 n�meros: ");

		do {
			int numero = scan.nextInt();
			if (numero > maior)
				maior = numero;
			soma += numero;
			count++;
		} while (count < 5);

		System.out.println("Soma: " + soma);
		System.out.println("Maior: " + maior);
		System.out.println("M�dia: " + soma / 5);
	}
}
