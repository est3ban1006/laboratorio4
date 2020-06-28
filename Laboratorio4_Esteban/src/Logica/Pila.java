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
public interface Pila {

    public int getSize();

    public void push(Object element);

    public boolean isEmpty();

    public Object top() throws PilaExcepcion;

    public Object pop() throws PilaExcepcion;

    public void destruirPila();
}
