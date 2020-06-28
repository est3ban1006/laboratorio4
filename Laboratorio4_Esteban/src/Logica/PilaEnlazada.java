/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Personal
 */
public class PilaEnlazada implements Pila{
    
    private Nodo tope;
    private int contador;

    public PilaEnlazada(){
        tope = null;
        contador = 0;
    }
    
    @Override
    public int getSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void push(Object element) {
        Nodo nuevoNodo = new Nodo(element);
        
        if(tope== null)
            tope = nuevoNodo;
        else{
            nuevoNodo.sgte=tope;
            tope = nuevoNodo;
            
        }
        contador++;
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object top() throws PilaExcepcion {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object pop() throws PilaExcepcion {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void destruirPila() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
