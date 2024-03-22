
package Entidades;


public class Funcionario_tercerizado extends Funcionario {
    private double despesaAdicional;
    
    public Funcionario_tercerizado(String nome, int horasTrabalhadas, double valorHora,double despesaAdicional) {
        super(nome, horasTrabalhadas, valorHora);
        this.despesaAdicional = despesaAdicional;
    }
    
    @Override
    public double calcularPagamento() {
        return super.calcularPagamento() + (despesaAdicional * 1.1);
    }
    
}
