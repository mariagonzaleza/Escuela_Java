/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class TestGenericos {
   

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    // public void hello() {}
    public void metodosGenericos(){
        ArrayList <Integer> listaInt = new ArrayList<>(); 
        insertarDobleGenerico(listaInt, 10); 
        insertarDobleGenerico(listaInt, 29); 
        System.out.println("Enteros: " + listaInt.toString());
        
        ArrayList <String> listaStr = new ArrayList<>(); 
        insertarDobleGenerico(listaStr, "Texto 1"); 
        insertarDobleGenerico(listaStr, "Texto 2"); 
        System.out.println("Palabras: " + listaStr.toString());
        imprimirLista(listaStr); 
        String [] cadena= new String[3]; 
        cadena[0]="Hola"; 
        cadena[1]="Hola"; 
        cadena[2]="Hola"; 
        imprimirArray(cadena); 
        ArrayList <String> listanueva = new ArrayList<>(); 
        listanueva= arrayToArrayList(cadena); 
        System.out.println(listanueva.toString()); 
        
        
        
        
    }
    //Queremos hacer un metodo que haga 2 adds
    public static <Tipo> void insertarDobleGenerico(ArrayList<Tipo> lista, Tipo valor){
        lista.add(valor);
        lista.add(valor);
    }   
    /*
    -----------------------CLASE GENERICA DUPLICAR PARA INTEGER---------------------------------
    public static <Integer> void insertarDobleGenericoInteger(ArrayList<Integer> lista, Integer valor){
        lista.add(valor);
        lista.add(valor);
    }
    */
    /*Método genérico mostrar lista por pantalla*/ 
    public static <Tipo> void imprimirLista(ArrayList<Tipo> lista){
         for (Tipo obj : lista){
            String l= obj.toString(); 
             System.out.println(l);
         }     
    }  
    public static <Tipo> void imprimirArray(Tipo[] array){
        for(int i=0; i<array.length; i++){
            System.out.println("Elemento [" + i + "]: " + array[i].toString());
        }
    }
    
    public static <Tipo> ArrayList<Tipo> arrayToArrayList(Tipo[] array){
        ArrayList <Tipo> lista= new ArrayList<>();
       for(int i=0; i<array.length; i++){
            lista.add(array[i]);
        } 
       return lista; 
    }
    
 
}
