
/*Calcular e mostrar a medida aritmetica dos número pares compreendidos entre 13 e 73. 
 * Utilize o laço que lhe for mais conveniente.*/
import java.util.Scanner;

public class Exercicio_H {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int soma = 0, par = 0;

		for (int i = 13; i <= 73; i++) {
			if (i % 2 == 0) {
				soma = soma + i;
				par++;
			}
		}

		System.out.print("Quantidade de números pares: " + par + "\nSoma total dos números pares: " + soma
				+ "\nMédia aritmetica dos números: " + soma / par);

		sc.close();

	}

}
