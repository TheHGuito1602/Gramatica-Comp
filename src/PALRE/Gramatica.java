/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PALRE;

import PALRES.Tabla1;
import Tablas.Abecedario;

/**
 *
 * @author Edgar Gutierrez
 */
public class Gramatica {

    /**
     * @param args the command line arguments
     */
    
    //MANEJO DE SWITCH EN STRING
    public void inicio(){
        // TODO code application logic here
        String con="";
        String token="float x=0";
        Gram a = new Gram();
        String tipo="int";
        for(int i = 0;i<token.length();i++){
            if(token.charAt(i)!=' '){
                con=con+token.charAt(i);
                tipo(con);
            }
            
        }
                        

    }
        
            
            public void tipo(String revisar){
                String i="int";
                String f="float";
                String d="double";
                String c="char";
                if(i.compareTo(revisar)==0){
                    System.out.println("<tipo>-> "+revisar+"<id><inicio_int>;");
                    
                }
                if(f.compareTo(revisar)==0){
                    System.out.println("<tipo>-> "+revisar+"<id><inicio_float>;");
                    
                }
                
            }
            
            }
          /*
        if(con.compareTo(a.tipo())==0|con.compareTo("float")==0){
                    
                    System.out.println("tipo->"+con);
                    if(token.charAt(i)!=' '){
                        con=con+token.charAt(i);
                        if(con.compareTo("x")==0){
                            System.out.println("id-> "+con);
                        }
                    }
                     
                }
        */
        
            
        
        
    
    

