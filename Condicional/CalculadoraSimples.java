//Calculadora simples com diferentes operadores aritmetcos como opção de operação utilizando o caso - escolha(switch - case)
import java.util.Scanner;

public class CalculadoraSimples {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int opcao = 0;
		double num1 = 0;
		double num2 = 0;
		double total = 0;

			while (opcao != 5) {
				System.out.print("\n **** CALCULADORA SIMPLES **** \n");
				System.out.println("1 - Adição");
				System.out.println("2 - Subtração");
				System.out.println("3 - Multiplicação");
				System.out.println("4 - Divisão");
				System.out.println("5 - Sair");
				System.out.print("Escolha uma opçao: ");
				opcao = scanner.nextInt();

				switch (opcao) {
				case 1:
					System.out.print("Digite o primeiro número: ");
					num1 = scanner.nextDouble();
					System.out.print("Digite o segundo número: ");
					num2 = scanner.nextDouble();
					total = num1 + num2;
					System.out.print("O resultado de " + num1 + " + " + num2 + " = " + total + ".\n");
					break;

				case 2:
					System.out.print("Digite o primeiro número: ");
					num1 = scanner.nextDouble();
					System.out.print("Digite o segundo número: ");
					num2 = scanner.nextDouble();
					total = num1 - num2;
					System.out.print("O resultado de " + num1 + " - " + num2 + " = " + total + ".\n");
					break;

				case 3:
					System.out.print("Digite o primeiro número: ");
					num1 = scanner.nextDouble();
					System.out.print("Digite o segundo número: ");
					num2 = scanner.nextDouble();
					total = num1 * num2;
					System.out.print("O resultado de " + num1 + " x " + num2 + " = " + total + ".\n");
					break;

				case 4:
					System.out.print("Digite o primeiro número: ");
					num1 = scanner.nextDouble();
					System.out.print("Digite o segundo número: ");
					num2 = scanner.nextDouble();

					if (num2 == 0) {
						System.out.print("Erro! Insira outro número, não é possivel dividir por 0.\n");
					} else {
						total = num1 / num2;
						System.out.print("O resultado de " + num1 + " ÷ " + num2 + " = " + total + ".\n");
					}
					break;

				case 5:
					System.out.print("Operações encerradas. Volte sempre!");
					break;

				default:
					System.out.print("Opção inexistente! Tente novamente.");

				}

			}
			scanner.close();
		}
	}
