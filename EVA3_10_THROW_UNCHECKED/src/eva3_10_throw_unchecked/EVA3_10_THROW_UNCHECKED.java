/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_throw_unchecked;

/**
 *
 * @author alex_
 */
public class EVA3_10_THROW_UNCHECKED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Persona perso = new Persona("Juan", "Perez", -1);
        }catch(RuntimeException e){
        e.printStackTrace();
        }
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

    public Persona(String nombre, String apellido, int edad)  {
        this.nombre = nombre;
        this.apellido = apellido;
          if((edad < 0) || (edad > 150))
           throw new RuntimeException("La edad ingresada no es valida");
        
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

    public void setEdad(int edad) {
        if((edad < 0) || (edad > 150))
            throw new RuntimeException("La edad ingresada no es valida");
        this.edad = edad;
    }}