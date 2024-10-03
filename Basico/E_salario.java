/*Exercício E - Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o
valor que recebe por hora e calcula o salário desse funcionário.
A seguir, mostre o número e o salário do funcionário, com duas casas decimais.*/
  import java.util.Scanner;

public class E_salario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaração das variáveis
        int funcionario;
        double horasTrabalhadas, valorHora, resultado;

        // Leitura dos dados
        System.out.print("Digite o número do funcionário: ");
        funcionario = scanner.nextInt();

        System.out.print("Digite as horas trabalhadas: ");
        horasTrabalhadas = scanner.nextDouble();

        System.out.print("Valor que recebe por hora: ");
        valorHora = scanner.nextDouble();

        // Cálculo do salário
        resultado = horasTrabalhadas * valorHora;

        // Exibe o resultado
        System.out.printf("O funcionário %d receberá R$ %.2f%n", funcionario, resultado);
        
        // Fecha o scanner
        scanner.close();
    }
}

