
/*Crie um programa que armazene 10 números inteiros e então determine e exiba o maior e o menor
 * número digitado*/
import java.util.Scanner;

public class Exercicio_I {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] num = new int[10];
		int maior = 0, menor = 999999999;

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o número " + (i + 1) + ": ");
			num[i] = sc.nextInt();

			if (num[i] <= menor) {
				menor = num[i];
			}
			if (num[i] >= maior) {
				maior = num[i];
			}
		}

		System.out.print("O maior número é: " + maior + "\nO menor número é: " + menor);
		sc.close();

	}

}
