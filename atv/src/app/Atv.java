
package app;

import entidades.conta;
import java.util.Locale;
import static java.util.Locale.US;
import java.util.Scanner;


public class Atv {

    
    public static void main(String[] args) {

        Locale.setDefault(US);
        Scanner sc = new Scanner(System.in);
           
        System.out.println("Digite o número da conta: ");
        int numero = sc.nextInt();
        
        System.out.println("Insira o nome do titular: ");
        String titular = sc.nextLine();
        
        System.out.println("Existe um deposito inicial na conta (y/n)?");
        char resposta = sc.next().charAt(0);
        if (resposta == 'y'){
            System.out.println("Insira o valor do deposito inicial");
            double inicialDeposito = sc.nextDouble();
            Conta = new conta(numero,titular,inicialDeposito );
        }
        
    }
    
}
