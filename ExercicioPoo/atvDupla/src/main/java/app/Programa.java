package app;

import entidades.aluno;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        aluno Aluno = new aluno();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do aluno: ");
        Aluno.nome = sc.nextLine();

        System.out.println("Nota do 1° semestre");
        Aluno.nota1 = sc.nextDouble();

        System.out.println("Nota do 2° semestre");
        Aluno.nota2 = sc.nextDouble();

        System.out.println("Nota do 3° semestre");
        Aluno.nota3 = sc.nextDouble();

        System.out.println("Aluno(a): " + Aluno.nome);
        
        Aluno.Media();

        Aluno.resultado();
    }
}
