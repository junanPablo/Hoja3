/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HojadeTrabajo;

/**
 *
 * @author Juan Pablo Merck
 */
public class NodoNum implements Comparable <NodoNum>{
    protected int numero;
    //getter y setter
    public void setNum(int numero){
        this.numero=numero;
    }
    public int getNum(){
        return numero;
    }
    @Override
    public int compareTo(NodoNum miNum) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        if((numero-miNum.getNum())>0){
            return 1; 
        }if(numero-miNum.getNum()<0){
            return -1;
        }
        return 0;
    }
    
}
