
package entidades;


public class ProdutoImportado extends Produto {
    private double taxa = 10.0;
    private double total;
            
    public ProdutoImportado (){
        total = getPreco() + taxa;   
    }
    
}
