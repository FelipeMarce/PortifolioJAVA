
/*Faça um programa que leia um número inteiro N maior do que zero e calcule o fatorial desse
número. Fatorial de N é representado por N! e calculado da seguinte maneira: N! = N * (N − 1) * (N − 2) *...* 
3 * 2 * 1 Utilize o laço que lhe for mais conveniente.*/
import java.util.Scanner;

public class Exercicio_G {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num, fatorial = 1;

		System.out.print("Digite um número maior que 0: ");
		num = sc.nextInt();

		while (num == 0) {
			System.out.println("Número invalido, digite novamente.");
			System.out.print("Digite um número maior que 0: ");
			num = sc.nextInt();
		}

		for (int i = 1; i <= num; i++) {
			fatorial *= i;
		}

		System.out.print(num + "! = " + fatorial);

		sc.close();

	}

}
