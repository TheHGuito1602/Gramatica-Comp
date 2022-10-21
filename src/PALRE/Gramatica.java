/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PALRE;

/**
 *
 * @author Edgar Gutierrez
 */
public class Gramatica {

    /**
     * @param args the command line arguments
     */
    
    //MANEJO DE SWITCH EN STRING
    public static void main(String[] args) {
        // TODO code application logic here
        String con="";
        String token="float x=0";
        //tring tipo="int";
        
        for(int i = 0;i<token.length();i++){
            if(token.charAt(i)!=' '){
                con=con+token.charAt(i);
                if(con.compareTo("int")==0|con.compareTo("float")==0){
                    
                    System.out.println("tipo->"+con);
                    if(token.charAt(i)!=' '){
                        con=con+token.charAt(i);
                        if(con.compareTo("x")==0){
                            System.out.println("id-> "+con);
                        }
                    }
                     
                }
            } else {
                break;
            }
           
            
        }
    }
    
}
