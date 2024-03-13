
package app;

import objetos.carro_policia;
import objetos.carro_roubado;

public class programa {
    
    public static void main(String[] args){
    //Observador
        carro_policia CarroPolicia = new carro_policia();
    //Observado
        carro_roubado CarroRoubado = new carro_roubado();
    //Adicionar obsrvador ao observado
    CarroRoubado.addObserver(CarroPolicia);
    
    CarroRoubado.frente();
    CarroRoubado.direita();
    CarroRoubado.frente();
    CarroRoubado.esquerda();
    CarroRoubado.para();
    }
}
