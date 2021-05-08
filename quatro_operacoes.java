package quatro_operacoes_07_05_21;

import java.util.Scanner;

public class quatro_operacoes {
	
	public static void main(String[] argrs) {
		
		double n1[] = new double[5], n2[] = new double[5], resultado[] = new double[5];
		int i, a;
		
		Scanner teclado = new Scanner(System.in);
		
		for (i = 0; i < n1.length; i++) {
			System.out.println("Digite o " + (i + 1) + "° número da primeira coluna: ");
			n1[i] = teclado.nextDouble();
		}
		
		for (i = 0; i < n2.length; i++) {
			System.out.println("Digite o " + (i + 1) + "° número da segunda coluna coluna: ");
			n2[i] = teclado.nextDouble();
		}
		
		System.out.println("----------menu----------");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Divisão");
		System.out.println("4 - Multiplicação");
		System.out.println("------------------------");
		System.out.println("Escolha entre as opções acima para realizar a opção desejada: ");
		a = teclado.nextInt();
		
		switch (a) {
		
		case 1:
			for (i = 0; i < resultado.length; i++) {
				resultado[i] = n1[i] + n2[i];
			}
			break;
		
		case 2:
			for (i = 0; i < resultado.length; i++) {
				resultado[i] = n1[i] - n2[i];
			}
			break;
			
		case 3:
			for (i = 0; i < resultado.length; i++) {
				resultado[i] = n1[i] / n2[i];
			}
			break;
		
		case 4:
			for (i = 0; i < resultado.length; i++) {
				resultado[i] = n1[i] * n2[i];
			}
			break;
			
		default: System.out.println("Número digitado inválido!");
		break;
			
		}
		
		for (i = 0; i < resultado.length; i++) {
			System.out.println("O resultado da " + (i + 1) + "ª operação é " + resultado[i]);
		}
		
		teclado.close();
	}
}