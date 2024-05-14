/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_12_leer_archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alex_
 */
public class EVA3_12_LEER_ARCHIVOS {
final static String miRuta = "D:\\Archivos\\archivo_textp.txt";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try {
        // TODO code application logic here
        leerArchivoFiles(miRuta);
        leerArchivoBuffered(miRuta);
        leerArchivosFileReader(miRuta);
        leerArchivoScanner(miRuta);
    } catch (IOException ex) {
       ex.printStackTrace();
    }
        
    }
    //Lectura de archivos usando la clase File
    //Se lee todo el archivo y se carga en memoria 
    //Por lo tanto solo es util para archivos pequennios
    public static void leerArchivoFiles(String ruta) throws IOException{
        System.out.println("Lectura de archivo con texto con clase File:  ****************************");
        Path path = Paths.get(ruta); //crea la ruta de tipo Path
        byte[] datos = Files.readAllBytes(path);//Genera un IOException 
        //new String ---> convierte el arreglo byte en linea de texto
        System.out.println(new String(datos));
    
    }
    //Es adecuado para leer archivos grandes
    //nos permite procesar archivos linea por linea
    //es adecuado para la miltitarea(hilos de ejecucion)
    public static void leerArchivoBuffered(String ruta) throws FileNotFoundException, IOException{
        System.out.println("Lectura de archivo con texto con clase BufferedReader:  ****************************");
    //Abrir el archivo
    //Leer el archivo como informacion binaria
    //Convertir la nformacion binaria a texto
    File file = new File(ruta);
    FileInputStream in = new FileInputStream(file);
    InputStreamReader reader = new InputStreamReader(in);
    BufferedReader br = new BufferedReader(reader);
    String cade;
    //Asignamos la line a la variable cade
    //Si cade es diferente a null estamos
    //Leyendo tecto, si leemos null, llegamos 
    //al final del archivo
    while((cade = br.readLine()) != null){
        System.out.println(cade);
    }
    br.close();
    }
public static void leerArchivosFileReader(String ruta) throws FileNotFoundException, IOException{
    System.out.println("Lectura de archivo con texto con clase FileReader: *****************************");
    File file = new File(ruta);
    FileReader reader = new FileReader(file);
    BufferedReader br = new BufferedReader(reader);
    String cade;
    //Asignamos la line a la variable cade
    //Si cade es diferente a null estamos
    //Leyendo tecto, si leemos null, llegamos 
    //al final del archivo
    while((cade = br.readLine()) != null){
        System.out.println(cade);
}
    br.close();
} 
public static void leerArchivoScanner(String ruta) throws IOException{
System.out.println("Lectura de archivo con texto con clase Scanner: *****************************");
 Path path = Paths.get(ruta); 
Scanner leer = new Scanner(path);
while(leer.hasNextLine()){
 String cade = leer.nextLine();
    System.out.println(cade);
}
leer.close();
   }

     }      
