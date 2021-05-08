package nomes_ordem_invertida_30_04_21;

import java.util.Scanner;

public class nomes_ordem_invertida_30_04_21 {

	public static void main(String[] argrs) {

		String saida, nomes[] = new String[10];
		int i;

		Scanner teclado = new Scanner(System.in);

		for (i = 0; i < nomes.length; i++) {
			System.out.println("Digite o " + (i + 1) + "° nome: ");
			nomes[i] = teclado.nextLine();
		}
		
		for (i = 0; i < nomes.length; i++) {

			for (int j = 0; j < i; j++) {
				saida = nomes[i];
				nomes[i] = nomes[j];
				nomes[j] = saida;
			}
		}

		for (i = 0; i < nomes.length; i++) {
			System.out.println((i + 1) + "° nome: " + nomes[i]);
		}
		
		teclado.close();
		
	}
}