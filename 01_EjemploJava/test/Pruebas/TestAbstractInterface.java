/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import POO.*; 
import ejemplojava.*; 
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class TestAbstractInterface {
    
 
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
            @Test
            public void abstractos() {
       //     Vehiculo miVehiculo = new Vehiculo("3818",(byte)2, "Harley", 40, 35.5f, true) {
       //         @Override
       //         public void abrirPuerta() {
       //             System.out.println("Abriendo Puertas..."); //To change body of generated methods, choose Tools | Templates.
       //         }
       //         @Override 
       //         public void acelerar() {
       //             System.out.println("Acelerando vehiculo..."); //To change body of generated methods, choose Tools | Templates.
       //         }
               System.out.println("Probando....");
               Coche hola = new Coche("4523HKX", "Fiat", 40, (float)35.5, true,"AZUL", Coche.TipoCarburante.GASOLINA);
               hola.abrirPuerta();
               System.out.println(hola.toString());
               System.out.println(hola.getMatricula());
               hola.moverse();
               ArrayList <Rodable> cosasQueRuedan = new ArrayList<>(); 
               cosasQueRuedan.add(hola); 
               cosasQueRuedan.add(hola); 
                System.out.println(cosasQueRuedan.toString()); 
               for(Rodable rod : cosasQueRuedan){
                   rod.moverse(); 
               
               
               }
                //Probar 
                
            };
     
     
     
//     Vehiculo miCocheRally = new CocheRally("Rally");
//     miVehiculo.abrirPuerta();
    
     //miCocheRally.abrirPuerta();
      
    
     //miCoche.acelerar();
     //miCocheRally.acelerar();
    
}

