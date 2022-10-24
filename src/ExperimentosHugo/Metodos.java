/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExperimentosHugo;

/**
 *
 * @author eljug
 */
public class Metodos {
    public void separar(String cadena){
        int contador = 0;
        for(int i = 0; i<cadena.length();i++){
            if(cadena.charAt(i)==' '){
                contador++;
            }
        }
    }
}
