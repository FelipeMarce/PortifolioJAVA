/*Criar um programa que calcule a média de salários de uma empresa, pedindo ao usuário a grade
de funcionários e os salários, e devolvendo a média salarial.*/

import java.util.Scanner;

public class Exercicio_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double salario, total = 0;

		System.out.print("Digite a quantidade de funcionários: ");
		int funcionarios = sc.nextInt();

		for (int i = 0; i < funcionarios; i++) {
			System.out.print("Digite um salário: ");
			salario = sc.nextDouble();
			total = salario + total;
		}

		System.out.printf("Média dos salários: %.2f ", total / funcionarios);

		sc.close();
	}
}
