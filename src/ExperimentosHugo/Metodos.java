/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExperimentosHugo;

/**
 *
 * @author Hugo Prieto Velázquez, C-5
 */
public class Metodos {
    public void separar(String cadena){
        int dim = 2;
        System.out.println(cadena);
        
        for(int i = 0; i<cadena.length();i++){
            if(cadena.charAt(i)==';'||
                cadena.charAt(i)=='='
                ){
                dim++;
            }else if(cadena.charAt(i)==','){
                dim=dim+2;
            }
        }
        System.out.println("Total de espacios: " + dim);
    }
}
