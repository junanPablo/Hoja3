/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HojadeTrabajo;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


/**
 *
 * @author Juan Pablo Merck
 */
public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException{
        ArchivoNum miArch = new ArchivoNum();
        Ordenamientos miSort = new Ordenamientos();
        
        int entrada=0;
        
        try{
            System.out.println("Ingrese un numero entero\n");
            Scanner tecla = new Scanner(System.in);
            entrada=tecla.nextInt();
            String [] miLista = miArch.miArchivo("hoja.txt", entrada);

                       
            NodoNum [] aleatorio = new NodoNum[entrada];
            for(int i=0; i<aleatorio.length; i++){
                aleatorio[i] = new NodoNum();
                aleatorio[i].setNum(Integer.parseInt(miLista[i]));   
            }
            System.out.println("No ordenados:\n");
            for(int i =0; i<(aleatorio.length);i++){
                System.out.println(aleatorio[i].getNum());
            }

            
            System.out.println("\nInsertion Sort:\n");
            String miCadena="";
            //insertionSort
            aleatorio = miSort.InsertionSort(aleatorio);
            for(int i=0; i<aleatorio.length;i++){
                System.out.println(aleatorio[i].getNum());
            }
            
            System.out.println("\nbubble Sort:\n");
            //bubblesort
            System.out.println(miSort.bubbleSort(aleatorio));
            //mergeSort
            System.out.println("\nmerge Sort:\n");
            
            int medio = aleatorio.length/2;
            System.out.println(miSort.mergeSort(aleatorio, aleatorio[0].getNum(), aleatorio[medio].getNum(), aleatorio[entrada-1].getNum()));
            //System.out.println("\nmi numero es:\n");
            //System.out.println(miLista.length);
        }
        
        catch(Exception e){
            System.out.println("Ingrese un numero entero por favor y vuelva a correrlo");
        }

    } 

}
