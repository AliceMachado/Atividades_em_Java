package operacoes;

import java.util.Scanner;

public class Operacoes {

    public static void main(String[] args) {
        
        int v1, v2, v3;
        double soma1, soma2, soma3, sub1, sub2, multi;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o valor 1(V1): ");
        v1 = teclado.nextInt();
        
        System.out.println("Digite o valor 2(V2): ");
        v2 = teclado.nextInt();
        
        System.out.println("Digite o valor 3(V3): ");
        v3 = teclado.nextInt();
        
        soma1 = v1 + v2;
        soma2 = v3 + v2;
        soma3 = v1 + v2 + v3;
        sub1 = v2 - v1;
        sub2 = v3 - v2;
        multi = v3 * v1;
        
        System.out.println("V1 + V2 = " + soma1);
        
        System.out.println("V2 – V1 = "+ sub1);
        
        System.out.println("V3 * V1 = " + multi);
        
        System.out.println("V3 + V2 = " + soma2);
        
        System.out.println("V3 – V2 = " + sub2);
        
        System.out.println("V1 + V2 + V3 = "+ soma3);        
    }    
}