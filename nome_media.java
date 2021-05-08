package vetor_nome_media;

import java.util.Scanner;

public class nome_media {
	
	public static void main(String[] argrs) {
		
		String nome[] = new String[5];
		int i;
		double n1, n2, n3, media_classe = 0, media[] = new double[5];
		
		Scanner teclado = new Scanner(System.in);
		
		for (i = 0; i < nome.length; i++) {
			System.out.println("Digite o " + (i + 1) + "° nome: ");
			nome[i] = teclado.nextLine();
			
			System.out.println("Digite a primeira nota do aluno " + nome[i] + ": ");
			n1 = teclado.nextDouble();
			
			System.out.println("Digite a segunda nota do aluno " + nome[i] + ": ");
			n2 = teclado.nextDouble();
			
			System.out.println("Digite a terceira nota do aluno " + nome[i] + ": ");
			n3 = teclado.nextDouble();
			teclado.nextLine();
			
			media[i] = (n1 + n2 + n3) / 3;
			media_classe = media_classe + media[i];
		}
		
		media_classe = media_classe / 5;
		System.out.println("A média da classe é: " + media_classe);
		
		for (i = 0; i < media.length; i++) {
			
			if (media[i] >= 7) {
				
				System.out.println("O(a) aluno(a) " + nome[i] + " tem a média maior que 7");
				
			}
		}
		
		teclado.close();
	}
}
