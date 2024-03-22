package app;

import entidades.Conta; 
import entidades.ContaEmpresa;
import java.util.Locale;
import java.util.Scanner;

public class Atv {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;
        ContaEmpresa conta_empresa;  
        
        //conta Usuario-------
        System.out.println("Conta do Usuário:");
        System.out.println("Digite o número da conta: ");
        int numero = sc.nextInt();
        
        System.out.println("Insira o nome do titular: ");
        sc.nextLine();
        String titular = sc.nextLine();


        System.out.println("Existe um deposito inicial na conta (y/n)?");
        char resposta = sc.next().charAt(0);
        
        if (resposta == 'y' || resposta 'Y') {
            System.out.println("Insira o valor do deposito inicial");
            double inicialDeposito = sc.nextDouble();
            conta = new Conta(numero, titular, inicialDeposito);
        }
        else{
            conta = new Conta(numero,titular);
        }
        //conta Empresa-------
        System.out.println("Conta da Empresa:");
        System.out.println("Digite o número da conta: ");
        int numeroEmpresa = sc.nextInt();
        

        System.out.println("Insira o nome da empresa: ");
        sc.nextLine();
        String titularEmpresa = sc.nextLine();

        System.out.println("Insira o limite de empréstimo: ");
        double limite_emprestimo = sc.nextDouble();
        
        conta_empresa = new ContaEmpresa(numeroEmpresa, titularEmpresa, limite_emprestimo);
    
        //processos--------
        //dados das contas
    System.out.println("\n Dados da Conta:");
    System.out.println(conta + "\n");
        
    System.out.println("Dados da conta da empresa:");
    System.out.println(conta_empresa + "\n");
        //deposito e saque
        
    System.out.print("Insira um valor de deposito: ");
       double depositoValor = sc.nextDouble();
       conta.deposito(depositoValor);
    System.out.println("\n Dados da conta atualizados:");
    System.out.println(conta + "\n");

    System.out.print("Insira um valor de saque: ");
    double saquevalor = sc.nextDouble();
    conta.saque(saquevalor);
    System.out.println("Dados da conta atualizados:");
    System.out.println(conta);
    
    //Emprestimo
    System.out.print("\n Insira um valor de empréstimo na conta da empresa: ");
        double emprestimoValor = sc.nextDouble();
        conta.emprestimo(conta_empresa, emprestimoValor);
    System.out.println("\nDados da conta do usuário atualizados:");
    System.out.println(conta + "\n");
    System.out.println("Dados da conta da empresa atualizados:");
    System.out.println(conta_empresa + "\n");


sc.close();
    }   
}
