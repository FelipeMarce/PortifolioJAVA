/*O código lê um valor inteiro X. Em seguida mostra os
ímpares de 1 até X.*/
import java.util.Scanner;

public class Exe_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int x = sc.nextInt();
		if (x >= 1 && x <= 1000) {
			for (int i = 1; i <= x; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}

		} else {
			System.out.println("Valor muito alto ou muito baixo!");
		}
		sc.close();
	}

}
