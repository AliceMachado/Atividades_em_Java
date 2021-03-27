package empresa_fun_26_03_21;

import java.util.Scanner;

public class Empresa_fun_26_03_21 {

    public static void main(String[] args) {
        
        String nomefun;
        int numhoras, porhora, depen, pordepen;
        double salariobruto, salarioliquido, inss, ir;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Nome do funcionário: ");
        nomefun = teclado.next();
        
        System.out.println("Número de horas: ");
        numhoras = teclado.nextInt();
        
        System.out.println("Número de dependentes: ");
        depen = teclado.nextInt();
        
        porhora = numhoras * 32;
        pordepen = depen * 40;
        salariobruto = porhora + pordepen;
        inss = salariobruto * 0.085;
        ir = salariobruto * 0.05;
        salarioliquido = salariobruto - inss - ir;
        
        System.out.println("Salário bruto: R$" + salariobruto);
        System.out.println("Desconto do INSS: R$" + inss);
        System.out.println("Desconto do IR: R$" + ir);
        System.out.println("Salário líquido do funcionário"+ nomefun +": R$" + salarioliquido);
        
        teclado.close();
    }
    
}
