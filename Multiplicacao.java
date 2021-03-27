package multiplicacao;

import java.util.Scanner;

public class Multiplicacao {

    public static void main(String[] args) {                   
                
        double n1, n2, soma, sub, multi, div;
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o numero 1:");
        n1 = teclado.nextInt();	  	

        System.out.println("Digite o numero 2:");	  	
        n2 = teclado.nextInt();

        soma = n1 + n2;
        sub = n1 - n2;
        multi = n1 * n2;
        div = n1 / n2;

        System.out.println("A soma é:" + soma);
        System.out.println("A subtracao é:" + sub);
        System.out.println("A multiplicação é:" + multi);
        System.out.println("A divisão é:" + div);

        teclado.close();
    }    
}