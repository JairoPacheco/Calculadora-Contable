/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import Abstract.Dinero;
import java.io.Serializable;
import javax.swing.DefaultListModel;
/**
 *
 * @author yosin
 */
public class Denominación implements Serializable{
    
    private String denominacionNombre;
    DefaultListModel<Dinero>Imagen= new DefaultListModel<>();

    public Denominación(String denominacionNombre) {
        this.denominacionNombre = denominacionNombre;
    }

    public String getDenominacionNombre() {
        return denominacionNombre;
    }

    public void setDenominacionNombre(String denominacionNombre) {
        this.denominacionNombre = denominacionNombre;
    }

    public DefaultListModel<Dinero> getImagen() {
        return Imagen;
    }

    public void setImagen(DefaultListModel<Dinero> Imagen) {
        this.Imagen = Imagen;
    }
    
    
}
