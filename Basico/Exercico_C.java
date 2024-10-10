
/*Informar um saldo e imprimir o saldo com reajuste de 1%*/
import java.util.Scanner;

public class Exercico_C {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Insira um saldo: ");
		double saldo = sc.nextDouble();

		System.out.printf("Novo salário: %.2f", saldo + (saldo * 0.01));

		sc.close();

	}

}
