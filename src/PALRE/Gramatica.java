/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PALRE;

import PALRES.Tabla1;
import Tablas.Abecedario;
import Tablas.Tabla;

/**
 *
 * @author Edgar Gutierrez
 */
public class Gramatica {

    /**
     * @param args the command line arguments
     */
            Tabla t=new Tabla();

    //MANEJO DE SWITCH EN STRING
    public void inicio(){
        // TODO code application logic here
        String con="";
        String token1="char abaa=0 ;";
        //int/x/=0/; <- esta es la correcta
        System.out.println("Cadena recibida: "+token1);
        System.out.println("");
        System.out.println("<variable>-><declaracion>");
        int dim = this.separar(token1);
        String [] token = new String [dim];
        token = token1.split(" ");//Separa en un arreglo las partes
                                        //de la cadena en tokens
        for(int i = 0; i<token.length;i++){ //
            System.out.println(token[i]);   //Impresion para revisar las
        }                                   //posiciones del arreglo
        
        //tipo
        //id
        //inicializacion
        //lista 
        //;
        this.tipo(token[0]);
        this.id(token[1]); //<- Propuesta
        

    }
        
            
            public void tipo(String revisar){
                String i="int";
                String f="float";
                String d="double";
                String c="char";
                
                switch (revisar){
                    case "int":
                        System.out.println("<tipo>-> "+revisar+"<id><inicio_int>;");
                        break;
                    case "float":
                        System.out.println("<declaracion>-> "+revisar+"<id><inicio_float>;");
                        break;
                    case "char":
                        System.out.println("<declaracion>-> "+revisar+"<id><inicio_char>;");
                        break;
                    case "double":
                        System.out.println("<declaracion>-> "+revisar+"<id><inicio_double>;");
                        break;
                    default:
                        System.out.println("<declaracion>->"+revisar+";");
                        System.out.println(" Error");
                        break;
                }
                /*
                if(i.compareTo(revisar)==0){
                    System.out.println("<tipo>-> "+revisar+"<id><inicio_int>;");
                    
                }
                if(f.compareTo(revisar)==0){
                    System.out.println("<declaracion>-> "+revisar+"<id><inicio_float>;");
                    
                }
                if(d.compareTo(revisar)==0){
                    System.out.println("<declaracion>-> "+revisar+"<id><inicio_double>;");                
                }
                
                if(c.compareTo(revisar)==0){
                    System.out.println("<declaracion>-> "+revisar+"<id><inicio_char>;");                

                }*/
                
                
                System.out.println("");
            }
            
            public int separar(String cadena){
                int contador = 0;
                for(int i = 0; i<cadena.length();i++){
                    if(cadena.charAt(i)!=' '){
                        contador++;
                    }
                }
                
                return contador;
            }
            /*
            public void id(String revisar,String token){
                //System.out.println("<declaracion>-> "+token+);
                for(int i=1;i<revisar.length();i++){
                    if(revisar.charAt(i)=='_'||revisar.charAt(i)=='l'){
                      System.out.println("<declaracion>-> "+token+" "+revisar.charAt(i)+"<inicio_char> ;");
                    }
                }
                
            }
            */
            
             public void id(String revisar){
                //System.out.println("<declaracion>-> "+token+);
                for(int i=0;i<revisar.length();i++){
                    char c=revisar.charAt(i);
                    if(!(c>='a' && c>='z')){
                         System.out.println("<declaracion>-> "+c+"<inicio_double>;");
                    }
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
        
            
        
        
    
    

