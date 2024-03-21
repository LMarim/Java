package app;

import entidades.Conta; 
import java.util.Locale;
import java.util.Scanner;

public class Atv {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;
           
        System.out.println("Digite o número da conta: ");
        int numero = sc.nextInt();
        
        System.out.println("Insira o nome do titular: ");
        sc.nextLine();
        
        String titular = sc.nextLine();
        
        System.out.println("Existe um deposito inicial na conta (y/n)?");
        char resposta = sc.next().charAt(0);
        
        if (resposta == 'y') {
            System.out.println("Insira o valor do deposito inicial");
            double inicialDeposito = sc.nextDouble();
            conta = new Conta(numero, titular, inicialDeposito);
        }
        else{
            conta = new Conta(numero,titular);
        }
        
    System.out.println("Dados da Conta:");
    System.out.println(conta + "\n");
        
    System.out.print("Insira um valor de deposito: ");
       double depositoValor = sc.nextDouble();
       conta.deposito(depositoValor);
    System.out.println("\n Dados da conta atualizados:");
    System.out.println(conta + "\n");



    
    System.out.print("Insira um valor de retirada: ");
    double saquevalor = sc.nextDouble();
    conta.saque(saquevalor);
    System.out.println("Dados da conta atualizados:");
    System.out.println(conta);



sc.close();
    }   
}
