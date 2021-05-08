package temperatura_semana_06_05_21;

import java.util.Scanner;

public class temperatura_semana {
	
	public static void main(String[] argrs) {
		
		double temperatura[] = new double[7], media = 0, maior_n = 0, menor_n = 0;
		String dias[] = new String[] {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"}, maior, menor, abaixomedia = "";
		int i;
		
		Scanner teclado = new Scanner(System.in);
		
		for (i = 0; i < temperatura.length; i++) {
			
			System.out.println("Digite a temperatura de " + dias[i] + ": ");
			temperatura[i] = teclado.nextDouble();
			media = media + temperatura[i];
		}
		media = media / 7;
		maior = dias[0];
		menor = dias[0];
		
		maior_n = temperatura[0];
		menor_n = temperatura[0];
		
		for (i = 0; i < temperatura.length; i++) {
			if (temperatura[i] > maior_n) {
				maior_n = temperatura[i];
				maior = dias[i];
			}
			if (temperatura[i] < menor_n) {
				menor_n = temperatura[i];
				menor = dias[i];
			}
			if (temperatura[i] < media) {
				abaixomedia = abaixomedia + ", " + dias[i];
			}
		}
		
		System.out.println("A maior temperatura da semana é " + maior_n + "C° no dia de " + maior);
		System.out.println("A menor temperatura da semana é " + menor_n + "C° no dia de " + menor);
		System.out.println("A média de temperatura durante a semana é " + media + "C°");
		System.out.println("Os dias da semana que tiveram temperaturas abaixo da média são: " + abaixomedia);
		
		teclado.close();
	}
}