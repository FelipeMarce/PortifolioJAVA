//O código solicita duas entradas de dados e depois as soma e exibi o resultado da soma
import java.util.Scanner;

public class A_somando {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Solicita o primeiro número ao usuário
		System.out.print("Digite o primeiro número: ");
		double num1 = scanner.nextDouble();

		// Solicita o segundo número ao usuário
		System.out.print("Digite o segundo número: ");
		double num2 = scanner.nextDouble();

		// Calcula a soma dos números
		double result = num1 + num2;

		// Exibe o resultado de forma explicativa
		System.out.println("A soma de " + num1 + " e " + num2 + " é: " + result);

		// Fecha o scanner
		scanner.close();
	}
}
