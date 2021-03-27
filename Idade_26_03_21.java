package idade_26_03_21;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Idade_26_03_21 {

    public static void main(String[] args) {
        
        int anonasci, anoatual;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o ano de nascimento: ");
        anonasci = teclado.nextInt();

        LocalDateTime data1 = LocalDateTime.now();
        anoatual = data1.getYear();
        
        System.out.println("A idade aproximada é: " + (anoatual - anonasci) + " anos");

        teclado.close();                
    }    
}
