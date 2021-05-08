package cinco_num_30_04_21;

import java.util.Scanner;

public class cinco_num_30_04_21 {
	
	public static void main(String[] argrs) {
		
		double num[] = new double [5];
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < num.length; i++) {
			
			System.out.println("Digite um número: ");
			num[i] = teclado.nextDouble();
			
		}
		
		for (int i = 0; i < num.length; i++) {
			
			System.out.println("Resultado: " + num[i]);
			
		}
		
		teclado.close();
	}
}
