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
        while (Aluno.nota1 > 30) {
            System.out.println("Por favor, insira uma nota menor ou igual a 30: ");
            Aluno.nota1 = sc.nextDouble();
        }
        System.out.println("Nota do 2° semestre");
        Aluno.nota2 = sc.nextDouble();
        while (Aluno.nota2 > 35) {
            System.out.println("Por favor, insira uma nota menor ou igual a 35: ");
            Aluno.nota2 = sc.nextDouble();
        }
        System.out.println("Nota do 3° semestre");
        Aluno.nota3 = sc.nextDouble();
        while (Aluno.nota3 > 35) {
            System.out.println("Por favor, insira uma nota menor ou igual a 35: ");
            Aluno.nota3 = sc.nextDouble();
        }
             
        System.out.println("Aluno(a): " + Aluno.nome);
        
        System.out.println("Nota do 1° simestre: "+Aluno.nota1);
        System.out.println("Nota do 2° simestre: "+Aluno.nota2);
        System.out.println("Nota do 3° simestre: "+Aluno.nota3);
        
        Aluno.Media();

        Aluno.resultado();
    }
}
