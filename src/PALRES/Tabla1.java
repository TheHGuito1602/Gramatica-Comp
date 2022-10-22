/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PALRES;

import java.util.ArrayList;

/**
 *
 * @author Edgar Gutierrez
 */
public class Tabla1 {

    public void h() {

        PALRE l;

        ArrayList<PALRE> palabras;

        palabras = new ArrayList();

        l = new PALRE("int", "PALRE", "int");
        palabras.add(l);
        l = new PALRE("float", "PALRE", "float");
        palabras.add(l);
        

        for (int i = 0; i < palabras.size(); i++) {
            System.out.println(" " + palabras.get(i).getSimbolo() + " " + palabras.get(i).getComponenteLexico() + " " + palabras.get(i).getValorAtributo());
            System.out.println("");
        }

    }
}
