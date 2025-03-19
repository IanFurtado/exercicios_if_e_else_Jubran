package exerciciosifelse;

import java.util.Scanner;

public class salarios2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float salarios;
        float desconto;
        System.out.println("Calculadora de INSS, insira o salário e receba o valor do desconto");
        salarios = entrada.nextFloat();

        if (salarios > 600 && salarios <= 1200) {
            desconto = salarios * (float) 0.2;
            System.out.printf("Para o salário de %.2f o desconto é de %.2f.",salarios,desconto);
        } else if (salarios > 1200 && salarios <= 2000) {
            desconto = salarios * (float) 0.25;
            System.out.printf("Para o saláro de %.2f p desconto é de %.2f.",salarios,desconto);
        } else if (salarios > 2000) {
            desconto = salarios * (float) 0.3;
            System.out.printf("Para o salário de %.2f o desconto é de %.2f",salarios,desconto);
        } else {
            System.out.printf("O salário de %.2f é isento",salarios);
        }
        entrada.close();
    }
}
