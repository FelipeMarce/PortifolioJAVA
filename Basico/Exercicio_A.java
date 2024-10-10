/*Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba
em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas: F = C * 1.8 + 32; K = C +
273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67*/

import java.util.Scanner;

public class Exercicio_A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a temperatura em graus Celsius: ");
		double temp = sc.nextDouble();

		System.out.printf("Temperatura em Kelvin: %.2f\n", temp + 273.15);
		System.out.printf("Temperatura em Réaumur: %.2f\n", temp * 0.8);
		System.out.printf("Temperatura em Ranikne: %.2f\n", temp * 1.8 + 32 + 459.67);
		System.out.printf("Temperatura em Fahrenheit: %.2f\n", temp * 1.8 + 32);

		sc.close();
	}

}
