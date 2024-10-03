/*Exercício B - Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste
círculo com quatro casas decimais conforme exemplos.
Fórmula da área: area = π . raio²
Considere o valor de π = 3.14159*/
import java.util.Scanner;
public class B_Raio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		double raio, area = 0.0;

		System.out.print("Qual o valor do raio: ");
		raio = scanner.nextDouble();

		area = (raio * raio) * 3.14159;


		System.out.printf("Área do círculo: %.4f", area);

		scanner.close();
	}

}
