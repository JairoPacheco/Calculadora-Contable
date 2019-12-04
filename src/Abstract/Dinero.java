/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

import java.io.Serializable;

/**
 *
 * @author pache
 */
public abstract class Dinero implements Serializable{
    public double valor;
    public String imagen;
    public int cantidad;

    public Dinero(double valor, String imagen,int catidad) {
        this.valor = valor;
        this.imagen = imagen;
        this.cantidad = catidad;
    }
    
}
