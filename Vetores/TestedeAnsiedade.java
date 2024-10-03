/* Crie um programa chamado 'Teste de Ansiedade' onde o usuário responderá
 * 10 perguntas específicas para o resultado final. O usuário pode responder 
 * apenas 'sim' ou 'não' para cada pergunta.
 * 
 *  Se o usuário responder 'sim' em sete perguntas ou mais, a impressão será:
 * "Você possui fortes indícios de ansiedade. Faça terapia."
 *  
 *  Se o usuário responder 'sim' em menos de cinco perguntas a impressão será:
 * "Você está aparentemente bem e sem riscos de ansiedade."
 * 
 *  Se o usuário responder 'sim' em cinco ou seis perguntas a impressão será:
 * "Você precisa cuidar do corpo e da mente. Procure orientação médica."
 * 
 *  As perguntas específicas são:
 * 
 * 1. Você se sente com dificuldade de concentração?
 * 2. Você se sente cansado facilmente?
 * 3. Tem dificuldade em adormecer ou permanecer a dormir?
 * 4. Você se preocupa muito com o futuro? 
 * 5. Tem difilcudade em relaxar?
 * 6. Sentiu-se tão preocupado que foi dificil ficar parado?
 * 7. Sentiu-se facilmente irritável ou chateado?
 * 8. Sentiu medo como se algo muito ruim fosse acontecer?
 * 9. Você se preocupa com a opinião dos outros?
 * 10. Você está com dificuldade em lembrar de detalhes?
 */

import java.util.Scanner;

public class TestedeAnsiedade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sim = 0;

		String[] pergunta = { "1. Você se sente com dificuldade de concentração?",
				"2. Você se sente cansado facilmente?", "3. Tem dificuldade em adormecer ou permanecer a dormir?",
				"4. Você se preocupa muito com o futuro?", "5. Tem difilcudade em relaxar?",
				"6. Sentiu-se tão preocupado que foi dificil ficar parado?",
				"7. Sentiu-se facilmente irritável ou chateado?",
				"8. Sentiu medo como se algo muito ruim fosse acontecer?",
				"9. Você se preocupa com a opinião dos outros?",
				"10. Você está com dificuldade em lembrar de detalhes?" };

		for (String perguntas : pergunta) {
			System.out.print(perguntas + "\nResponda com 'sim' ou 'não': ");
			String resposta = sc.nextLine();

			if (resposta.equalsIgnoreCase("sim")) {
				sim++;
			} else {
				while (!resposta.equalsIgnoreCase("sim") && !resposta.equalsIgnoreCase("não")) {
					System.out.println("Resposta invalida!");
					System.out.print(perguntas + "\nResponda com 'sim' ou 'não': ");
					resposta = sc.nextLine();
				}
			}
			System.out.print("\n");
		}
		if (sim >= 7) {
			System.out.println("Você possui fortes indícios de ansiedade. Faça terapia.");
		} else if (sim < 5) {
			System.out.println("Você está aparentemente bem e sem riscos de ansiedade.");
		} else {
			System.out.println("Você precisa cuidar do corpo e da mente. Procure orientação médica.");
		}
		sc.close();

	}
}