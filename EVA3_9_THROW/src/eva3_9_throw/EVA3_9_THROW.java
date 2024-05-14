/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_throw;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alex_
 */
public class EVA3_9_THROW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            metodoproblematico();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void metodoproblematico() throws Exception{
        System.out.println("Holii!!!");
        throw new Exception("FALLA DEL SISTEMA!!!");
        //System.out.println("Hello Kitty!");, NUNCA SE VA A EJECUTAR 
    
    }
}
