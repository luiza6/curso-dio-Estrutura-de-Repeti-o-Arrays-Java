package Exercicios;

import java.util.Scanner;

/*
Fa�a um programa que pe�a N n�meros inteiros,
calcule e mostre a quantidade de n�meros pares
e a quantidade de n�meros impares.
*/

public class ParEImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantos numeros deseja comparar?");
		int quantidadeDeNumeros = scan.nextInt();

		int numerosPares = 0;
		int numerosImpares = 0;
		int count = 0;

		System.out.println("Digite os numeros: ");

		do {
			double numeros = scan.nextDouble();
			count++;

			if (numeros % 2 == 0)
				numerosPares++;
			else
				numerosImpares++;

		} while (count < quantidadeDeNumeros);

		System.out.println(
				"Quantiade de numeros pares: " + numerosPares + " / Quantidade de numeros impares: " + numerosImpares);

	}

}
