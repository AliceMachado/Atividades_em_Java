package acrescido;

import java.util.Scanner;

public class Acrescido {

    public static void main(String[] args) {
        
        double valor, Vn;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o valor: ");
        valor = teclado.nextDouble();
        
        Vn = valor + (valor * (15.8/100));                
        
        System.out.println("Valor novo: " + Vn);
        
        teclado.close();
    }
    
}