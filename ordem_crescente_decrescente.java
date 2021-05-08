package ordem_crescente_decrescente_07_05_21;

import java.util.Scanner;

public class ordem_crescente_decrescente {
	
	public static void main(String[] argrs) {
		
		
		int i, j, aux, crescente[] = new int[10], decrescente[] = new int[10];
		
		Scanner teclado = new Scanner(System.in);
		
		for (i = 0; i < crescente.length; i++) {
			System.out.println("Digite o " + (i + 1) + "° número: ");
			crescente[i] = teclado.nextInt();
			decrescente[i] = crescente[i];
			
			for (j = 0; j < i; j++) {
				if(crescente[i] < crescente[j]){  
                    aux = crescente[j];
                    crescente[j] = crescente[i];  
                    crescente[i] = aux;
                }  
			}
			
			for (j = 0; j < i; j++) {
				if(decrescente[i] > decrescente[j]){  
                    aux = decrescente[j];
                    decrescente[j] = decrescente[i];  
                    decrescente[i] = aux;
                }  
			}
		}
		
		System.out.println("----------------------------");
		
		for (i = 0; i < crescente.length; i++) {
			System.out.println("O " + (i + 1) + "° número em ordem crescente é " + crescente[i]);
		}
		
		System.out.println("----------------------------");
		
		for (i = 0; i < decrescente.length; i++) {
			System.out.println("O " + (i + 1) + "° número em ordem decrescente é " + decrescente[i]);
		}
		
		System.out.println("----------------------------");
		
		teclado.close();
	}
}