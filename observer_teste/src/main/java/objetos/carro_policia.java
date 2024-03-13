
package objetos;

import java.util.Observable;
import java.util.Observer;


public class carro_policia implements Observer,carro {
    
    
    public void frente(){
            System.out.println("Viatura segue em frente");
}
    
    public void direita(){
            System.out.println("Viatura vira para a direita");
}
    
    public void esquerda(){
            System.out.println("Viatura vira para a esquerda");
}
    
    public void para(){
            System.out.println("Viatura para");
}
    
    public void update(Observable arg0,Object arg1){
    String acao = String.valueOf(arg1);
        switch (acao) {
            case "frente" -> this.frente();
            case "direita" -> this.direita();
            case "esquerda" -> this.esquerda();
            case "para" -> this.para();
            default -> {
            }
        }
            
    }
}
