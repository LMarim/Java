
package entidades;


public class ContaEmpresa extends Conta{
    private double limite_emprestimo;   

    
    public ContaEmpresa(int numero, String titular, double limite_emprestimo) {
        super(numero, titular);
        this.limite_emprestimo = limite_emprestimo;
    }
    
    public void setLimite_emprestimo(double limite_emprestimo) {
        this.limite_emprestimo = limite_emprestimo;
    }
    
    public double getLimite_emprestimo() {
        return limite_emprestimo;
    }
    

    public String toString() {
        return "Conta " + getNumero() + ", Empresa: " + getTitular() 
                + ", Limite do Empréstimo: $" 
                + String.format("%.2f", limite_emprestimo);
    }
}
