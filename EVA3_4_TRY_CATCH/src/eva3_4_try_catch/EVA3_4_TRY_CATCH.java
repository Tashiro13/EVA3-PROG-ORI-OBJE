/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_try_catch;

/**
 *
 * @author alex_
 */
public class EVA3_4_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //
        
        int x = 0, y = 0;
        int resu;
        try{
        resu = x/y;
        System.out.println(resu);
        }catch(ArithmeticException xxx){// aqui va la solucion
            //Que queremos hacer 
            xxx.printStackTrace();
            //System.out.println("Upps!! fallo");
        
        }
        
    
    }
    
}
