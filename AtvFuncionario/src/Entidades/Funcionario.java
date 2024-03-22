
package Entidades;


public class Funcionario {
    private String nome;
    private int horasTrabalhadas;

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    private double valorHora;
    
    public Funcionario(String nome, int horasTrabalhadas, double valorHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }
    
    public String getNome() {
        return nome;
    }

    public double calcularPagamento() {
        return horasTrabalhadas * valorHora;
    }
    
}
