package dez_valores_reais_06_05_21;

import java.util.Scanner;

public class dez_valores_reais {

	public static void main(String[] argrs) {

		double soma = 0, media = 0, maior = 0, menor = 0, num[] = new double[10];
		int i;

		Scanner teclado = new Scanner(System.in);

		for (i = 0; i < num.length; i++) {

			System.out.println("Digite o " + (i + 1) + "° número real: ");
			num[i] = teclado.nextDouble();

			soma = soma + num[i];
			media = media + num[i];
		}

		media = media / 10;
		maior = num[0];
		menor = num[0];

		for (i = 0; i < num.length; i++) {

			if (num[i] > maior) {
				maior = num[i];
			}

			if (num[i] < menor) {
				menor = num[i];
			}
		}
		
		System.out.println("A soma de todos os valores é " + soma);
		System.out.println("A média dos valores é " + media);
		System.out.println("O maior valor é " + maior);
		System.out.println("O menor valor é " + menor);
		
		teclado.close();
	}
}