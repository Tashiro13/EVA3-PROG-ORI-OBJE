/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_uso_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alex_
 */
public class EVA3_7_USO_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try{
            Scanner captu = new Scanner(System.in);
        
        System.out.println("Introduce un numero entero: ");
        int nume = captu.nextInt();
        System.out.println("El numero es: " + nume);
    }catch(InputMismatchException e){
          while(true){
         System.out.println("Introduce un numero entero: ");
         int cap;
         Scanner capto = new Scanner(System.in);
         cap = capto.nextInt();
         if(capto == cap){
             break;
         } else {
         }
     }
    }
    
}
}
