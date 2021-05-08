package dados_alunos_06_05_21;

import java.util.Scanner;

public class dados_alunos {
	
	public static void main(String[] argrs) {
		
		String nomes[] = new String [10], maisalto, maisbaixo, maiorpeso, menorpeso;
		int i, idade[] = new int [10], imc_m = 0, imc_n = 0, imc_s = 0, imc_o = 0, imc_og = 0;
		double maisalto_n, maisbaixo_n, maiorpeso_n, menorpeso_n, altura[] = new double[10], peso[] = new double[10], imc[] = new double[10];
		
		Scanner teclado = new Scanner(System.in);
		
		for (i = 0; i < nomes.length; i++) {

			System.out.println("Digite o nome do " + (i + 1) + "° aluno: ");
			nomes[i] = teclado.nextLine();
			
			System.out.println("Digite a idade do " + (i + 1) + "° aluno: ");
			idade[i] = teclado.nextInt();
			
			System.out.println("Digite a altura do " + (i + 1) + "° aluno: ");
			altura[i] = teclado.nextDouble();
			
			System.out.println("Digite o peso do " + (i + 1) + "° aluno: ");
			peso[i] = teclado.nextDouble();
			
			imc[i] = peso[i] / (altura[i] * altura[i]); 
			
			teclado.nextLine();
		}
		
		maisalto_n = altura[0];
		maisbaixo_n = altura[0];
		maiorpeso_n = peso[0];
		menorpeso_n = peso[0];
		maiorpeso = nomes[0];
		menorpeso = nomes[0];
		maisalto = nomes[0];
		maisbaixo = nomes[0];
		
		for (i = 0; i < altura.length; i++) {
			if (altura[i] > maisalto_n) {
				maisalto_n = altura[i];
				maisalto = nomes[i];
			}
			if (altura[i] < maisbaixo_n) {
				maisbaixo_n = altura[i];
				maisbaixo = nomes[i];
			}
		}
		
		for (i = 0; i < peso.length; i++) {
			if (peso[i] > maiorpeso_n) {
				maiorpeso_n = peso[i];
				maiorpeso = nomes[i];
			}
			if (peso[i] < menorpeso_n) {
				menorpeso_n = peso[i];
				menorpeso = nomes[i];
			}
		}
		
		for (i = 0; i < imc.length; i++) {
			if (imc[i] <= 19) {
				 System.out.println("Conforme o IMC " + imc[i] + ", o aluno " + nomes[i] + " está abaixo do peso ideal");
				 imc_m = imc_m + 1;
			}else if (imc[i] <= 25) {
					   System.out.println("Conforme o IMC " + imc[i] + ", o aluno " + nomes[i] + " está com o peso ideal");
					   imc_n = imc_n + 1;
			}else if (imc[i] <= 30) {
					   System.out.println("Conforme o IMC " + imc[i] + ", o aluno " + nomes[i] + " está acima do peso ideal");
					   imc_s = imc_s + 1;
			}else if (imc[i] <= 35) {
					   System.out.println("Conforme o IMC " + imc[i] + ", o aluno " + nomes[i] + " está com obesidade leve");
					   imc_o = imc_o + 1;
			}else if (imc[i] > 35) {
					   System.out.println("Conforme o IMC " + imc[i] + ", o aluno " + nomes[i] + " está Obeso");
					   imc_og = imc_og + 1;
		    }
		}
		
		System.out.println("O aluno mais alto é " + maisalto);
		System.out.println("O aluno mais baixo é " + maisbaixo);
		System.out.println("O aluno com maior peso é " + maiorpeso);
		System.out.println("O aluno com menor peso é " + menorpeso);
		System.out.println("A quantidade de alunos abaixo do peso ideal é " + imc_m);
		System.out.println("A quantidade de alunos com o peso ideal é " + imc_n);
		System.out.println("A quantidade de alunos acima do peso ideal é " + imc_s);
		System.out.println("A quantidade de alunos com obesidade leve é " + imc_o);
		System.out.println("A quantidade de alunos com obesidade é " + imc_og);
		
		teclado.close();
	}
}