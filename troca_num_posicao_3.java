package troca_num_posicao_3_06_05_21;

import java.util.Scanner;

public class troca_num_posicao_3 {
	
	public static void main(String[] argrs) {
		
		double num[] = new double[5];
		int i;
		
		Scanner teclado = new Scanner(System.in);

		for (i = 0; i < num.length; i++) {
			
			System.out.println("Digite o " + (i + 1) + "° número: ");
			num[i] = teclado.nextDouble();
			
		}
		
		num[3] = 100;
		
		for (i = 0; i < num.length; i++) {
			
			System.out.println("O valor da " + (i + 1) + "° posição é " + num[i]);
			
		}
		
		teclado.close();
	}
}