/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tablas;

import java.util.ArrayList;

/**
 *
 * @author Edgar Gutierrez
 */
public class Tabla {
    ArrayList a = new ArrayList();
    public void palabras(){
        
}
    
    public String especial(String c ){
        a.add('a');
        a.add('b');  //48 30
        a.add("c");  //xi
        a.add("d");
        a.add("f");
        String v = "";
        
            for(int i=0;i<a.size();i++){
            if(c==a.get(i)){
                
                v=v+c;
                
                        
            }else{
                break;
                        
            }
            
        }
        
    return v;
    }
}
