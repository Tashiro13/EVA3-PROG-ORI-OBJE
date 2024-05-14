/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_escribir_archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alex_
 */
public class EVA3_13_ESCRIBIR_ARCHIVOS {
    final static String miRuta = "D:\\Archivos\\";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            escribirFiles(miRuta + "Files.txt",
                    "Hola mundo!!\n" +
                            "Prueba con la Clase Files");
            escribirFileWriter(miRuta+ "FilesWriter.txt",
                    "Hola mundo!!\n" +
                            "Prueba con la Clase FilesWriter");
            escribirBufferedWriter(miRuta+ "BufferedWriter.txt",
                    "Hola mundo!!\n" +
                            "Prueba con la Clase BufferedWriter");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static void escribirFiles(String ruta, String datos ) throws IOException{
    Path path = Paths.get(ruta);
    Files.write(path, datos.getBytes());
    
    }
    public static void escribirFileWriter(String ruta, String datos) throws IOException{
    File file = new File(ruta);
    FileWriter  filewriter = new FileWriter(file);
    filewriter.write(datos);
    filewriter.close();
    }
    public static void escribirBufferedWriter(String ruta, String datos) throws IOException{
     File file = new File(ruta);
     FileWriter  filewriter = new FileWriter(file);
    BufferedWriter bw = new BufferedWriter(filewriter);
    bw.write(datos);
    bw.close();
    
    }
}
