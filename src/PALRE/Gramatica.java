/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PALRE;

import Tablas.Tabla;
import javax.swing.JOptionPane;

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
    Errores ed = new Errores();
    Metodos a= new Metodos();
    //MANEJO DE SWITCH EN STRING
    public void inicio() {
        // TODO code application logic here
        String con = "";
        String []tokenD;
        
        String tokenS;
        //String token1= JOptionPane.showInputDialog("Ingrese declaracion");
        // String token1="int nombre = -121234aa5 ;";
        //String token1 = "char _1_X = 'a' , _123YU = '1' , _34erru = 'z' , _1uWuntu = '0' ;";
        //String token1 = "float xu = 1a , xu = 1.21 ;";
         //String token1 = "double x__q = 1.00 , yIU , z = +1.E-1 ;";

         //String token1 = "float _xiu = 2.5 ;";
        //String token1 = "float _xiu = 2.5 ;";
        //String token1 = "char xm12 = 'a' ;";
        // String token1 = "float _xiu = 2.5a ;";
        //int/x/=0/; <- esta es la correcta
        tokenS=ed.errorTD();
         System.out.println("Cadena recibida: " + tokenS+"\n");
        //System.out.println("");
        System.out.println("<variable>-><declaracion>");
        int dim = a.separar(tokenS);
        tokenD = new String[dim];
        tokenD = tokenS.split(" ");
        //=//Separa en un arreglo las partes
        //de la cadena en tokens
        
        //for (int i = 0; i < token.length; i++) { //
            //System.out.println(token[i]);   //Impresion para revisar las
        //} //posiciones del arreglo

        //tipo
        //id
        //inicializacion
        //lista 
        //;
        String n = " ";
        this.tipo(tokenD[0]);
        con = tokenD[0] + n;
        
        System.out.println(tokenD[1]);
        this.id(tokenD[1], tokenD[0]);
        con = con + tokenD[1] + n;
        //this.inicioAsignacion(token[2],token[0], token[1]);

        // con = con + token[2] + n;
        // con = con + token[3] + n;
        //System.out.println("Mi cadena " + con);
        //int x = 0, y = 1;
        for (int i = 2; i <= tokenD.length; i++) {
            switch (tokenD[i]) {
                case "=":
                    //System.out.println(con + "<- Esto se lleva hasta");

                    this.asignar(tokenD[0], tokenD[i], tokenD[i + 1], tokenD[i - 1], con);
                    con = con + tokenD[i] + tokenD[i + 1] + n;
                    //System.out.println(" "+con);
                    i++;
                    break;
                case ",":
                    // System.out.println("<declracion> -> " + token[0] + " "+token[i-1]+" <inicio_"+token[0]+"> <lista_"+token[0]+">;");
                    //System.out.println("<declracion> -> " + token[0] + " "+token[i-1]+" <lista_"+token[0]+">;");

                    //System.out.println(con + "<- Esto se lleva antes en ->"+ i);
                    this.crearLista(con, tokenD[i + 1], tokenD[0]);
                    //this.asignar(token[0], token[i], token[i + 1], token[i - 1]);
                    con = con + tokenD[i] + tokenD[i + 1] + n;
                    //  System.out.println(con + "<- Esto se lleva hasta el momento");
                    i++;
                    //Repetir
                    break;
                case ";":
                    if (i == (tokenD.length - 1)) {
                        this.puntoComa(tokenD);
                    } else {
                        System.out.println(tokenD[i] + " <-Error de final");
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
                System.out.println("<declaracion> -> " + revisar + "<id> <inicio_int> <lista_int>;");
                break;
            case "float":
                System.out.println("<declaracion> -> " + revisar + "<id> <inicio_float> <lista_float>;");
                break;
            case "char":
                System.out.println("<declaracion> -> " + revisar + "<id> <inicio_char> <lista_char>;");
                break;
            case "double":
                System.out.println("<declaracion> -> " + revisar + "<id> <inicio_double> <lista_double>;");
                break;
            default:
                System.out.println("<declaracion> -> ");
                System.out.println(revisar+"<- Error de Tipo de Dato");
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
        //System.out.println("<declaracion> -> " + tipo + " <id> <inicio_"+tipo+" <lista_"+tipo+";");
        for (int i = 0; i < revisar.length(); i++) {
            char c = revisar.charAt(i);
            int contarNumero = 0;
            asci = (int) c;

            if (revisar.charAt(0) == '1' || revisar.charAt(0) == '2' || revisar.charAt(0) == '3' || revisar.charAt(0) == '4' || revisar.charAt(0) == '5' || revisar.charAt(0) == '6' || revisar.charAt(0) == '7' || revisar.charAt(0) == '8' || revisar.charAt(0) == '9' || revisar.charAt(0) == '0') {
                contarNumero++;
                System.exit(0);

            } else {
                if ((asci >= 97 && asci <= 122) || (asci >= 65 && asci <= 90)) { //Checamos si la cadena tiene letras  entre a y z o existe un numero 
                    System.out.println("<declaracion> -> " + tipo + " " + v + "<letra> <resto_id> <inicio_" + tipo + "> <lista_" + tipo + ">;");
                    v = v + c;
                    System.out.println("<declaracion> -> " + tipo + " " + v + "<resto_id> <inicio_" + tipo + "> <lista_" + tipo + ">;");

                } else if (asci == 95) { //si hay guiones bajo
                    System.out.println("<declaracion> -> " + tipo + " " + v + "<resto_id> <inicio_" + tipo + "> <lista_" + tipo + ">;");

                    v = v + c;
                         System.out.println("<declaracion> -> " + tipo + " " + v + "<resto_id> <inicio_" + tipo + "> <lista_" + tipo + ">;");
                    // System.out.println("<declaracion> -> " + tipo +" "+v+"<letra> <resto_id> <inicio_" + tipo + "> <lista_" + tipo + ">;");
                } else {
                    if (asci >= 48 && asci <= 57) {
                        v = v + c;
                        System.out.println("<declaracion> -> " + tipo + " " + v + "<resto_id> <inicio_" + tipo + "> <lista_" + tipo + ">;");

                    } else if (asci == 95) { //si hay guiones bajo
                        System.out.println("<declaracion> -> " + tipo + " " + v + "<resto_id> <inicio_" + tipo + "> <lista_" + tipo + ">;");
                        System.out.println("<declaracion> -> " + tipo + " " + v + "_<resto_id> <inicio_" + tipo + "> <lista_" + tipo + ">;");
                        v = v + c;
                        System.out.println("<declaracion> -> " + tipo + " " + v + "<resto_id> <inicio_" + tipo + "> <lista_" + tipo + ">;");
                    }
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
        switch (tipo) {
            case "int":
                System.out.println("<declaracion> -> " + con + "<inicio_int> <lista_int> ;");
                this.crearEnteros(tipo, asignacion, valor, id, con);
                break;
            case "float":
                System.out.println("<declaracion> -> " + con + "<inicio_float> <lista_float>;");
                this.crearFlotantes(tipo, asignacion, valor, id, con);
                break;
            case "double":
                System.out.println("<declaracion> -> " + con + "<inicio_double> <lista_double>;");
                this.crearLargos(tipo, asignacion, valor, id, con);
                break;
            case "char":
                System.out.println("<declaracion> -> " + con + "<inicio_char> <lista_char>;");
                this.crearCaracteres(tipo, asignacion, valor, id,con);
                break;
            default:
                System.out.println("ErrorDeAsignacion");
                break;
        }
    }

    public void crearEnteros(String tipo, String asignacion, String valor, String id, String con) {
        System.out.println("<declaracion> -> " + con + "=<entero_signo> <lista_" + tipo + ">;");
        String total = "";
        int contarSigno = 0;
        for (int i = 0; i < valor.length(); i++) {
            asci = (int) valor.charAt(i);
            if (asci == 45 && contarSigno < 1 || asci == 43 && contarSigno < 1) {
                System.out.println("<declaracion> -> " + con + "=<signo> <entero_digito> <lista_" + tipo + ">;");
                total = total + valor.charAt(i);
                System.out.println("<declaracion> -> " + con + " " + asignacion + " " + total + "<entero_digito> <lista_" + tipo + ">;");
                contarSigno++;
            } else {
                System.out.println("<declaracion> -> " + con + " " + asignacion + " " + total + "<entero_digito>  <lista_" + tipo + ">;");
                //1er System.out.println("<declaracion> -> " + con + " " + asignacion + " "+total+"<resto_digito>  <lista_"+tipo+">;");

                if (asci >= 48 && asci <= 57) { //Checamos si la cadena tiene letras  entre 0 y 9
                    // System.out.println("<declaracion> -> " + con + " " + asignacion + " "+total+"<entero_digito>  <lista_"+tipo+">;");

                    System.out.println("<declaracion> -> " + con + " " + asignacion + " " + total + "<digito> <resto_digito> <lista_" + tipo + ">;");
                    total = total + valor.charAt(i);
                    System.out.println("<declaracion> -> " + con + " " + asignacion + " " + total + "<resto_digito> <lista_" + tipo + ">;");
                    // System.out.println("<declaracion> -> " + con + " " + asignacion + " " + total + "<resto_digito>  <lista_"+tipo+">;");
                } else {
                    System.out.println(valor + " <-ErrorEnCrearEnteros");
                    System.exit(0);
                }
            }
        }
        System.out.println("<declaracion> -> " + con + " " + asignacion + " " + total + "<lista_" + tipo + ">;");
    }

    public void crearCaracteres(String tipo, String asignacion, String valor, String id, String con) {
        //char, =, 'a', nombre de variable

        if (valor.length() == 3) {
            
            System.out.println("<declaracion> -> " + con + " " + asignacion + " " + "<caracteres><lista_char>;");
            if (valor.charAt(1) >= 48 && valor.charAt(1) <= 57 && valor.charAt(0) == 39 && valor.charAt(2) == 39) {   //Checamos si la cadena tiene numeros entre 0 y 9
                System.out.println("<declaracion> -> " + con + " " + asignacion + " " + "'<numeros>' <lista_char>;");
                System.out.println("<declaracion> -> " + con + " " + asignacion + " " + valor + "<lista_char>;");
            } else if (valor.charAt(1) >= 65 && valor.charAt(1) <= 90 && valor.charAt(0) == 39 && valor.charAt(2) == 39) { //Checamos si la cadena tiene letras  entre A y Z
                System.out.println("<declaracion> -> " + con + " " + asignacion + " " + "'<letras>' <lista_char>;");
                System.out.println("<declaracion> -> " + con + " " + asignacion + " " + valor + "<lista_char>;");
            } else if ((valor.charAt(1) >= 97 && valor.charAt(1) <= 122 && valor.charAt(0) == 39 && valor.charAt(2) == 39) || (asci >= 65 || asci <= 90 && valor.charAt(0) == 39 && valor.charAt(2) == 39)) {    //Checamos si la cadena tiene letras  entre a y z
                System.out.println("<declaracion> -> " + con + " " + asignacion + " " + "'<letras>' <lista_char>;");
                System.out.println("<declaracion> -> " + con + " " + asignacion + " " + valor + "<lista_chat>;");
            }
        } else {
            System.out.println(valor + " <-ErrorEnCrearCaracteres");
            System.exit(0);
        }
    }

    public void crearFlotantes(String tipo, String asignacion, String valor, String id, String con) {
        System.out.println("<declaracion> -> " + con + "<=flotantes> <lista_" + tipo + ">;");
        int contar = 0;
        String cadena = "";
        int contarSigno = 0;
        for (int i = 0; i < valor.length(); i++) {
            asci = (int) valor.charAt(i);
            if (contar == 1) {
                if (valor.charAt(i) == '.') {
                    System.out.println(valor + " <-ErrorX");

                    System.exit(0);
                } else {
                    if (asci >= 48 && asci <= 57) {//Checamos si la cadena tiene valores entre 0 y 9
                        System.out.println("<declaracion> -> " + con + " " + asignacion + " " + cadena + "<digito> <resto_digito>  <lista_" + tipo + ">;");
                        cadena = cadena + valor.charAt(i);
                        System.out.println("<declaracion> -> " + con + " " + asignacion + " " + cadena + "<resto_digito> <lista_" + tipo + ">;");
                    }
                }
            } else {
                if (valor.charAt(i) == '+' || valor.charAt(i) == '-') {
                    System.out.println("<declaracion> -> " + con + " =<entero_signo> <punto> <entero_digito> <lista_" + tipo + ">;");
                    System.out.println("<declaracion> -> " + con + " =<signo> <entero_digito> <punto> <entero_digito> <lista_" + tipo + ">;");
                    cadena = cadena + valor.charAt(i);
                    System.out.println("<declaracion> -> " + con + " " + asignacion + " " + cadena + " <entero_digito> <punto> <entero_digito> <lista_" + tipo + ">;");
                    contarSigno++;
                } else {
                    if (asci >= 48 && asci <= 57) {//Checamos si la cadena tiene valores entre 0 y 9
                        System.out.println("<declaracion> -> " + con + " " + asignacion + " " + cadena + "<digito> <resto_digito> <punto> <resto_digito> <lista_" + tipo + ">;");
                        cadena = cadena + valor.charAt(i);
                        System.out.println("<declaracion> -> " + con + " " + asignacion + " " + cadena + "<resto_digito> <punto> <resto_digito> <lista_" + tipo + ">;");
                    } else if (asci == 46 && contar < 1 || asci>= 97 && asci<=122) { //Checamos si la cadena tiene una sola vez un punto decimal
                        System.out.println("<declaracion> -> " + con + " " + asignacion + " " + cadena + "<resto_digito> <punto> <lista_" + tipo + ">;");
                        cadena = cadena + valor.charAt(i);
                        System.out.println("<declaracion> -> " + con + " " + asignacion + " " + cadena + " <resto_digito> <lista_" + tipo + ">;");
                        contar++;
                    } else {
                        System.out.println(valor + " <-ErrorEnCrearFlotantes");
                        System.exit(0);
                    }
                }
                if((asci >= 97 && asci <= 122) || (asci >= 65 && asci <= 90)){
                    System.out.println(valor + " <-ErrorEnCrearFlotantes");
                System.exit(0);
            }

            }

        }
    }

    public void crearLargos(String tipo, String asignacion, String valor, String id, String con) {
        System.out.println("<declaracion> -> " + con + "=<cientifica> <lista_" + tipo + ">;");

        int contarP = 0;
        int contarE = 0;
        int contarSigno = 0;
        int contar = 0;
        String cadena = "";
        //<=cientifica> 
        //<flotantes> <exponencial> <entero_signo>
        for (int i = 0; i < valor.length(); i++) {
            asci = (int) valor.charAt(i);
            if (contar == 1 || contarE == 1) {
                if (valor.charAt(i) == '.' || valor.charAt(i) == 'E' || valor.charAt(i) == 'e') {
                    System.out.println(valor + " <-ErrorX");

                    System.exit(0);
                } else {
                    if (valor.charAt(i) == '+' || valor.charAt(i) == '-') {
                        System.out.println("<declaracion> -> " + con + "" + asignacion + "" + cadena + "<signo> <entero_digito> <lista_" + tipo + ">;");
                        cadena = cadena + valor.charAt(i);
                        System.out.println("<declaracion> -> " + con + "" + asignacion + "" + cadena + "<entero_digito> <lista_" + tipo + ">;");
                    }
                    if (asci >= 48 && asci <= 57) {//Checamos si la cadena tiene valores entre 0 y 9
                        System.out.println("<declaracion> -> " + con + ""+ asignacion +""+ cadena +"<digito> <resto_digito>  <resto_digito> <lista_" + tipo + ">;");
                        cadena = cadena + valor.charAt(i);
                        System.out.println("<declaracion> -> " + con + "" + asignacion + "" + cadena + "<resto_digito>  <resto_digito> <lista_" + tipo + ">;");
                    }
                }
            } else {
                if (valor.charAt(i) == '+' || valor.charAt(i) == '-') {
                    System.out.println("<declaracion> -> " + con + "=<flotantes> <exponencial> <entero_signo> <lista_" + tipo + ">;");
                    System.out.println("<declaracion> -> " + con + "=<entero_signo> <punto> <entero_digito> <exponencial> <entero_signo> <lista_" + tipo + ">;");
                    System.out.println("<declaracion> -> " + con + "=<signo> <entero_digito> <punto> <entero_digito> <exponencial> <entero_signo> <lista_" + tipo + ">;");
                    cadena = cadena + valor.charAt(i);
                    System.out.println("<declaracion> -> " + con + "" + asignacion + "" + cadena + "<entero_digito> <punto> <entero_digito> <exponencial> <entero_signo> <lista_" + tipo + ">;");
                    contarSigno++;
                } else {
                    if (asci >= 48 && asci <= 57) {//Checamos si la cadena tiene valores entre 0 y 9
                        System.out.println("<declaracion> -> " + con + ""+ asignacion +""+cadena +"<digito> <resto_digito> <punto> <resto_digito> <exponencial> <entero_signo> <lista_" + tipo + ">;");
                        cadena = cadena + valor.charAt(i);
                        System.out.println("<declaracion> -> " + con + "" + asignacion + "" + cadena + "<resto_digito> <punto> <resto_digito> <exponencial> <entero_signo> <lista_" + tipo + ">;");
                    } else if (asci == 46 && contarP < 1) { //Checamos si la cadena tiene una sola vez un punto decimal
                        System.out.println("<declaracion> -> " + con + "" + asignacion + "" + cadena + "<resto_digito> <punto> <resto_digito> <exponencial> <entero_signo> <lista_" + tipo + ">;");
                        cadena = cadena + valor.charAt(i);
                        System.out.println("<declaracion> -> " + con + "" + asignacion + "" + cadena + "<resto_digito> <exponencial> <entero_signo> <lista_" + tipo + ">;");
                        contarP++;
                    } else if (asci == 69 && contarE < 1 && contarP == 1 || asci == 101 && contarE < 1 && contarP == 1) {
                        System.out.println("<declaracion> -> " + con + "" + asignacion + "" + cadena + "<exponencial> <entero_signo> <lista_" + tipo + ">;");
                        cadena = cadena + valor.charAt(i);
                        System.out.println("<declaracion> -> " + con + "" + asignacion + "" + cadena + "<entero_signo> <lista_" + tipo + ">;");
                        contarE++;
                    } else {
                        System.out.println(valor + " <-ErrorEnCrearLargos");
                        System.exit(0);
                    }
                }
                        if((asci >= 97 && asci <= 122) || (asci >= 65 && asci <= 90)){
                    System.out.println(cadena + " <-ErrorEnCrearFlotantes");
                System.exit(0);
                        }

            }

        }
        /*
        for (int i = 0; i < valor.length(); i++) {
            asci = (int) valor.charAt(i);
            if (asci == 45 && contarSigno < 1 || asci == 43 && contarSigno < 1) {
                cadena = cadena + valor.charAt(i);
                System.out.println("<declaracion> -> " + tipo + " " + id + " " + asignacion + " " + cadena + "<caracteres> <lista_char>;");
            } else {
                if (asci >= 48 && asci <= 57) {//Checamos si la cadena tiene valores entre 0 y 9
                    cadena = cadena + valor.charAt(i);
                    System.out.println("<declaracion> -> " + tipo + " " + id + " " + asignacion + " " + cadena + "<caracteres> <lista_char>;");
                } else if (asci == 46 && contar < 1) { //Checamos si la cadena tiene una sola vez un punto decimal
                    cadena = cadena + valor.charAt(i);
                    System.out.println("<declaracion> -> " + tipo + " " + id + " " + asignacion + " " + cadena + "<caracteres> <lista_char>;");
                    contar++;
                } else if (asci == 69 && contarE < 1 && contar == 1 || asci == 101 && contarE < 1 && contar == 1) {
                    cadena = cadena + valor.charAt(i);
                    System.out.println("<declaracion> -> " + tipo + " " + id + " " + asignacion + " " + cadena + "<caracteres> <lista_char>;");
                    contarE++;
                } else {
                    System.out.println(valor + " <-ErrorX");
                    System.exit(0);
                }
            }
        }*/

    }

    public void crearLista(String declaracion, String revisar, String tipo) {
        v = "";
        System.out.println("<declaracion> -> " + declaracion + ", <id> <inicio_" + tipo + "> <lista_" + tipo + ">;");
        //System.out.println("<declaracion> -> "+tipo+" <letra> <resto_id> <inicio_char> <lista_char>");
        for (int i = 0; i < revisar.length(); i++) {
            char c = revisar.charAt(i);
            int contarNumero = 0;
            asci = (int) c;
            
            if (revisar.charAt(0) == '1' || revisar.charAt(0) == '2' || revisar.charAt(0) == '3' || revisar.charAt(0) == '4' || revisar.charAt(0) == '5' || revisar.charAt(0) == '6' || revisar.charAt(0) == '7' || revisar.charAt(0) == '8' || revisar.charAt(0) == '9' || revisar.charAt(0) == '0') {
                contarNumero++;//Recomendacion repetir el usar el rango de numeros 0 al 9 en 
                System.exit(0);

            } else {
                if ((asci >= 97 && asci <= 122) || (asci >= 65 && asci <= 90)) { //Checamos si la cadena tiene letras  entre a y z
                    System.out.println("<declaracion> -> " + declaracion + ","+v+"<letra> <resto_id> <inicio_" + tipo + "> <lista_" + tipo + ">;");
                    v = v + c;
                    System.out.println("<declaracion> -> " + declaracion + ","+v+"<resto_id> <inicio_" + tipo + ">");

                } else if (asci == 95) {
                    //si hay guiones bajo
                    System.out.println("<declaracion> -> " + declaracion + ","+v+"_<resto_id> <inicio_" + tipo + "> <lista_char>;");
                    v = v + c;
                    System.out.println("<declaracion> -> " + declaracion + ","+v+"<resto_id> <lista_" + tipo + ">;");
                } else {
                    if (asci >= 48 && asci <= 57) {
                        System.out.println("<declaracion> -> " + declaracion + ","+v+"<digito> <resto_id> <inicio_" + tipo + "> <lista_" + tipo + ">;");
                        v = v + c;
                        System.out.println("<declaracion> -> " + declaracion + ","+v+"<resto_id> <inicio_" + tipo + "> <lista_" + tipo + ">;");

                    } else if (asci == 95) { //si hay guiones bajo
                        System.out.println("<declaracion> -> " + declaracion + ","+v+"<_resto_id> <inicio_" + tipo + "> <lista_" + tipo + ">;");
                        v = v + c;
                        System.out.println("<declaracion> -> " + declaracion + ","+v+"<resto_id> <inicio_" + tipo + "> <lista_" + tipo + ">;");
                    }
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
sout    dbvfbfbfbfbf
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
