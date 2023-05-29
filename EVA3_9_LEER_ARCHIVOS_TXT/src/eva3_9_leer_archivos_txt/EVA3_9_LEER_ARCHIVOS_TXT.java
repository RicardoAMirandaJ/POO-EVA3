/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_leer_archivos_txt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ricar
 */
public class EVA3_9_LEER_ARCHIVOS_TXT {
    final static String RUTA = "D:\\archivos\\prueba.txt";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            readUsingFiles(RUTA);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    /*
    FILES: Se lee todo el contenido del archivo y se
    transfiere a memoria principal (RAM)
    Util en archivos pequeños
    */
    
    public static void readUsingFiles(String ruta) throws IOException{
        //CONSTRUIMOS LA RUTA EN BASE A LA CADENA DE TEXTO
        Path path = Paths.get(ruta);
        /* List<String> todasLineas = Files.readAllLines(path);
        System.out.println("Resultado:");
        //System.out.println(todasLineas.toString());
        for (int i = 0; i < todasLineas.size(); i++) {
            System.out.println(todasLineas.get(i));
        } */
        byte[] bytes = Files.readAllBytes(path);
        System.out.println(new String(bytes));
    }
    
}
