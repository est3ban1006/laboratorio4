/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.PilaEnlazada;

/**
 *
 * @author Personal
 */
public class PruebaPilaEnlazada {
    PilaEnlazada pel;
    
    public PruebaPilaEnlazada(){
        
    }
    public void test(){
        pel.push(5);
        pel.push(6);
        pel.push(1);
        pel.push(7);
    }
}
