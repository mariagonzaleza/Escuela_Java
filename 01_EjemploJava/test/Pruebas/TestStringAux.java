/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import ejemplojava.StringAux;
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
public class TestStringAux {
    
    public TestStringAux() {
    }
    
  
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void probandoQuitarEspacios() {
         //System.out.println("Hola");
         //assertTrue(true); 
         //System.out.println("Hola 2");
         //assertTrue(false);
         //System.out.println("Hola 3");
         
         String texto= "En un lugar de la Mancha de cuyo nombre no quiero acordarme";
         String texto2="En un lugar de la Mancha..."; 
         String texto3="     en un    lugar"; 
         
         String resultadoOk= "en un LUGAR"; 
         String resultadoAux= ""; 
         assertEquals(resultadoOk, resultadoAux); 
         StringAux texto3SinEsp = new StringAux(texto3); 
         resultadoAux= texto3SinEsp.getStr(); 
         assertEquals(resultadoOk, resultadoAux); 
         
        }
       
}

