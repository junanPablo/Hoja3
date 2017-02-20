/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HojadeTrabajo;

import java.util.HashSet;
import java.util.Set;

/*
*Referencias
*http://www.java2novice.com/java-sorting-algorithms/insertion-sort/
*http://courses.cs.washington.edu/courses/cse373/01wi/slides/Measurement/sld010.htm
*http://www.algolist.net/Algorithms/Sorting/Bubble_sort
*https://mathbits.com/MathBits/Java/arrays/Bubble.htm
*
*
*
*/
/**
 *
 * @author Juan Pablo Merck
 */
public class Ordenamientos {
    
    //metodo insertionSort
    public  NodoNum [] InsertionSort(NodoNum[] laLista){

        int control=0;
        int orden=1;
        
        while(orden<(laLista.length)){
            int valor = laLista[orden].getNum();
            for(control=orden;control>0;control--){
                if(valor<laLista[control-1].getNum()){
                    laLista[control]=laLista[control-1];
                }else{
                    break;
                }
            }
            laLista[control].setNum(valor);
            orden = orden+1;
            
        }
 
        
        return laLista;
    }
    //bubble sort
    public String bubbleSort(NodoNum[] laLista){
        boolean swapped = true;
        int j=0;
        int temp;
        while(swapped){
            swapped = false;
            j++;
            for(int i =0; i<(laLista.length-j);i++){
                if(laLista[i].getNum()>laLista[i+1].getNum()){
                    temp = laLista[i].getNum();
                    laLista[i]=laLista[i+1];
                    laLista[i+1].setNum(temp);
                    swapped=true;
                }
            }

        }
        String cadena="";
        for(int i =0; i<(laLista.length);i++){
            cadena+=laLista[i].getNum()+"\n";
        }
        return cadena;   
    }
    
    
    //merge sort
    public String mergeSort(NodoNum A[],int izq, int m, int der){
       int i, j, k;
       int n=A.length;
       NodoNum [] B = new NodoNum[A.length]; //array auxiliar
       for (i=izq; i<=der; i++){ //copia ambas mitades en el array auxiliar
            B[i]=A[i];
            i=izq; j=m+1; k=izq;
            while (i<=m && j<=der){ //copia el siguiente elemento más grande
                if (B[i].getNum()<=B[j].getNum()){
                         A[k++]=B[i++];
                }else{
                         A[k++]=B[j++];
                }
            }
            while (i<=m){ //copia los elementos que quedan de la
                A[k++]=B[i++]; //primera mitad (si los hay)
            }
       }
       
       String cadena="";
       for(int p=0; p<n; p++){
           cadena+=A[p].getNum()+"\n";
       }
       return cadena;
    }
    
    
    
    
    
}
