//Jogo de perguntas e respostas
import java.util.Scanner;
public class JogodoMilhao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String nome;
		int idade;
		char resposta;
		
		System.out.print("Digite seu nome: ");
		nome = scanner.nextLine();
		
		System.out.print("Digite sua idade: ");
		idade = scanner.nextInt();
		
		if(idade >= 18) {
			System.out.print("Vamos lá...");
		} else {	
			System.out.print("Menor de idade. Você não pode jogar.");
			return;
		}
		
		System.out.println("BEM - VINDO AO SHOW DO MILHÃO " + nome + "!\n");
		System.out.println("Regras: 10 perguntas com 4 alternativas. Para responder, digite no teclado a letra desejada (em minúsculo)");
		System.out.println("Se você acertar todas ganha o jogo! Se errar uma, perderá o jogo.");
		
		System.out.print("1- Qual operador é classificado a função 'soma' (+).\n(a) Operador lógico.\n(b) Operador relacional.\n(c) Operador aritmético.\n(d) Nenhuma das alternativas acima.\nResposta: ");
		resposta = scanner.next().charAt(0);
		
		if(resposta == 'c') {
			System.out.println("Parabéns. Você acertou!\nPróxima pergunta.");
			
			System.out.print("\n2- Qual operador é classificado a função 'E' (&&).\n(a) Operador lógico.\n(b) Operador relacional.\n(c) Operador aritmético.\n(d) Nenhuma das alternativas acima.\nResposta: ");
			resposta = scanner.next().charAt(0);
			
			if(resposta == 'a') {
				System.out.println("Parabéns. Você acertou!\nPróxima pergunta.");
				
				System.out.print("\n3- Qual operador é classificado a função 'maior igual' (>=).\n(a) Operador lógico.\n(b) Operador relacional.\n(c) Operador aritmético.\n(d) Nenhuma das alternativas acima.\nResposta: ");
				resposta = scanner.next().charAt(0);
				
				if(resposta == 'b') {
					System.out.println("Parabéns. Você acertou!\nPróxima pergunta.");
					
					System.out.print("\n4- A função 'limpa' no Portugol tem qual função.\n(a) Entrada de dados.\n(b) Saída de dados.\n(c) Operador aritmético.\n(d) Limpa o console.\nResposta: ");
					resposta = scanner.next().charAt(0);
					
					if(resposta == 'd') {
						System.out.println("Parabéns. Você acertou!\nPróxima pergunta.");
						
						System.out.print("\n5- A variável 'inteiro' no Portugol permite qual entrada de dados.\n(a) Dados lógicos, verdadeiro ou falso.\n(b) Números positivos ou negativos e não decimais.\n(c) Operadores aritméticos.\n(d) Letras.\nResposta: ");
						resposta = scanner.next().charAt(0);
						
						if(resposta == 'b') {
							System.out.println("Parabéns. Você acertou!\nPróxima pergunta.");
							
							System.out.print("\n6- A variável 'caracter' no Portugol permite qual entrada de dados.\n(a) Dados lógicos, verdadeiro ou falso.\n(b) Números positivos ou negativos e não decimais.\n(c) A primeira letra digitada.\n(d) Letras.\nResposta: ");
							resposta = scanner.next().charAt(0);
							
							if(resposta == 'c') {
								System.out.println("Parabéns. Você acertou!\nPróxima pergunta.");
								
								System.out.print("\n7- Como atribuir comentário de uma linha.\n(a) //.\n(b) /* */.\n(c) ().\n(d) ; .\nResposta: ");
								resposta = scanner.next().charAt(0);
								
								if(resposta == 'a') {
									System.out.println("Parabéns. Você acertou!\nPróxima pergunta.");
									
									System.out.print("\n8- Qual dessas funções no Portugol é uma entrada de dados.\n(a) Limpa ().\n(b) leia ().\n(c) escreva ().\n(d) leia {}.\nResposta: ");
									resposta = scanner.next().charAt(0);
									
									if(resposta == 'b') {
										System.out.println("Parabéns. Você acertou!\nPróxima pergunta.");
										
										System.out.print("\n9- A sintaxe 'para' no Portugol é qual tipo.\n(a) Operador lógico.\n(b) Estrutura condicional.\n(c) Operador relacional.\n(d) Laço de repetição.\nResposta: ");
										resposta = scanner.next().charAt(0);
										
										if(resposta == 'd') {
											System.out.println("Parabéns. Você acertou!\nPróxima pergunta.");
											
											System.out.print("\n10-Qual é a linguagem que você está aprendendo agora? \n(a)Java \n(b)Python \n(c)HTML \n(d)css\nResposta: ");
											resposta = scanner.next().charAt(0);
											
											if(resposta == 'a') {
												System.out.println("Parabéns. Você acertou! \n" + nome +"! Você ganhou 1 milhão de Reais!!!");
												
											}else {
												System.out.println("Resposta errada. Que pena você está desclassificado.");
											}
											
										}else {
											System.out.println("Resposta errada. Que pena você está desclassificado.");
										}
										
									}else {
										System.out.println("Resposta errada. Que pena você está desclassificado.");
									}
									
								}else {
									System.out.println("Resposta errada. Que pena você está desclassificado.");
								}
								
							}else {
								System.out.println("Resposta errada. Que pena você está desclassificado.");
							}
							
						}else {
							System.out.println("Resposta errada. Que pena você está desclassificado.");
						}
						
					}else {
						System.out.println("Resposta errada. Que pena você está desclassificado.");
					}
					
				}else {
					System.out.println("Resposta errada. Que pena você está desclassificado.");
				}
				
			}else {
				System.out.println("Resposta errada. Que pena você está desclassificado.");
			}
			
		} else {
			System.out.println("Resposta errada. Que pena você está desclassificado.");
		}
		
		scanner.close();
	}

}