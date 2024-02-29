

package com.mycompany.questao3;

import java.util.Scanner;


public class Questao3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite a hora inicial:");
        int horaInicial = scn.nextInt();
        System.out.println("Digite a hora final do jogo:");
        int horaFinal = scn.nextInt();

        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("o jogo durou " + duracao + " horas(s)");

        scn.close();
    }
}
