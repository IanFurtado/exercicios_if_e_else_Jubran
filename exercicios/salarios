import java.util.Scanner;

public class salarios {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calculadora de INSS, insira o salário e receba o valor do desconto");
        double salario = entrada.nextDouble();

        if (salario >= 600) {
            System.out.println("O desconto é de: "+ salario * 0.2);
        } else if (salario >= 1200) {
            System.out.println("O desconto é de: " + salario * 0.25);
        } else if (salario >= 2000) {
            System.out.println("O desconto é de: " + salario * 0.3);
        } else {
            System.out.println("Valor isento");
        }
        entrada.close();
    }
}
