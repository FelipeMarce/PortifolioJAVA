
/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura
de senha incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada
corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a
senha correta é o valor 2002. Utilize o laço que lhe for mais conveniente.*/
import java.util.Scanner;

public class Exercicio_E {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int senha = 2002, cont = 2;

		System.out.print("Digite a sua senha: ");
		senha = sc.nextInt();
		while (senha != 2002 && cont != 0) {
			System.out.print("Acesso negado você tem mais " + cont-- + " tentativas.\nDigite a sua senha:");
			senha = sc.nextInt();
		}
		if (senha == 2002)
			System.out.print("Acesso permitido.");
		else {
			System.out.print("Acesso negado.");
		}

		sc.close();

	}

}
