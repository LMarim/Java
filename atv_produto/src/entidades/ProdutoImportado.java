
package entidades;


public class ProdutoImportado extends Produto {
    private double taxa;

    public ProdutoImportado(String nome, double preco, double taxa) {
        super(nome, preco);
        this.taxa = taxa;
    }
   
    @Override
    public double getPreco() {
        return super.getPreco() + taxa;
    }
    
    public String etiqueta() {
        return "Nome do produto:" + super.getNome() + "( Produto importado)\n Valor do produto--R$: " 
                + String.format("%.2f", getPreco());
    }
}
