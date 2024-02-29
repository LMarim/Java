
package com.mycompany.questao4;

import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite as coordenadas x do ponto:");
        double x = scn.nextDouble();
        System.out.println("Digite as coordenadas y do ponto:");
        double y = scn.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x == 0.0) {
            System.out.println("Eixo Y");
        } else if (y == 0.0) {
            System.out.println("Eixo X");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }

        scn.close();
    }
}
