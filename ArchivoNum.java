/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HojadeTrabajo;
//referencias 
/*
*http://www.forosdelweb.com/f45/rellenar-array-con-numeros-aleatorios-sin-repetir-498606/
*http://www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=240:generacion-de-numeros-aleatorios-en-java-rangos-clase-random-ejemplos-ejercicios-resueltos-cu00906c&catid=58:curso-lenguaje-programacion-java-nivel-avanzado-i&Itemid=180
*http://codigoprogramacion.com/cursos/java/130-manejo-de-archivos-en-java-escribir-en-un-archivo-de-texto-txt.html#.WKkuCTs19PY
*http://www.lawebdelprogramador.com/foros/Java/1225652-Salto-de-linea-de-java-a-un-fichero.html
*http://www.forosdelweb.com/f45/salto-linea-fichero-texto-417913/
*/
/**
 *
 * @author Juan Pablo Merck
 * Descripsion: este programa crea un archivo donde estaran almacenados 
 * numeros random del 0 al 2000
 */
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArchivoNum {
    public int[] listaNumeros(int cant){
        //generacion de mi numero random y 
        Random miRandom = new Random();
        int []orden = new int [cant];//cadena que servira para comparar los numero generados aleatoriamente con una lista orenada
        int [] numeros = new int[cant];
        int cont=cant;//variable de control
        int res;
        
        //rellenando mi cadena ordenada
        for(int i=0; i<cant;i++){
            orden[i]=i+1;
        }
        //rellenando mi cadena aleatoria
        for(int i=0; i<cant; i++){
            res = miRandom.nextInt(cont);
            numeros[i]=orden[res];
            orden[res]=orden[cont-1];
            cont--;
        }
        return numeros;
    }
    /*
    *@Metodo para crear y almacenar los numeros generados
    */
    
    public String[] miArchivo(String arch,int cant) throws UnsupportedEncodingException{
        int [] miLista = listaNumeros(cant);
        String cadena="";
        String temp = "";
        
         
        for(int i=0;i<cant;i++){
            cadena+=miLista[i]+"\r\n";// la \r\n me sirve para hacer un salto de linea en un txt
        }
        
        //creacion y almacenamiento de los numeros generados por el random
        try {
            PrintWriter archivo = new PrintWriter(arch);
            archivo.println(cadena);
            System.out.println("Se creo el archivo y se agrego los numeros");
            archivo.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivoNum.class.getName()).log(Level.SEVERE, null, ex);
        }
        String []temp3 = new String[cant];
        try {
            //lectura de mis datos almacenados
            Scanner lectura = new Scanner(new File(arch));
            for(int i=0; i<cant; i++){
                temp = lectura.next();
                temp3[i]=temp;
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivoNum.class.getName()).log(Level.SEVERE, null, ex);
        }

        return temp3;
    }
    
}