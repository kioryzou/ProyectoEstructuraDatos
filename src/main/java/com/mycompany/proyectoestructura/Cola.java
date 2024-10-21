/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoestructura;

import javax.swing.JOptionPane;

/**
 *
 * @author dques
 */
public class Cola {
    private Nodo prim, ult;
        
    public boolean esVacio(){
        return prim==null;
    }
    
    public int ingresarTicket(Tiquete tick){
        Nodo nuevo=new Nodo(tick);
        if(this.esVacio()){
            prim=ult=nuevo;
            return 1;
        }else{
            ult.setSig(nuevo);
            ult=nuevo;
        }
        return 1;
    }
    
    public int atiende(){
        if(this.esVacio()){
            return -1;
        }else{
            if(prim==ult){
                prim=ult=null;
            }else{
                prim=prim.getSig();
            }
            return 1;
        }
    }
 
    
    
    @Override
    public String toString(){
        String s = "";
        if(esVacio()){
            s="Cola Vacia";
        }else{
            Nodo nodo = prim;
            while(nodo!=null){
                s+= nodo+"\n";
                nodo = nodo.getSig();
            }
        }
        return s;
    }
    
}
