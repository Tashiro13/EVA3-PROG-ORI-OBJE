/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alex_
 */
public class EVA3_5_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Scanner captu = new Scanner(System.in);
        
        System.out.println("Introduce el numerador: ");
        int nume = captu.nextInt();
        System.out.println("Introduce el divisor: ");
        int divi = captu.nextInt();
        int resu = 0;
        resu = nume/divi;
        System.out.println("El resultado es :" + resu);
    }catch(InputMismatchException e){
     e.printStackTrace();

     }catch(ArithmeticException e){
    e.printStackTrace();
   
}
    }
}
        
    
    

