
package App;

import Entidades.Funcionario;
import Entidades.Funcionario_tercerizado;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
        System.out.println("Digite a quantidade de funcionarios");
        int n = sc.nextInt();
        sc.nextLine();
     
        System.out.println("Qual o valor que os funcionarios recebem por hora?");
        double valorHora = sc.nextDouble();
        sc.nextLine();
        
        Funcionario[] funcionarios = new Funcionario[n];
        
        for (int i =0; i < n; i++){
            System.out.println("Funcionario nº" + (i+1) + ":");
            System.out.println("Nome:");
            String nome = sc.nextLine();
            
            
            System.out.println("Horas trabalhadas:");
            int horasTrabalhadas = sc.nextInt();
            sc.nextLine();
            
            System.out.println("O funcionario é tercerizado? (Y/N)");
            char opcao = sc.next().charAt(0);
            sc.nextLine();
            
            if (opcao == 'y' || opcao == 'Y'){
                System.out.println("Despesa adicional");
                double despesaAdicional = sc.nextDouble();
                sc.nextLine();
                
                funcionarios[i] = new Funcionario_tercerizado(nome,horasTrabalhadas,valorHora,despesaAdicional);
            }
            else{
            funcionarios[i] = new Funcionario(nome,horasTrabalhadas,valorHora);
            }
         }   
            System.out.println("\n Pagamento dos funcionarios:");
            for (int i =0; i < n; i++){
            System.out.println("Nome: " + funcionarios[i].getNome());
                System.out.println("Horas trabalhadas:" + funcionarios[i].getHorasTrabalhadas());
            System.out.println("Pagamento: R$ " + funcionarios[i].calcularPagamento());
            System.out.println();
            }
    }
    
}
