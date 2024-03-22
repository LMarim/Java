package entidades;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public Conta(int numero, String titular, double inicialDeposito) {
        this.numero = numero;
        this.titular = titular;
        deposito(inicialDeposito);
    }
    
    
    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void deposito(double quantia) {
        saldo += quantia;
    }
    
    public void saque(double quantia) {
        saldo -= quantia + 5.0;
    }
    
    public void emprestimo(ContaEmpresa empresa, double quantia) {
        if (quantia <= empresa.getLimite_emprestimo()) {
            empresa.deposito(quantia);
            empresa.setLimite_emprestimo(empresa.getLimite_emprestimo() - quantia);
            deposito(quantia);
            System.out.println("Empréstimo de R$" + String.format("%.2f", quantia) + " realizado com sucesso.");
        } else {
            System.out.println("O valor solicitado excede o limite de empréstimo da empresa.");
        }
    }
    
    public String toString() {
return "Conta "
+ numero
+ ", Titular: "
+ titular
+ ", Saldo: R$ "
+ String.format("%.2f", saldo);
}
    
}