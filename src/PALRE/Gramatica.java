/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PALRE;

import Tablas.Tabla;

/**
 *
 * @author Edgar Gutierrez y Hugo Prieto Velázquez, C-5
 */
public class Gramatica {

    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
     */
    /**
     *
     * @author Edgar Gutierrez
     */
    /**
     * @param args the command line arguments
     */
    Tabla t = new Tabla();
    String v = "";
    int asci = 0;
    // int =0;
    int asci2 = 0;
    String d = "";

    //MANEJO DE SWITCH EN STRING
    public void inicio() {
        // TODO code application logic here
        String con = "";

        String token1 = "double yu = 12 , xu = 1.2e12 , y ;";
        //String token1 = "double x , y5 0 ;";

        // String token1 = "float _xiu = 2.5a ;";
        //String token1 = "float _xiu = 2.5 ;";
        //String token1 = "char xm12 ='a';";
        // String token1 = "float _xiu = 2.5a ;";
        //int/x/=0/; <- esta es la correcta
        System.out.println("Cadena recibida: " + token1);
        System.out.println("");
        System.out.println("<variable>-><declaracion>");
        int dim = this.separar(token1);
        String[] token = new String[dim];
        token = token1.split(" ", '=');
        //=//Separa en un arreglo las partes
        //de la cadena en tokens
        for (int i = 0; i < token.length; i++) { //
            System.out.println(token[i]);   //Impresion para revisar las
        } //posiciones del arreglo

        //tipo
        //id
        //inicializacion
        //lista 
        //;
        this.tipo(token[0]);
        this.id(token[1], token[0]);

        //this.inicioAsignacion(token[2],token[0], token[1]);
        String n = " ";
        con = token[0] + n;
        con = con + token[1] + n;
        //con = con + token[2] + n;
        //con = con + token[3] + n;
        System.out.println("Mi cadena " + con);

        //int x = 0, y = 1;
        for (int i = 2; i <= token.length; i++) {
            switch (token[i]) {
                case "=":
                    System.out.println(con + "<- Esto se lleva hasta");
                    this.asignar(token[0], token[i], token[i + 1], token[i - 1], con);
                    con = con + token[i] + token[i+1] +n;
                    i++;
                    break;
                case ",":
                    this.crearLista(con, token[i + 1]);
                    //this.asignar(token[0], token[i], token[i + 1], token[i - 1]);
                    con = con + token[i] + token[i + 1] + n;
                    System.out.println(con + "<-Acabamos de asignar esto a la cadena");
                    i++;
                    //Repetir
                    break;
                case ";":
                    if (i == (token.length - 1)) {
                        this.puntoComa(token);
                    } else {
                        System.out.println(token[i] + " <-Error");
                        System.exit(0);
                    }
                    break;
                default:
                    System.out.println("ErrorFinal");
                    System.exit(0);
                    break;
            }
        }

        //if(token[2] != "=" || token[2] != ","||token[2] != ";" ){
        //    System.out.println("Error");
        //    System.exit(0);
        //}
        //String n="";
        //con=n.concat(token[1]);
        //System.out.println(" "+con);
    }

