/*Leia um valor inteiro N. Este valor será a quantidade de valores
inteiros X que serão lidos em seguida. Mostre quantos destes valores X estão
dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
informações conforme exemplo (use a palavra “dentro” e “fora”).*/

import java.util.Scanner;

public class Exe_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int dentro = 0, fora = 0, a = 1;
		
		System.out.print("Digite o valor de N: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite o "+ a++ + "° valor: ");
			int x = sc.nextInt();

			if (x >= 10 && x <= 20) {
				 dentro++;
			}
			else {
				fora++;
			}
		}
		
		System.out.println("Dentro: " + dentro + "\nFora: " + fora);

		sc.close();

	}

}
