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
        String [] arreglo ;
        String conca = "";
        System.out.println(cadena);
        
        for(int i = 0; i<cadena.length();i++){
            
            if(cadena.charAt(i) ==';' && i==cadena.length()-1){
                dim++;
            }else if(cadena.charAt(i) ==',' && cadena.charAt(i) !='=' &&cadena.charAt(i) !=';'){
                dim = dim + 2;
            }else if(cadena.charAt(i) =='='&&cadena.charAt(i) !=';'){
                dim = dim + 2;
            }
            
        }
        
        System.out.println(dim + "<- Total de espacios");
        arreglo = new String [dim];
        int a= 0;
        do{
           conca = conca+cadena.charAt(a);
           a++;
            System.out.println(conca);
        }while(!conca.equalsIgnoreCase("int"));
    }
}
