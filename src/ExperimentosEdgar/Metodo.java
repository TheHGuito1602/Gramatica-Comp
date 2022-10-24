/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExperimentosEdgar;

/**
 *
 * @author Edgar Gutierrez
 */
public class Metodo {
    
    public void inicio(){
           String con = "";
 
        String token1 = "char xm='a';";

       // String token1 = "float _xiu = 2.5a ;";
        //String token1 = "float _xiu = 2.5 ;";

        //String token1 = "char xm12 ='a';";

       // String token1 = "float _xiu = 2.5a ;";
        //int/x/=0/; <- esta es la correcta
        System.out.println("Cadena recibida: " + token1);
        System.out.println("");
        System.out.println("<variable>-><declaracion>");
        //int dim = this.separar(token1);
        String[] token =token1.split(" ");
        for (int i = 0; i < token.length; i++) { //
            if (token[i].equals("int")) {
               i=+3;
            }
             con=con+token1.charAt(i);
            System.out.println(" "+con);
        }
        
        for (int i = 0; i < token.length; i++) { //
            System.out.println(token[i]);   //Impresion para revisar las
        } //posiciones del arreglo
        //posiciones del arreglo
    }
}

    
