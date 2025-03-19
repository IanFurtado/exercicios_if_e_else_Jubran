package exercicios;

import java.util.Scanner;

public class desvio {
    public static void main(String[] args) {
        Scanner sexo = new Scanner(System.in);
        Scanner preferencia = new Scanner(System.in);
        System.out.println("Informe seu gênero 1: Masculino, 2: Feminino"); 
        int sex = sexo.nextInt();
        System.out.println("Informe sua sexualidade 1: Hétero, 2: Homo, 3: Bi");
        int pref = preferencia.nextInt();
        if (sex == 1) {
            if (pref == 1 || pref == 3) {
                System.out.println("Pra cima");
            } else if (pref == 2){
                System.out.println("ECA");
            } else {
                System.out.println("Sexualidade inválida");
            }
        } else if (sex >= 3){
            System.out.println("Genêro inválido");
        } else if (pref == 2 || pref == 3) {
            System.out.println("Pra cima");
        } else if (pref == 1) {
            System.out.println("ECA");
        } else {
            System.out.println("Sexualidade inválida");
        }
        sexo.close();
        preferencia.close();
    }
}
