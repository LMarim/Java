
package com.mycompany.questao5;

import java.util.Scanner;


public class Questao5 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite o salário:");
        double salario = scn.nextDouble();

        double imposto;

        if (salario <= 2000.00) {
            imposto = 0.0;
        } else if (salario <= 3000.00) {
            imposto = (salario - 2000.00) * 0.08;
        } else if (salario <= 4500.00) {
            imposto = 1000.00 * 0.08 + (salario - 3000.00) * 0.18;
        } else {
            imposto = 1000.00 * 0.08 + 1500.00 * 0.18 + (salario - 4500.00) * 0.28;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        } else {
            System.out.printf("Imposto de: R$ %.2f\n", imposto);
        }

        scn.close();
    }
}
