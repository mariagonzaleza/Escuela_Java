/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojava;

import pkg.ProbandoString;


/**
 *
 * @author María Alejandra
 */


public class Main {

    /**
     * @param args the command line arguments
     */
    /*    public static void vaciarDeposito (Coche c){
        c.nivel_deposito= 3; 
        System.out.println("Deposito vaciado de: " + c.marca + "\n Nivel: " + c.nivel_deposito );
    }*/
     public static void main(String[] args) {
         ProbandoString.tratarCadena();
     }
    public static void main2(String[] args) {
        
        System.out.println("Empezando POO");
        Coche miCoche; 
        
        
        miCoche= new Coche("Ford", Coche.TipoCarburante.GASOLINA , Coche.TipoColor.AZUL); 
  
        
        System.out.println("Marca de Vehículo: " +  miCoche.getMarca());
        System.out.println("Nº Ruedas: " + miCoche.getRuedas());
        System.out.println("Capacidad Depósito: " + miCoche.getLitros_deposito() + " litros");
        System.out.println("¿Es de Gasolina?: " + miCoche.getCarburante() + "\n");
        
        Coche otroCoche; 

        otroCoche= new Coche("Mercedes",Coche.TipoCarburante.DIESEL , "PLATEADO"); 
  /*      otroCoche.marca="Mercedes"; 
        otroCoche.ruedas=4; 
        otroCoche.litros_deposito=80; 
        otroCoche.esgasolina=false; 
        otroCoche.setNivel(50.0f);
   */    
        System.out.println("Marca de Vehículo: " +  otroCoche.getMarca());
        System.out.println("Nº Ruedas: " + otroCoche.getRuedas());
        System.out.println("Capacidad Depósito: " + otroCoche.getLitros_deposito()+ " litros");
        System.out.println("¿Es de Gasolina?: " + otroCoche.getCarburante());
        System.out.println("Color: " + otroCoche.getColores() + "\n");
        
        /*Otra manera de indicar variables es usar punteros: Cuando usamos variables normales
        new Calcula la memoria y la reserva, Si usamos punteros reservamos memoria nosotros*/
        /*Coche Coche3; 
        Coche3= miCoche; 
        System.out.println("Nivel depósito: " + Coche3.getNivelGasolina());//Va a valer lo mismo que el deposito mi coche.*/
       
        
        /*Si usamos una funcion directamente del main la ponemos static*/ 
        /*Si usamos la funcion de una clase (metodo) usamos this*/ 
        miCoche.vaciarDeposito(miCoche);
        
        miCoche.arrancado=true; 
        //Comprobacion 
        for(int i=0; i<5; i++){
            
            miCoche.acelerar();
            miCoche.mostrarEstado();
        }
        
        CocheRally cocheRally;
        String datosCocheRally; 
        
        cocheRally= new CocheRally("Supra", Coche.TipoCarburante.GASOLINA, "ROJO", 5.2f);
        cocheRally.setNivel(90);
        cocheRally.setArrancado(true); 
        cocheRally.acelerar();
        System.out.println("Marca de Vehículo: " +  cocheRally.getMarca());
        datosCocheRally=cocheRally.toString();
        System.out.println(datosCocheRally);
        
        Coche supraNormal= cocheRally; 
        //Conversion Implicita. Al reves no se puede. Un hijo puede tener la forma de su padre. 
        supraNormal.explosionCilindro();
        
        CocheRally cr = (CocheRally)supraNormal; 
        System.out.println("El Rozamiento es de: " + cr.getRozamiento());
        
        
         
        
        
    }
    
}
