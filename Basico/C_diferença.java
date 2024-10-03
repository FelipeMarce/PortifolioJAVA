
//Fazer um programa para ler quatro valores inteiros A, B, C e D.
//A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula:
//DIFERENCA = (A * B - C * D).
import java.util.Scanner;

public class C_diferença {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaração das variáveis
        int A, B, C, D, valor1, valor2, diferença;

        // Leitura dos valores
        System.out.print("Digite o valor de A: ");
        A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        B = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        C = scanner.nextInt();

        System.out.print("Digite o valor de D: ");
        D = scanner.nextInt();

        // Cálculo da diferença
        valor1 = A * B;
        valor2 = C * D;
        diferença = valor1 - valor2;

        // Exibe o resultado
        System.out.printf("Diferença = %d%n", diferença);

        // Fecha o scanner
        scanner.close();
    }
}

