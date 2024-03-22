
package app;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;
import java.util.Scanner;


public class main {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
        System.out.println("O produto vai ser Importado(i) ou Usado(u)?");
        char tipo = sc.next().charAt(0);
        sc.nextLine();
        
        System.out.println("Nome do produto:");
        String nome = sc.nextLine();
        
        System.out.println("Preço do produto");
        double preco = sc.nextDouble();
        
        if (tipo == 'i'){
            System.out.println("Digite o valor da taxa:");
            double taxa = sc.nextDouble();
            ProdutoImportado produto = new ProdutoImportado(nome, preco, taxa);
            System.out.println("\n Etiqueta de preço: \n" + produto.etiqueta());
        }
        else if(tipo =='u'){
            System.out.print("Digite a data de fabricação: ");
            String dataFab = sc.next();
            ProdutoUsado produto = new ProdutoUsado(nome, preco, dataFab);
            System.out.println("\n Etiqueta de preço: \n" + produto.etiqueta());
        }
    }
    
}
