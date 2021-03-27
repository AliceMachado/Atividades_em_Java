package area_26_03_21;

import java.util.Scanner;

public class Area_26_03_21 {

    public static void main(String[] args) {
        
        double base, altura, area;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Base: ");
        base = teclado.nextDouble();
        
        System.out.println("Altura: ");
        altura = teclado.nextDouble();
        
        area = (base * altura) / 2;
        
        System.out.println("A área é: " + area);
        
        teclado.close();
    }
    
}
