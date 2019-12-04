/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.DefaultListModel;

/**
 *
 * @author pache
 */
public class ListaDenominacion implements Serializable{
    public static ListaDenominacion instance = null;
    public static ListaDenominacion getInstance(){
        if(instance == null){
            instance = new ListaDenominacion();
        }
        return instance;
    }
    DefaultListModel<Denominación>listaMonedas= new DefaultListModel<>();
    public String nombre;
    double total;
    
    public ListaDenominacion() {
    }
    
    public void MeterArchivo(){
        try{
            ObjectOutputStream escribiendo = new ObjectOutputStream(new FileOutputStream("Denominaciones.txt"));
            escribiendo.writeObject(listaMonedas);
        }catch(IOException e){
            
        }
    }
    public void SacarArchivo(){
        try{
            ObjectInputStream sacar = new ObjectInputStream(new FileInputStream("Denominaciones.txt"));
             this.listaMonedas = (DefaultListModel<Denominación>)sacar.readObject();
             
        }catch(IOException | ClassNotFoundException e){
            listaMonedas = listaMonedas;
        }
    }
}
