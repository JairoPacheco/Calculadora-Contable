/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author pache
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaDenominacion l1 = ListaDenominacion.getInstance();
        l1.SacarArchivo();
        FrameInicio f1 = new FrameInicio();
        f1.setVisible(true);
    }
    
}
