/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import Abstract.Dinero;
import java.io.Serializable;

/**
 *
 * @author pache
 */
public class Billetes extends Dinero implements Serializable{
    String nombre;
    public Billetes(double valor, String imagen,int cantidad) {
        super(valor, imagen,cantidad);
    }
    
}
