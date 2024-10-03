/*
  Exercício D - Fazer um programa para ler o código da peça1, a quantidade que está levando desta peça1, o
valor unitário da peça1, o código de uma peça 2, a quantidade que está levando desta peças2 e o valor unitário
de cada peça 2.
Calcule e mostre o valor a ser pago.
 */
import java.util.Scanner;
public class D_unitario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Forneça o código da peça 1: ");
		scanner.nextInt();

		System.out.print("Digite a quantidade de peças 1: ");
		int quantidade1 = scanner.nextInt();

		System.out.print("Valor unitário de peças 1: ");
		double valor_unitario1 = scanner.nextDouble();

		System.out.print("\nForneça o código da peça 2: ");
		scanner.nextInt();

		System.out.print("Digite a quantidade de peças 2: ");
		int quantidade2 = scanner.nextInt();

		System.out.print("Valor unitário de peças 2: ");
		double valor_unitario2 = scanner.nextDouble();

		double valor = (quantidade1 * valor_unitario1) + (quantidade2 * valor_unitario2);

		System.out.printf("\nValor a pagar: R$ %.2f", valor);

		scanner.close();

	}

}
