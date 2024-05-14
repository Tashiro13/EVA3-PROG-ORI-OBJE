/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_11_cusom_exception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alex_
 */
public class EVA3_11_CUSOM_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            mensaje();
        } catch (Miexception ex) {
            ex.printStackTrace();
        }
    }
    public static void mensaje() throws Miexception{
        System.out.println("Mensaje");
        throw new Miexception("Falla en el sistema");
}
}

class Miexception extends Exception{

    public Miexception() {
    }

    public Miexception(String message) {
                super(message);
    }

}