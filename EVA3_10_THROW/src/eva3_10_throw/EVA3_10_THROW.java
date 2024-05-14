/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_throw;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alex_
 */
public class EVA3_10_THROW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Persona perso = new Persona("Juan", "Perez", -1);
        } catch (Exception ex) {
                     while(true){
         System.out.println("Introduce una edad valida: ");
         int cap;
         Scanner capto = new Scanner(System.in);
         cap = capto.nextInt();
         if(cap = ex ){
             break;
         } else {}
         }
        }
        System.out.println("Fin del programa");
    }
    
}

class Persona{
private String nombre;
private String apellido;
private int edad;

    public Persona() {
        this.nombre = " ";
        this.apellido = " ";
        this.edad = 0;
    }

    public Persona(String nombre, String apellido, int edad) throws Exception {
        this.nombre = nombre;
        this.apellido = apellido;
          if((edad < 0) || (edad > 150))
            throw new Exception("Valor capturado en la edad no es valido");
        
        this.edad = edad;
        
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if((edad < 0) || (edad > 150))
            throw new Exception("Valor capturado en la edad no es valido");
        this.edad = edad;
    }
}