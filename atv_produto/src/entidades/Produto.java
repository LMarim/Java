package entidades;


public class Produto {
    private double preco;
    private String nome;

     public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
     
    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    
}
