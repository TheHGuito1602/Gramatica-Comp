/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PALRES;

/**
 *
 * @author Edgar Gutierrez
 */
public class PALRE {
   private String simbolo;
   private String componenteLexico;
   private String valorAtributo;

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getComponenteLexico() {
        return componenteLexico;
    }

    public void setComponenteLexico(String componenteLexico) {
        this.componenteLexico = componenteLexico;
    }

    public String getValorAtributo() {
        return valorAtributo;
    }

    public void setValorAtributo(String valorAtributo) {
        this.valorAtributo = valorAtributo;
    }

    public PALRE(String simbolo, String componenteLexico, String valorAtributo) {
        this.simbolo = simbolo;
        this.componenteLexico = componenteLexico;
        this.valorAtributo = valorAtributo;
    }
   
   
}
