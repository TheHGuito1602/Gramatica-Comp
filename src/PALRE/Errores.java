/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PALRE;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Edgar Gutierrez
 */
public class Errores {
    
    Metodos a = new Metodos();
                Scanner lector = new Scanner(System.in);

    public String errorTD(){

        String token1 = null;
        try{
            token1=lector.nextLine();
            System.out.println("Entrando al Try Catch");
       // token1= JOptionPane.showInputDialog("Ingrese declaracion");
    }catch(NullPointerException e){
                    System.out.println("No hay cadena de entrada");

    }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("No existe arreglo");
        }catch(Exception e){
            System.out.println("kk");
        }
        
            return token1;
}
}
