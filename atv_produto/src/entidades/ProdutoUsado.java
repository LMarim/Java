
package entidades;


public class ProdutoUsado extends Produto {
    private String dataFab;
    
    public ProdutoUsado(String nome, double preco,String dataFab) {
        super(nome, preco);
        this.dataFab =dataFab;
    }

    public String etiqueta() {
        return "Nome do produto:" + super.getNome() + " (Produto usado)\n Data de fabricação: " 
                + dataFab + "\n Valor do produto--R$ " + String.format("%.2f", getPreco());
    }
    
}
