/*De acordo com as informações que o usuario inserir será gerado um relatorio de acordo com o seu IMC gerado de uma operação feita pelo código.*/
import java.util.Scanner;

public class Calc_IMC {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int idade = 0;
		char sexo = 0;
		double peso, altura;
		String nome;

		System.out.print("Digite seu nome: ");
		nome = scanner.nextLine();

		System.out.print("Digite o seu sexo como 'H' para homem ou 'M' para mulher: ");
		sexo = scanner.next().charAt(0);

		while (sexo != 'M' && sexo != 'H') {
			System.out.print("Infomação invalida! \nDigite novamente seu sexo: ");
			sexo = scanner.next().charAt(0);
		}

		System.out.print("Digite a sua idade: ");
		idade = scanner.nextInt();

		while (idade <= 0) {
			System.out.print("Infomação invalida! \nDigite a sua idade: ");
			idade = scanner.nextInt();
		}

		System.out.print("Digite o seu peso: ");
		peso = scanner.nextDouble();

		while (peso <= 0) {
			System.out.print("Infomação invalida! \nDigite a seu peso: ");
			peso = scanner.nextDouble();
		}

		System.out.print("Digite a sua altura: ");
		altura = scanner.nextDouble();

		while (altura <= 0) {
			System.out.print("Infomação invalida! \nDigite a sua altura: ");
			altura = scanner.nextInt();
		}

		double imc = peso / (altura * altura);

		if (imc > 0 && imc < 18.5) {
			System.out.printf(nome + ", seu IMC é %.2f: abaixo do peso.", imc);
		} else if (imc >= 18.6 && imc <= 24.9) {
			System.out.printf(nome + ", seu IMC é %.2f: peso ideal! (parabéns).", imc);
		} else if (imc >= 25.0 && imc <= 29.9) {
			System.out.printf(nome + ", seu IMC é %.2f: levemente acima do peso.", imc);
		} else if (imc >= 30.0 && imc <= 34.9) {
			System.out.printf(nome + ", seu IMC é %.2f: obesidade grau I.", imc);
		} else if (imc >= 35.0 && imc <= 39.9) {
			System.out.printf(nome + ", seu IMC é %.2f: obesidade grau II (severa).", imc);
		} else if (imc >= 40.0) {
			System.out.printf(nome + ", seu IMC é %.2f: obesidade grau III (mórbida).", imc);
		} else {

			System.out.print("Infomação invalida! Digite novamente seus dados.");
		}

		scanner.close();
	}

}
