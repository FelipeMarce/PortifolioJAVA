//Simula um sistema de caixa eletronico, dando a opção de depositar, sacar, consultar saldo ou sair do sistema.
import java.util.Scanner;

public class Caixa_Eletronico {

	public static void main(String[] args) {

		int saldo = 1000;
		int valor = 0;
		int opcao = 0;

		Scanner scanner = new Scanner(System.in);

		while (opcao != 4) {
			System.out.print("\n== CAIXA ELETRÔNICO ==\n");
			System.out.print("1. Depositar\n");
			System.out.print("2. Sacar\n");
			System.out.print("3. Consultar Saldo\n");
			System.out.print("4. Sair\n");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Digite o valor a ser depositado: ");
				valor = scanner.nextInt();
				saldo += valor;
				System.out.print("Deposito realizado com sucesso: \n");
				break;

			case 2:
				System.out.print("Digite o valor a ser sacado: ");
				valor = scanner.nextInt();

				if (valor <= saldo) {
					saldo -= valor;
					System.out.print("Saque realizado com sucesso :)\n");
				} else {
					System.out.print("Saldo insuficiente para realizar o saque.\n");
				}
				break;

			case 3:
				System.out.print("Seu saldo atual é: " + saldo + "\n");
				break;

			case 4:
				System.out.print("Saindo, obrigado por usar o Caixa Eletronico :)\n");
				break;

			default:
				System.out.print("Opção inválida, Tente novamente :(\n");
			}
		}
		scanner.close();
	}

}