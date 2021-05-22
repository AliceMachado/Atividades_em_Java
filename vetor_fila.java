package vetor_fila_30_04_21;

import java.util.Scanner;

public class vetor_fila {

	public static void main(String[] argrs) {
		
		Scanner teclado = new Scanner(System.in);

		String nome[] = new String[20], nome2[] = new String[19], descricao[] = new String[20], descricao2[] = new String[19], exe = "S";
		int menu = 0, i;
		Object  idade[] = new Object[20], idade2[] = new Object[19];

		while (exe.equals("S") || exe.equals("s")) {
		
			System.out.println("-----------Menu-----------");
			System.out.println("1 - Incluir paciente");
			System.out.println("2 - Atender paciente");
			System.out.println("3 - sair");
			System.out.println("--------------------------");
			System.out.println("Digite uma opção do menu acima: ");
			menu = teclado.nextInt();
			
			switch (menu) {
	
			case 1:
				for (i = 0; i < 20; i++) {
					
					teclado.nextLine();
					System.out.println("Digite o nome do " + (i + 1) + "° paciente:");
					nome[i] = teclado.nextLine();
					
					System.out.println("Digite uma breve descrição da condição do " + (i + 1) + "° paciente:");
					descricao[i] = teclado.nextLine();
					
					System.out.println("Digite a idade do " + (i + 1) + "° paciente:");
					idade[i] = teclado.nextInt();
				}
			break;
	
			case 2:
				System.out.println("Lista dos pacientes: ");
				for (i = 0; i < 20; i++) {
					System.out.println(nome[i]);
				}
				
				System.out.println("O paciente " + nome[0] + ", com " + idade[0] + " anos "
						+ "\ne com o problema " + descricao[0] + " foi atendido!");
				
				for (i = 0; i < 19; i++) {
					nome2[i] = nome[i + 1];
					descricao2[i] = descricao[i + 1];
					idade2[i] = idade[i + 1];
					
					nome[i] = nome2[i];
					descricao[i] = descricao2[i];
					idade[i] = idade2[i];
				}
				
				nome[19] = null;
				idade[19] = null;
				descricao[19] = null;
				
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