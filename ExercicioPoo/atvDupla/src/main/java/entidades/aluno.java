
package entidades;


public class aluno {
    
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    public double media;
    
    public double Media(){
    media = (nota1+nota2+nota3)/3;
        System.out.println("Média do(a) aluno(a): "+ String.format("%.2f",media));
        return 0;
    }
    
    public double resultado(){
    if (media >= 60){
        System.out.println("Aprovado");
    }else{
        System.out.println("Reprovado");
        System.out.println("Pontos que faltam:");
        double pontoNes;
        pontoNes = 60 - media;
        System.out.println(String.format("%.2f",pontoNes));
    }
        return 0;
    }
    
}
