package Exercicios;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
a soma dos numeros
e a média desses números.
*/

public class MaiorEMedia {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int count = 0;
		int soma = 0;
		int maior = 0;
		int media = 0;

		System.out.println("Informe 5 números: ");

		do {
			int numero = scan.nextInt();
			if (numero > maior)
				maior = numero;
			soma += numero;
			count++;
		} while (count < 5);

		System.out.println("Soma: " + soma);
		System.out.println("Maior: " + maior);
		System.out.println("Média: " + soma / 5);
	}
}
