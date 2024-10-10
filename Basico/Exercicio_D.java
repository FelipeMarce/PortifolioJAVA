
/*Desenvolva um algoritmo em Java que leia um número inteiro e imprima
o seu antecessor e seu sucessor.*/
import java.util.Scanner;

public class Exercicio_D {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int num = sc.nextInt();

		System.out.println("Seu número é: " + num);
		System.out.println("O antecessor é: " + (num - 1));
		System.out.println("O sucessor: " + (num + 1));

		sc.close();
	}

}
