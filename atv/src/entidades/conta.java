
package entidades;


public class conta {
    private int numeroConta;
    private String titular;
    private double saldo;

    // ----------saldo--------------
    public double getSaldo() {
        return saldo;
    }
    //----------titular-------------
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    //------------numero conta------------
    public int getNumeroConta() {
        return numeroConta;
    }
    //-------------deposito---------------
    public void deposito(double quantia){
    saldo += quantia;
    }
    
    public void saque(double quantia){
    saldo -= quantia + 5.0;
    }
}
    