/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_try_catch;

/**
 *
 * @author ricar
 */
public class EVA3_3_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 5, y = 0;
        try{//BLOQUE DE CÓDIGO QUE PUEDE GENERAR UNA EXCEPCION
            int resu = x / y;
            System.out.println("El resultado es = " + resu);
        }catch(ArithmeticException e){
            //BLOQUE DE CÓDIGO QUE CAPTURA Y ATIENDE LA
            //EXCEPCION
            System.out.println("Excepcion: " + e.getMessage());
        }
        System.out.println("Fin del programa");
    }
    
}
