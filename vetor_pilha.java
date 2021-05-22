package vetor_pilha_10_05_21;

import java.util.Scanner;

public class vetor_pilha {

	public static void main(String[] argrs) {
		
		Scanner teclado = new Scanner(System.in);
		
		int i, menu;
		Object altura_caixa[] = new Object[4], largura_caixa[] = new Object[4], profundidade_caixa[] = new Object[4];
		String fragil[] = new String[4], desem = "";
		String exe = "S", id_caixa[] = new String[4];
		
		
		while (exe.equals("S") || exe.equals("s")) {
			
			System.out.println("-----------Menu-----------");
			System.out.println("1 - Empilhar caixas");
			System.out.println("2 - Desempilhar caixa");
			System.out.println("3 - sair");
			System.out.println("--------------------------");
			System.out.println("Digite uma opção do menu acima: ");
			menu = teclado.nextInt();
			
			switch (menu) {
	
			case 1:
				for (i = 0; i < 4; i++) {
					
					teclado.nextLine();
					System.out.println("Digite a identificação da " + (i + 1) + "° caixa: ");
					id_caixa[i] = teclado.nextLine();
					
					System.out.println("Digite a altura da " + (i + 1) + "° caixa: ");
					altura_caixa[i] = teclado.nextDouble();
					
					System.out.println("Digite a largura da " + (i + 1) + "° caixa: ");
					largura_caixa[i] = teclado.nextDouble();
					
					System.out.println("Digite a profundidade da " + (i + 1) + "° caixa: ");
					profundidade_caixa[i] = teclado.nextDouble();
					teclado.nextLine();
					
					System.out.println("Digite 'S' se a " + (i + 1) + "° caixa é frágil, ou 'N' se não for frágil: ");
					fragil[i] = teclado.next();
					if (fragil[i].equals("S") || fragil[i].equals("s")) {
						fragil[i] = "é frágil";
					}else {
						fragil[i] = "não é frágil";
					}
					
				}
			break;
	
			case 2:
				System.out.println("Pilha das caixas: ");
				for (i = 0; i < 4; i++) {
					System.out.println(id_caixa[i]);
				}
				//Posso colocar um while com um break no final do for para testar
				for (i = 4 - 1; i >= 0; i--) {
					if (id_caixa[i] == null) {
						System.out.println("A caixa " + id_caixa[i + 1] + ", com " + largura_caixa[i + 1] + " cm de largura, com " + altura_caixa[i + 1] + " cm de altura,"
								+ "\ncom " + profundidade_caixa[i + 1] + " cm de profundidade " + fragil[i + 1] + ", foi desempilhada!");
						id_caixa[i - 1] = null;
						largura_caixa[i - 1] = null;
						altura_caixa[i - 1] = null;
						profundidade_caixa[i - 1] = null;
						fragil[i - 1] = null;
					} else {
						System.out.println("A caixa " + id_caixa[i] + ", com " + largura_caixa[i] + " cm de largura, com " + altura_caixa[i] + " cm de altura,"
								+ "\ncom " + profundidade_caixa[i] + " cm de profundidade " + fragil[i] + ", foi desempilhada!");
						id_caixa[i] = null;
						largura_caixa[i] = null;
						altura_caixa[i] = null;
						profundidade_caixa[i] = null;
						fragil[i] = null;	
					}
					System.out.println("Deseja desempilhar mais uma caixa?\nDigite 'S' para continuar e 'N' para parar");
					desem = teclado.next();
					if (desem.equals("N") || desem.equals("n")) {
						break;
					}
				}
				
			break;
	
			case 3:
				System.out.println("O programa foi encerrado!");
				System.exit(0);
			break;
	
			default: System.out.println("Número digitado inválido!");
				break;
			}
			
			System.out.println("Deseja executar novamente?\nDigite 'S' para sim, e 'N' para não: ");
			exe = teclado.next();
		}
		
		teclado.close();
	}
}