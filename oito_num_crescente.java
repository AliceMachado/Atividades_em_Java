package oito_num_crescente_06_05_21;

import java.util.Scanner;

public class oito_num_crescente {
	
	public static void main(String[] argrs) {
		
		int i, j, aux, crescente[] = new int[8];
		
		Scanner teclado = new Scanner(System.in);
		
		for (i = 0; i < crescente.length; i++) {
			System.out.println("Digite o " + (i + 1) + "° número: ");
			crescente[i] = teclado.nextInt();
			
			for (j = 0; j < i; j++) {
				if(crescente[i] < crescente[j]){  
                    aux = crescente[j];
                    crescente[j] = crescente[i];  
                    crescente[i] = aux;
                }  
			}
		}
		
		for (i = 0; i < crescente.length; i++) {
			System.out.println("O " + (i + 1) + "° número é " + crescente[i]);
		}
		
		teclado.close();
	}
}