    public void tipo(String revisar) {

        switch (revisar) {
            case "int":
                System.out.println("<tipo> -> " + revisar + "<id><inicio_int>;");
                break;
            case "float":
                System.out.println("<declaracion> -> " + revisar + "<id><inicio_float>;");
                break;
            case "char":
                System.out.println("<declaracion> -> " + revisar + "<id><inicio_char>;");
                break;
            case "double":
                System.out.println("<declaracion> -> " + revisar + "<id><inicio_double>;");
                break;
            default:
                System.out.println("<declaracion> ->" + revisar + ";");
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

    public int separar(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
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
    public void id(String revisar, String tipo) {

        //System.out.println("<declaracion>-> "+tipo+" <letra> <resto_id> <inicio_char> <lista_char>");
        System.out.println("<declaracion> -> " + tipo + " <letra> <resto_id> <inicio_char><lista_char>;");
        for (int i = 0; i < revisar.length(); i++) {
            char c = revisar.charAt(i);
            int contarNumero = 0;
            asci = (int) c;

            if (revisar.charAt(0) == '1' || revisar.charAt(0) == '2' || revisar.charAt(0) == '3' || revisar.charAt(0) == '4' || revisar.charAt(0) == '5' || revisar.charAt(0) == '6' || revisar.charAt(0) == '7' || revisar.charAt(0) == '8' || revisar.charAt(0) == '9' || revisar.charAt(0) == '0') {
                contarNumero++;
                System.exit(0);

            } else {
                if ((asci >= 97 || asci > 122) || asci >= 48 && asci <= 57) { //Checamos si la cadena tiene letras  entre a y z
                    v = v + c;
                    System.out.println("<declaracion>-> " + tipo + " " + v + "<resto_id> <inicio_char>");

                } else if (asci == 95) { //si hay guiones bajo
                    System.out.println("<declaracion> -> " + tipo + " _<resto_id> <inicio_char> <lista_char>;");
                    v = v + c;
                    System.out.println("<declaracion> -> " + tipo + " " + v + "<letra> <resto_id> <inicio_char> <lista_char>;");
                } else {

                    //si no hay esas condiciones se da break
                    break;
                }
            }
        }
    }

    public void puntoComa(String[] token) {
        String fin = "";
        for (int i = 0; i < token.length - 1; i++) {
            fin = fin + token[i] + " ";
        }
        System.out.println("<declaracion> -> " + fin + ";");
        System.exit(0);
    }

    public void asignar(String tipo, String asignacion, String valor, String id, String con) {
        System.out.println(con+"<- entramos a asignar");
        switch (tipo) {
            case "int":
                System.out.println("<declaracion> -> " + con+ " " + asignacion + " <lista_float>;");
                this.crearEnteros(tipo, asignacion, valor, id, con);
                break;
            case "float":
                System.out.println("<declaracion> -> " + con + " " + asignacion + " <lista_float>;");
                this.crearFlotantes(tipo, asignacion, valor, id, con);
                break;
            case "double":
                System.out.println("<declaracion> -> " + con + " " + asignacion + " <lista_double>;");
                this.crearLargos(tipo, asignacion, valor, id, con);
                break;
            case "char":
                System.out.println("<declaracion> -> " + con + " " + asignacion + " <lista_char>;");
                this.crearCaracteres(tipo, asignacion, valor, id, con);
                break;
        }
    }

    public void crearEnteros(String tipo, String asignacion, String valor, String id,String con) {
        String total = "";
        int contarSigno = 0;
        for (int i = 0; i < valor.length(); i++) {
            asci = (int) valor.charAt(i);
            if (asci == 45 && contarSigno < 1 || asci == 43 && contarSigno < 1) {
                total = total + valor.charAt(i);
                System.out.println("<declaracion> -> " + con + "= " + total + "<numeros> <lista_int>;");
                contarSigno++;
            } else {
                if (asci >= 48 && asci <= 57) { //Checamos si la cadena tiene letras  entre 0 y 9
                    total = total + valor.charAt(i);
                    System.out.println("<declaracion> -> " + con + "= " + total + "<numeros> <lista_int>;");
                } else {
                    System.out.println(valor + " <-ErrorX");
                    System.exit(0);
                }
            }
        }

    }

    public void crearCaracteres(String tipo, String asignacion, String valor, String id, String con) {
        if (valor.length() <= 1) {
            if (asci >= 48 && asci <= 57) {   //Checamos si la cadena tiene numeros entre 0 y 9
                System.out.println("<declaracion> -> " + con + "= '" + valor + "'<caracteres> <lista_char>;");
            } else if (asci >= 65 && asci <= 90) { //Checamos si la cadena tiene letras  entre A y Z
                System.out.println("<declaracion> -> " + con + "= '" + valor + "'<caracteres> <lista_char>;");
            } else if (asci >= 97 && asci <= 122) {    //Checamos si la cadena tiene letras  entre a y z
                System.out.println("<declaracion> -> " + con + "= '" + valor + "'caracteres> <lista_chat>;");
            }
        } else {
            System.out.println(valor + " <-ErrorX");
            System.exit(0);
        }
    }

    public void crearFlotantes(String tipo, String asignacion, String valor, String id,String con) {
        int contar = 0;
        String cadena = "";
        int contarSigno = 0;
        for (int i = 0; i < valor.length(); i++) {
            asci = (int) valor.charAt(i);
            if (asci == 45 && contarSigno < 1 || asci == 43 && contarSigno < 1) {
                cadena = cadena + valor.charAt(i);
                System.out.println("<declaracion> -> " + con + "= " + cadena + "<caracteres> <lista_char>;");
                contarSigno++;
            } else {
                if (asci >= 48 && asci <= 57) {//Checamos si la cadena tiene valores entre 0 y 9
                    cadena = cadena + valor.charAt(i);
                    System.out.println("<declaracion> -> " + con + "= " + cadena + "<caracteres> <lista_char>;");
                } else if (asci == 46 && contar < 1) { //Checamos si la cadena tiene una sola vez un punto decimal
                    cadena = cadena + valor.charAt(i);
                    System.out.println("<declaracion> -> " + con  + "= " + cadena + "<caracteres> <lista_char>;");
                    contar++;
                } else {
                    System.out.println(valor + " <-ErrorX");
                    System.exit(0);
                }
            }

        }
    }

    public void crearLargos(String tipo, String asignacion, String valor, String id, String con) {
        int contar = 0;
        int contarE = 0;
        int contarSigno = 0;
        String cadena = "";
        for (int i = 0; i < valor.length(); i++) {
            asci = (int) valor.charAt(i);
            if (asci == 45 && contarSigno < 1 || asci == 43 && contarSigno < 1) {
                cadena = cadena + valor.charAt(i);
                System.out.println("<declaracion> -> " + con + "= " + cadena + "<caracteres> <lista_char>;");
            } else {
                if (asci >= 48 && asci <= 57) {//Checamos si la cadena tiene valores entre 0 y 9
                    cadena = cadena + valor.charAt(i);
                    System.out.println("<declaracion> -> " + con + "= " + cadena + "<caracteres> <lista_char>;");
                } else if (asci == 46 && contar < 1) { //Checamos si la cadena tiene una sola vez un punto decimal
                    cadena = cadena + valor.charAt(i);
                    System.out.println("<declaracion> -> " + con + "= " + cadena + "<caracteres> <lista_char>;");
                    contar++;
                } else if (asci == 69 && contarE < 1 && contar == 1 || asci == 101 && contarE < 1 && contar == 1) {
                    cadena = cadena + valor.charAt(i);
                    System.out.println("<declaracion> -> " + con + "= " + cadena + "<caracteres> <lista_char>;");
                    contarE++;
                } else {
                    System.out.println(valor + " <-ErrorX");
                    System.exit(0);
                }
            }
        }
    }

    public void crearLista(String declaracion, String revisar) {

        //System.out.println("<declaracion>-> "+tipo+" <letra> <resto_id> <inicio_char> <lista_char>");
        System.out.println("<declaracion> -> " + declaracion + " <letra> <resto_id> <inicio_char><lista_char>;");
        for (int i = 0; i < revisar.length(); i++) {
            char c = revisar.charAt(i);
            int contarNumero = 0;
            asci = (int) c;

            if (revisar.charAt(0) == '1' || revisar.charAt(0) == '2' || revisar.charAt(0) == '3' || revisar.charAt(0) == '4' || revisar.charAt(0) == '5' || revisar.charAt(0) == '6' || revisar.charAt(0) == '7' || revisar.charAt(0) == '8' || revisar.charAt(0) == '9' || revisar.charAt(0) == '0') {
                contarNumero++;//Recomendacion repetir el usar el rango de numeros 0 al 9 en 
                System.exit(0);

            } else {
                if ((asci >= 97 || asci > 122) || asci >= 48 && asci <= 57) { //Checamos si la cadena tiene letras  entre a y z
                    v = v + c;
                    System.out.println("<declaracion>-> " + declaracion + " " + v + "<resto_id> <inicio_char>");

                } else if (asci == 95) { //si hay guiones bajo
                    System.out.println("<declaracion> -> " + declaracion + " _<resto_id> <inicio_char> <lista_char>;");
                    v = v + c;
                    System.out.println("<declaracion> -> " + declaracion + " " + v + " <lista_char>;");
                } else {
                    System.out.println(revisar.charAt(i) + "<-ErrorCrearLista");
                    System.exit(0);
                    //si no hay esas condiciones se da break
                    break;
                }
            }
            
        }
    }
}


/*
    public void inicioAsignacion(String r,String tipo,String id){
        if(r.charAt(0)=='='){
            
        
        for(int i=0;i<r.length();i++){
            char s=r.charAt(i);
            asci2=(int)s;
            if((asci>=49 ||asci2>57)){
                
                d=d+s;
                System.out.println("<declaracion>-> "+tipo+ " " +id+" "+d+" <inicio_char>");
            }
        
    
            }
            
        }else{
            if(r.charAt(0)==' '){
                
    }
    }
    }
}
 */

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
