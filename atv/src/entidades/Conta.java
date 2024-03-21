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
    public String toString() {
return "Conta "
+ numero
+ ", Titular: "
+ titular
+ ", Saldo: $ "
+ String.format("%.2f", saldo);
}
    
}