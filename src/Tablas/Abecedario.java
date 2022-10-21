/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tablas;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author eljug
 */
public class Abecedario {
        public void minus(){
            ArrayList<String>[][] arraylist1 = new ArrayList[27][27];
            arraylist1[0][0] = new ArrayList<>();
            
            arraylist1[0][0].add("Letra");
            arraylist1[0][1].add("a");
            arraylist1[0][2].add("b");
            arraylist1[0][3].add("c");
            arraylist1[0][4].add("d");
            arraylist1[0][5].add("e");
            arraylist1[0][6].add("f");
            arraylist1[0][7].add("g");
            arraylist1[0][8].add("h");
            arraylist1[0][9].add("i");
            arraylist1[0][10].add("j");
            arraylist1[0][11].add("k");
            arraylist1[0][12].add("l");
            arraylist1[0][13].add("m");
            arraylist1[0][14].add("n");
            arraylist1[0][15].add("o");
            arraylist1[0][16].add("p");
            arraylist1[0][17].add("q");
            arraylist1[0][18].add("r");
            arraylist1[0][19].add("s");
            arraylist1[0][20].add("t");
            arraylist1[0][21].add("u");
            arraylist1[0][22].add("v");
            arraylist1[0][23].add("w");
            arraylist1[0][24].add("x");
            arraylist1[0][25].add("y");
            arraylist1[0][26].add("z");
            
             System.out.println(Arrays.deepToString(arraylist1));
            
            for(int i = 0; i<arraylist1.length;i++){
                for(int j = 0; j<arraylist1[0].length;j++){
                    System.out.println(arraylist1[i][j]);
                }
                
            }
        }
        public void mayus(){
            
        }
}
