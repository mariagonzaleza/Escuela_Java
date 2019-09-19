/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import ejemplojava.*;
import POO.*; 
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
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
public class TestSet {
    
    public TestSet() {
    }
    
   
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void sets(){
     //Test Sets Java
        HashSet<Coche> coches = new HashSet<>();
        Coche c1= new Coche("4523HKX", "Fiat", 40, (float)35.5, true,"AZUL", Coche.TipoCarburante.GASOLINA); 
        Coche c2 = new Coche("4724FVG", "Ford", 70, (float)45.2, true, "PLATEADO", Coche.TipoCarburante.DIESEL);
        coches.add(c1); 
        coches.add(c2);
        
        //No podemos añadir 2 veces el mismo elemento...
        
         System.out.println(coches);
         assertEquals(coches.size(), 2); 
         //Los sets se recorren for each........
         
     }
     @Test
     public void hashMapTest(){
         HashMap<String,Boolean> coloresCalidos = new HashMap<>(); 
         coloresCalidos.put("BLANCO", Boolean.FALSE); 
         coloresCalidos.put("ROJO", Boolean.TRUE); 
         coloresCalidos.put("AMARILLO", Boolean.TRUE); 
         coloresCalidos.put("VERDE", false); 
         coloresCalidos.put("AZUL", Boolean.FALSE); 
         
         if(coloresCalidos.get("ROJO")){
             System.out.println("Rojo es cálido");
         }
         if(coloresCalidos.get("AZUL")){
             System.out.println("AXUL es cálido");
         }
         //CLAVES SON AZUL ROJO BLANCO VALORES TRUE FALSE
         System.out.println("VERDE es: " + coloresCalidos.get("VERDE"));
         //RECORRER UN MAP 
         for(Map.Entry<String, Boolean> par: coloresCalidos.entrySet()){
             System.out.println("Clave: " + par.getKey());
             System.out.println("Valor: " + par.getValue());
         }
         assertEquals(coloresCalidos.get("AZUL"), false);
         assertEquals(coloresCalidos.size(), 5); 
         TreeMap<String,Coche> mapCoches = new TreeMap<>(); 
         Coche c1= new Coche("4523HKX", "Fiat", 40, (float)35.5, true,"AZUL", Coche.TipoCarburante.GASOLINA);
         Coche c2 = new Coche("4724FVG", "Ford", 70, (float)45.2, true, "PLATEADO", Coche.TipoCarburante.DIESEL);
         mapCoches.put(c1.getMatricula(), c1); 
         mapCoches.put(c2.getMatricula(), c2); 
         for(Map.Entry<String, Coche> c: mapCoches.entrySet()){
             System.out.println("Clave: " + c.getKey());
             System.out.println("Valor: " + c.getValue());
         }
         
         
     }
}
