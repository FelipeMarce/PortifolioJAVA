/*Exercício 5 - Fazer um programa para ler um número inteiro positivo N. O
programa deve então mostrar na tela N linhas, começando de 1 até N. Para cada
linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo.*/

import java.util.Scanner;

public class Exe_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;

		System.out.print("Digite um número inteiro positivo: ");
		n = sc.nextInt();

		if (n > 0) {
			for (int i = 1; i <= n; i++) {

				System.out.print(i + " ");
				System.out.print(i * i + " ");
				System.out.println(i * i * i + " ");

			}
		} else {
			System.out.print("Número inválido. Digite novamente!");
		}

		sc.close();

	}
}
