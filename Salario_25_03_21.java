package salario_25_03_21;

import java.util.Scanner;

public class Salario_25_03_21 {

    public static void main(String[] args) {
        
        double sal, boni = 0, aux = 0, novo_sal = 0;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o salário do funcionário: ");
        sal = teclado.nextDouble();
        
        if (sal <= 800) {
            boni = sal * 0.05;
            novo_sal = sal + boni;
        } else {         
            if (sal > 800 && sal <= 1300) {
                boni = sal * 0.12;
                novo_sal = sal + boni;
            } else {
                System.out.println("Salário acima de R$ 1300!\nSem bonificação");
                boni = 0;
            }
        }
        
        if (sal <= 900) {
            aux = 150;
        } else {
            aux = 100;
        }
        
        novo_sal = sal + boni + aux;
        System.out.println("O novo salário é: R$ " + novo_sal);
    }
    
}
